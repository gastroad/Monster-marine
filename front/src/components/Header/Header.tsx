import React from "react"
import "./Header.scss"

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
              <div
                style={{
                  width: "33px",
                  height: "25px",
                  outline: "3px solid black",
                  display: "flex",
                  justifyContent: "center"
                }}
              >
                <img
                  style={{
                    width: "25px"
                  }}
                  src={require("../../../assets/img/search.png")}
                />
              </div>
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
              </colgroup>
              <tbody>
                <tr>
                  <td>전체 카테고리</td>
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
