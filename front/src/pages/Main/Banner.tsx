import React from "react"

const Pannel = () => {
  return (
    <div className={"Banner"}>
      <img
        src={require("../../../assets/img/test.jpg").default}
        style={{
          height: "480px",
          width: "100%"
        }}
      />
    </div>
  )
}
export default Pannel
