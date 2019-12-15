import React from "react"
const MainBanner = () => {
  return (
    <div className="main-banner">
      <div className="main-banner-left">
        <div className="main-banner-left-img-wrapper">
          <img
            style={{ width: "100%", height: "413px" }}
            src={require("../../../assets/img/test.jpg")}
          />
        </div>
        <div className="main-banner-left-img-changer">
          <div
            className="main-banner-left-img-changer-button"
            style={{ backgroundColor: "black" }}
          >
            01
          </div>
          <div className="main-banner-left-img-changer-button">02</div>
          <div className="main-banner-left-img-changer-button">03</div>
          <div className="main-banner-left-img-changer-button">04</div>
          <div className="main-banner-left-img-changer-button">05</div>
        </div>
      </div>
    </div>
  )
}
export default MainBanner
