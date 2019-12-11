import React from "react"

const MainBannerRight = () => {
  return (
    <div className="main-banner-right">
      <div
        style={{
          width: "194px",
          height: "442px"
        }}
      >
        <div
          style={{
            width: "100%",
            height: "277px"
          }}
        >
          <img src={require("../../../assets/img/test4.jpg").default} />
        </div>
        <div style={{ width: "100%", height: "165px" }}>
          <img src={require("../../../assets/img/test5.jpg").default} />
        </div>
      </div>
      <div
        style={{
          width: "193px",
          height: "442px"
        }}
      >
        <div style={{ width: "100%", height: "277px" }}>
          <img src={require("../../../assets/img/test4.jpg").default} />
        </div>
        <div style={{ width: "100%", height: "165px" }}>
          <img src={require("../../../assets/img/test5.jpg").default} />
        </div>
      </div>
    </div>
  )
}
export default MainBannerRight
