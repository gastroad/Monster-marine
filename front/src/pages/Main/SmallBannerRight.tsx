import React from "react"
import SmallBannerRightPrdoduct from "./SmallBannerRightPrdoduct"
const SmallBannerRight = () => {
  return (
    <div
      style={{
        width: "675px",
        height: "100%"
      }}
    >
      <h2
        style={{
          height: "28px",
          lineHeight: "28px",
          fontWeight: "bold",
          color: "#43474a",
          fontSize: "15px"
        }}
      >
        <strong style={{ color: "#ff0000" }}>WEEKLY</strong> BEST
      </h2>
      <div>
        <div
          style={{
            height: "37px",
            textAlign: "center",
            letterSpacing: "-1px",
            outline: "2px solid #8b8e90"
          }}
        >
          <div
            style={{
              display: "inline",
              height: "37px",
              lineHeight: "35px",
              fontSize: "12px",
              cursor: "pointer",
              padding: "0 30px",
              color: "#666666",
              fontWeight: "bold"
            }}
          >
            보트
          </div>
          <div
            style={{
              display: "inline",
              height: "37px",
              lineHeight: "35px",
              fontSize: "12px",
              cursor: "pointer",
              padding: "0 30px",
              color: "#666666",
              fontWeight: "bold"
            }}
          >
            콤비보트
          </div>
          <div
            style={{
              display: "inline",
              height: "37px",
              lineHeight: "35px",
              fontSize: "12px",
              cursor: "pointer",
              padding: "0 30px",
              color: "#666666",
              fontWeight: "bold"
            }}
          >
            선외기
          </div>
          <div
            style={{
              display: "inline",
              height: "37px",
              lineHeight: "35px",
              fontSize: "12px",
              cursor: "pointer",
              padding: "0 30px",
              color: "#666666",
              fontWeight: "bold"
            }}
          >
            가이드모터
          </div>
          <div
            style={{
              display: "inline",
              height: "37px",
              lineHeight: "35px",
              fontSize: "12px",
              cursor: "pointer",
              padding: "0 30px",
              color: "#666666",
              fontWeight: "bold"
            }}
          >
            어탐기/GPS
          </div>
          <div
            style={{
              display: "inline",
              height: "37px",
              lineHeight: "35px",
              fontSize: "12px",
              cursor: "pointer",
              padding: "0 30px",
              color: "#666666",
              fontWeight: "bold"
            }}
          >
            기타
          </div>
        </div>
        <div
          style={{
            width: "630px",
            height: "210px",
            marginLeft: "25px",
            position: "relative",
            overflow: "hidden"
          }}
        >
          <table
            style={{
              width: "630px",
              height: "206px"
            }}
          >
            <colgroup>
              <col width="*" />
              <col width="*" />
              <col width="*" />
              <col width="*" />
              <col width="*" />
            </colgroup>
            <tbody>
              <tr>
                <td>
                  <SmallBannerRightPrdoduct />
                </td>
                <td>
                  <SmallBannerRightPrdoduct />
                </td>
                <td>
                  <SmallBannerRightPrdoduct />
                </td>
                <td>
                  <SmallBannerRightPrdoduct />
                </td>
                <td>
                  <SmallBannerRightPrdoduct />
                </td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  )
}

export default SmallBannerRight
