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
      <h2
        style={{
          height: "28px",
          lineHeight: "28px",
          fontWeight: "bold",
          color: "#43474a",
          fontSize: "15px"
        }}
      >
        <strong style={{ color: "#ff0000" }}>HOT</strong> PRICE
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
