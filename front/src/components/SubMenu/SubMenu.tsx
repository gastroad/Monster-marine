import React from "react"
import "./subMenu.scss"

const SubMenu = () => {
  return (
    <div className="sub-menu">
      <div style={{ marginBottom: "7px" }}>
        <div
          style={{
            border: "1px solid #ededed",
            background: "#fff",
            position: "relative",
            zIndex: 80
          }}
        >
          <div className="sub-menu-category">CATEGORY MENU</div>
          <div className="sub-menu-category-menu">
            <a>리퍼상품</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>고무보트</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>콤비보트</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>피싱보트</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>보트/요트</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>카탑보트</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>레스큐보트</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>선외기</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>제트스키/수상오토바이</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>바나나/땅콩</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>패들스포츠/래크레이션</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>보트용품</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>수상안전용품</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>가이드 모터</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>어군탐지기/GPS</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>견인장치</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>트레일러</a>
          </div>
          <div className="sub-menu-category-menu">
            <a>루프탑텐트</a>
          </div>
        </div>
      </div>
      <div
        style={{
          border: "1px solid  #ededed",
          marginBottom: "11px"
        }}
      >
        <div style={{ width: "188px" }}>
          <div
            style={{
              borderBottom: "1px solid  #ededed",
              padding: "17px 0px 20px 17px"
            }}
          >
            <div style={{ color: "#444", paddingBottom: "3px" }}>CS CENTER</div>
            <div
              style={{ color: "#ff0000", fontWeight: "bold", fontSize: "12px" }}
            >
              고객상담
            </div>
            <div
              style={{
                fontSize: "19px",
                color: "#444",
                letterSpacing: "-0.5px",
                lineHeight: "34px"
              }}
            >
              031-555-0124
            </div>
            <div style={{ color: "#5f5f5f", fontSize: "11px" }}>
              평 일 08:30 - 18:30 (월-금)
              <br />
              토요일·일요일·공휴일 휴무
            </div>
          </div>
          <div style={{ padding: "17px 0 20px 17px" }}>
            <div style={{ color: "#444", paddingBottom: "3px" }}>BANK</div>
            <div
              style={{ color: "ff0000", fontWeight: "bold", fontSize: "12px" }}
            >
              무통장입금
            </div>
            <div
              style={{
                fontSize: "16px",
                color: "#444",
                letterSpacing: "-0.5px",
                lineHeight: "34px"
              }}
            >
              301-0056-7519-71
            </div>
            <div
              style={{
                fontSize: "16px",
                color: "#444",
                letterSpacing: "-0.5px",
                lineHeight: "34px"
              }}
            >
              010-3265-7084
            </div>
            <div
              style={{
                fontSize: "16px",
                color: "#444",
                letterSpacing: "-0.5px",
                lineHeight: "34px"
              }}
            >
              110-100-782385{" "}
            </div>
            <div style={{ color: "#5f5f5f", fontSize: "11px" }}>
              예금주 / 윤주혁 [보트코리아]
            </div>
          </div>
        </div>
      </div>
    </div>
  )
}
export default SubMenu
