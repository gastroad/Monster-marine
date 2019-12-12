import React from "react"

const ProductItem = () => {
  return (
    <div style={{ width: "166px" }}>
      <div
        style={{
          textAlign: "center",
          marginBottom: "10px"
        }}
      >
        <img
          style={{ width: "140px" }}
          src={require("../../../assets/img/test3.jpg")}
        />
      </div>
      <div style={{ width: "140px", textAlign: "center" }}>
        <div>
          <a
            style={{
              display: "inline-block",
              color: "#909090",
              fontSize: "12px",
              padding: "0 0 3px 0"
            }}
          >
            스네이크헤드 370KIB + 선외기 보트풀세트 / 에어매트 고무보트
            선외기세트
          </a>
        </div>
        <a style={{ display: "inline-block", color: "#909090" }}>
          <span style={{ fontSize: "11px" }}>2,910,000원</span>
        </a>
        <div style={{ paddingBottom: "3px" }}>
          <a
            style={{
              display: "inline-block",
              color: "#222222",
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
        <div>
          <img src={require("../../../assets/img/product1.gif")} />
          <img src={require("../../../assets/img/product2.gif")} />
          <img src={require("../../../assets/img/product3.gif")} />
        </div>
      </div>
    </div>
  )
}
export default ProductItem
