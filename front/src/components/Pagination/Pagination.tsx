import cx from "classnames"
import * as React from "react"
import "./Pagination.scss"

interface PropsType {
  totalPages: number
  currentPage: number
  changeCurrentPage: (number: number) => void
  wapperStyle?: any
}

export const Pagination: React.FunctionComponent<PropsType> = props => {
  const renderPageNumbers = () => {
    let array
    if (props.totalPages < 6) {
      array = [...new Array(props.totalPages)]
    } else {
      array = [...new Array(5)]
    }
    let plus = 1
    for (let i = 3; props.currentPage > i; i++) {
      if (props.totalPages > 2 + i) {
        ++plus
      }
    }
    // 숫자를 랜더링 해주는 로직 index는 0부터 4까지 고정이고 plus 가 숫자를 더해줘서 현제페이지에 맞게 숫자를 랜더링해준다
    return array.map((undef, index) => (
      <a
        key={index}
        onClick={() => {
          props.changeCurrentPage(index + plus)
        }}
        className={cx({ on: index + plus == props.currentPage })}
      >
        {index + plus}
      </a>
    ))
  }

  let next: number, prev: number
  if (props.currentPage == props.totalPages) {
    next = props.totalPages
  } else {
    next = props.currentPage + 1
  }

  if (props.currentPage == 1) {
    prev = 1
  } else {
    prev = props.currentPage - 1
  }
  return !props.totalPages ? (
    <p className="pagination" />
  ) : (
    <p className="pagination" style={props.wapperStyle}>
      <a
        onClick={() => {
          props.changeCurrentPage(prev)
        }}
      >
        <img
          src={require("../../../assets/img/paging2.png").default}
          alt="처음"
        />
      </a>
      <span>{renderPageNumbers()}</span>
      <a
        onClick={() => {
          props.changeCurrentPage(next)
        }}
      >
        <img
          src={require("../../../assets/img/paging3.png").default}
          alt="처음"
        />
      </a>
    </p>
  )
}
