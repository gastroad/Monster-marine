import React from "react"
import ProductItem from "@components/ProductItem"
import { Pagination } from "@components/Pagination/Pagination"

const Pannel = () => {
  return (
    <div className={"pannel"}>
      <div className="pannel-left">
        <h3>BestSeller</h3>
        <div className="pannel-product-list">
          <ProductItem />
          <ProductItem />
          <ProductItem />
          <ProductItem />
        </div>
      </div>
      <div className="pannel-right">
        <h2 className="notice">공지사항</h2>
        <ul
          className="notice-list"
          style={{
            borderTop: "0.5px solid#d3d2d2"
          }}
        >
          <li>2019.01.12 공지사항</li>
          <li>2019.01.12 공지사항</li>
          <li>2019.01.12 공지사항</li>
          <li>2019.01.12 공지사항</li>
          <li>2019.01.12 공지사항</li>
        </ul>
        <Pagination
          currentPage={1}
          totalPages={6}
          changeCurrentPage={() => {}}
        />
      </div>
    </div>
  )
}
export default Pannel
