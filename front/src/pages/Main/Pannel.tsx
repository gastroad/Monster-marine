import React from "react"
import ProductItem from "@components/ProductItem"

const Pannel = () => {
  return (
    <div className={"pannel"}>
      <div className="pannel-left">
        <div>
          <ProductItem />
          <ProductItem />
          <ProductItem />
        </div>
      </div>
      <div className="pannel-right">
        <h2 className="notice">공지사항</h2>
        <ul className="notice-list">
          <li>asd</li>
          <li>asd</li>
          <li>asd</li>
          <li>asd</li>
          <li>asd</li>
        </ul>
      </div>
    </div>
  )
}
export default Pannel
