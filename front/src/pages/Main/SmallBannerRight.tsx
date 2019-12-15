import React from "react"
import SmallBannerRightPrdoduct from "./SmallBannerRightPrdoduct"
const SmallBannerRight = () => {
  return (
    <div className="small-banner-right">
      <h2 className={"h2-sub-header"}>
        <strong>WEEKLY</strong> BEST
      </h2>
      <div
        style={{
          outline: " 1px solid #8b8e90"
        }}
      >
        <div className="small-banner-right-menu">
          <div className="small-banner-right-menu-tab" style={{ color: "black" }}>
            보트
          </div>
          <div className="small-banner-right-menu-tab">콤비보트</div>
          <div className="small-banner-right-menu-tab">선외기</div>
          <div className="small-banner-right-menu-tab">가이드모터</div>
          <div className="small-banner-right-menu-tab">어탐기/GPS</div>
          <div className="small-banner-right-menu-tab">기타</div>
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
