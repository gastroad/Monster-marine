import React from "react"

const SmallBannerLeft = () => {
  console.log(require("../../../assets/img/test7.jpg"))
  return (
    <div
      style={{
        width: "325px",
        height: "100%"
      }}
    >
      <h2 className={"h2-sub-header"}>
        <strong>HOT</strong> PRICE
      </h2>
      <div style={{ marginBottom: "10px" }}>
        <img src={require("../../../assets/img/test7.jpg")} />
      </div>
      <div>
        <img src={require("../../../assets/img/test7.jpg")} />
      </div>
    </div>
  )
}
export default SmallBannerLeft
