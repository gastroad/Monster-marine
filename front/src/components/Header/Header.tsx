import React from "react"

const Header = () => {
  return (
    <header>
      <div
        style={{
          height: "24px",
          background: "#f8f8f8",
          borderBottom: "1px solid #e3e3e3",
          textAlign: "center"
        }}
      ></div>
      <div className={"main-header-wrapper"}>
        <div className={"main-header"}>
          <img
            className={"main-header-logo"}
            src={require("../../../assets/img/logo.png")}
          />
          <div className={"main-header-search-wrapper"}>
            <span className={"main-header-search"}>
              <input placeholder="스네이크헤드" />
              <img src={require("../../../assets/img/test9.jpg")} />
            </span>
          </div>
        </div>
        <nav>
          <div className={"main-header-navigator"}>
            <table>
              <colgroup>
                <col width="190px" />
                <col width="*" />
                <col width="*" />
                <col width="*" />
                <col width="*" />
                <col width="*" />
                <col width="*" />
                <col width="*" />
                <col width="*" />
                <col width="*" />
                <col width="*" />
              </colgroup>
              <tbody>
                <tr>
                  <td>전체 카테고리</td>
                  <td>자주찾는 품목</td>
                  <td>브랜드 보기</td>
                  <td>고무보트</td>
                  <td>콤비보트</td>
                  <td>선외기</td>
                  <td>가이드모터</td>
                  <td>어탐기</td>
                  <td>트레일러</td>
                  <td>견인장치</td>
                  <td>게시판 목록</td>
                </tr>
              </tbody>
            </table>
          </div>
        </nav>
      </div>
    </header>
  )
}
export default Header
