import React from "react"
import ProductItem from "@components/ProductItem"
import { Pagination } from "@components/Pagination/Pagination"

const Content = () => {
  const test = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
  return (
    <div className={"product-list-content"}>
      <fieldset style={{ textAlign: "right" }}>
        <select
          style={{ width: "120px", fontSize: "12px", marginRight: "10px" }}
        >
          <option>상품 정렬 옵션</option>
          <option>상품 가격 오름차순</option>
          <option>상품 가격 내림차순</option>
          <option>최신 등록 오름차순</option>
          <option>최신 등록 내림차순</option>
        </select>
        <select style={{ width: "120px", fontSize: "12px" }}>
          <option>15개씩 보기</option>
          <option>30개씩 보기</option>
          <option>50개씩 보기</option>
        </select>
      </fieldset>
      <div style={{ marginTop: "20px" }}>
        <ul>
          {test.map((res, index) => {
            return (
              <li
                key={index}
                style={{
                  display: "inline-block",
                  padding: "0px 16.2px 25px 16.2px "
                }}
              >
                <ProductItem />
              </li>
            )
          })}
        </ul>
        <Pagination
          totalPages={6}
          currentPage={1}
          changeCurrentPage={() => {}}
        />
      </div>
    </div>
  )
}
export default Content
