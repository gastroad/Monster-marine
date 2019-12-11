import React from "react"
import SmallBannerLeft from "./SmallBannerLeft"
import SmallBannerRight from "./SmallBannerRight"

const SmallBanner = () => {
  return (
    <div
      style={{
        height: "260px"
      }}
    >
      <SmallBannerLeft />

      <SmallBannerRight />
    </div>
  )
}
export default SmallBanner
