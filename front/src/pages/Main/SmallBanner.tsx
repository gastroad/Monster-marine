import React from "react"
import SmallBannerLeft from "./SmallBannerLeft"
import SmallBannerRight from "./SmallBannerRight"

const SmallBanner = () => {
  return (
    <div
      style={{
        height: "260px",
        display: "flex",
        justifyContent: "space-bewteen"
      }}
    >
      <SmallBannerLeft />
      <SmallBannerRight />
    </div>
  )
}
export default SmallBanner
