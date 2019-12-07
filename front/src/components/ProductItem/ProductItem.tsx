import React from "react"

const ProductItem = () => {
  return (
    <div className="prodcut-item">
      <img src={require("../../../assets/img/test2.jpg").default} />
      <div
        style={{
          marginTop: "5px"
        }}
      >
        <p
          style={{
            fontSize: "8px",
            maxWidth: "184px",
            textAlign: "center",
            padding: "0px 8px"
          }}
        >
          오디세이 에어데크240 고무보트 + 혼다/도하츠 선외기 / 보트세트상품 /
          낚시용 레져용 보트
        </p>
        <p
          style={{
            fontWeight: "bold",
            textAlign: "center",
            margin: "10px 0px"
          }}
        >
          100000000000원
        </p>
      </div>
    </div>
  )
}
export default ProductItem
