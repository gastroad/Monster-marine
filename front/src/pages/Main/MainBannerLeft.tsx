import React from "react"

const MainBannerLeft = () => {
  return (
    <div className="main-banner-left">
      <div className="main-banner-left-img-wrapper">
        <img src={require("../../../assets/img/test.jpg")} />
      </div>
      <div className="main-banner-left-img-changer">
        <div className="main-banner-left-img-changer-button">01</div>
        <div className="main-banner-left-img-changer-button">02</div>
        <div className="main-banner-left-img-changer-button">03</div>
        <div className="main-banner-left-img-changer-button">04</div>
        <div className="main-banner-left-img-changer-button">05</div>
      </div>
    </div>
  )
}
export default MainBannerLeft
