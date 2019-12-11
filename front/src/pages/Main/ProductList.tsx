import React from "react"
import ProductItem from "@components/ProductItem"


const ProductList = () => {
  return (
    <>
      <div>
        <div
          style={{
            margin: "30px 0 20px 0",
            borderBottom: "1px solid #43474a"
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
            <strong style={{ color: "#ff0000" }}>NEW</strong> ARRIVAL{" "}
            <span
              style={{
                fontWeight: "normal",
                color: "#999999",
                fontSize: "12px",
                letterSpacing: "-1px"
              }}
            >
              따끈따끈 신상품
            </span>
          </h2>
        </div>
        <table style={{ width: "100%" }}>
          <colgroup>
            <col width="*" />
            <col width="*" />
            <col width="*" />
            <col width="*" />
            <col width="*" />
            <col width="*" />
          </colgroup>
          <tbody>
            <tr>
              <td style={{ paddingBottom: "25px" }}>
                <ProductItem />
              </td>
              <td style={{ paddingBottom: "25px" }}>
                <ProductItem />
              </td>
              <td style={{ paddingBottom: "25px" }}>
                <ProductItem />
              </td>
              <td style={{ paddingBottom: "25px" }}>
                <ProductItem />
              </td>
              <td style={{ paddingBottom: "25px" }}>
                <ProductItem />
              </td>
              <td style={{ paddingBottom: "25px" }}>
                <ProductItem />
              </td>
            </tr>
            <tr>
              <td style={{ paddingBottom: "25px" }}>
                <ProductItem />
              </td>
              <td style={{ paddingBottom: "25px" }}>
                <ProductItem />
              </td>
              <td style={{ paddingBottom: "25px" }}>
                <ProductItem />
              </td>
              <td style={{ paddingBottom: "25px" }}>
                <ProductItem />
              </td>
              <td style={{ paddingBottom: "25px" }}>
                <ProductItem />
              </td>
              <td style={{ paddingBottom: "25px" }}>
                <ProductItem />
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </>
  )
}

export default ProductList
