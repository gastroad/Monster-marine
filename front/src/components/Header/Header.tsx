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
      >
        즐겨찾기
      </div>

      <div
        style={{
          height: "168px",
          width: "100%",
          textAlign: "center",
          margin: "0 0 15px 0"
        }}
      >
        <div
          style={{
            height: "108px",
            width: "1200px",
            margin: "0 auto",
            position: "relative"
          }}
        >
          <img
            style={{
              width: "227px",
              height: "98px"
            }}
            src={require("../../../assets/img/logo.png").default}
          />
          <div style={{ position: "absolute", right: "0px", top: "78px" }}>
            <span
              style={{
                display: "inline-block",
                border: "3px solid #ff0000",
                width: "342px"
              }}
            >
              <input
                style={{
                  width: "300px",
                  lineHeight: "22px",
                  height: "22px",
                  border: "none",
                  background: "none",
                  marginLeft: "5px"
                }}
                placeholder="스네이크헤드"
              />
              <div></div>
            </span>
          </div>
        </div>
        <div
          style={{
            margin: "20px 0 0px 0",
            border: "0px",
            height: "40px"
          }}
        >
          <div
            style={{
              width: "1200px",
              margin: "0 auto",
              position: "relative",
              zIndex: 90,
              height: "100%"
            }}
          >
            <table style={{ width: "100%", height: "100%" }}>
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
                  <td
                    style={{
                      background: "#ff0000",
                      borderRight: "1px solid black",
                      color: "white",
                      fontWeight: "bold",
                      boxSizing: "border-box",
                      letterSpacing: "-1px",
                      fontSize: "11px"
                    }}
                  >
                    전체 카테고리
                  </td>
                  <td
                    style={{
                      background: "#ff0000",
                      borderRight: "1px solid black",
                      color: "white",
                      fontWeight: "bold",
                      boxSizing: "border-box",
                      letterSpacing: "-1px",
                      fontSize: "11px"
                    }}
                  >
                    자주찾는 품목
                  </td>
                  <td
                    style={{
                      background: "#ff0000",
                      borderRight: "1px solid black",
                      color: "white",
                      fontWeight: "bold",
                      boxSizing: "border-box",
                      letterSpacing: "-1px",
                      fontSize: "11px"
                    }}
                  >
                    브랜드 보기
                  </td>
                  <td
                    style={{
                      background: "#ff0000",
                      borderRight: "1px solid black",
                      color: "white",
                      fontWeight: "bold",
                      boxSizing: "border-box",
                      letterSpacing: "-1px",
                      fontSize: "11px"
                    }}
                  >
                    고무보트
                  </td>
                  <td
                    style={{
                      background: "#ff0000",
                      borderRight: "1px solid black",
                      color: "white",
                      fontWeight: "bold",
                      boxSizing: "border-box",
                      letterSpacing: "-1px",
                      fontSize: "11px"
                    }}
                  >
                    콤비보트
                  </td>
                  <td
                    style={{
                      background: "#ff0000",
                      borderRight: "1px solid black",
                      color: "white",
                      fontWeight: "bold",
                      boxSizing: "border-box",
                      letterSpacing: "-1px",
                      fontSize: "11px"
                    }}
                  >
                    선외기
                  </td>
                  <td
                    style={{
                      background: "#ff0000",
                      borderRight: "1px solid black",
                      color: "white",
                      fontWeight: "bold",
                      boxSizing: "border-box",
                      letterSpacing: "-1px",
                      fontSize: "11px"
                    }}
                  >
                    가이드모터
                  </td>
                  <td
                    style={{
                      background: "#ff0000",
                      borderRight: "1px solid black",
                      color: "white",
                      fontWeight: "bold",
                      boxSizing: "border-box",
                      letterSpacing: "-1px",
                      fontSize: "11px"
                    }}
                  >
                    어탐기
                  </td>
                  <td
                    style={{
                      background: "#ff0000",
                      borderRight: "1px solid black",
                      color: "white",
                      fontWeight: "bold",
                      boxSizing: "border-box",
                      letterSpacing: "-1px",
                      fontSize: "11px"
                    }}
                  >
                    트레일러
                  </td>
                  <td
                    style={{
                      background: "#ff0000",
                      borderRight: "1px solid black",
                      color: "white",
                      fontWeight: "bold",
                      boxSizing: "border-box",
                      letterSpacing: "-1px",
                      fontSize: "11px"
                    }}
                  >
                    견인장치
                  </td>
                  <td
                    style={{
                      background: "#ff0000",
                      borderRight: "1px solid black",
                      color: "white",
                      fontWeight: "bold",
                      boxSizing: "border-box",
                      letterSpacing: "-1px",
                      fontSize: "11px"
                    }}
                  >
                    게시판 목록
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </header>
  )
}
export default Header
