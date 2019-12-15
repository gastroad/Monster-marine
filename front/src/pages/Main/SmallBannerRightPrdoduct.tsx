import React from "react"

const SmallBannerRightPrdoduct = () => {
  return (
    <>
      <div
        style={{
          textAlign: "center",
          margin: "20px 0px 10px 0px"
        }}
      >
        <img
          style={{ width: "108px" }}
          src={require("../../../assets/img/test3.jpg")}
        />
      </div>
      <div
        style={{
          width: "108px",
          textAlign: "center",
          margin: "0px auto"
        }}
      >
        <div>
          <a
            style={{
              display: "inline-block",
              color: "#909090",
              fontSize: "11px",
              margin: "0 0 3px 0",
              letterSpacing: "-0.5px",
              width: "108px",
              overflow: "hidden",
              textOverflow: "ellipsis",
              whiteSpace: "nowrap"
            }}
          >
            스네이크헤드 370KIB + 스네이크헤드 370KIB +
          </a>
        </div>
        <div style={{ padding: "2px", height: "22px" }}>
          <a
            style={{
              display: "inline-block",
              color: "#222",
              fontWeight: "bold",
              padding: "0px 0px 3px 0px"
            }}
          >
            <b
              style={{
                fontSize: "11px"
              }}
            >
              2,540,000원
            </b>
          </a>
        </div>
      </div>
    </>
  )
}

export default SmallBannerRightPrdoduct
