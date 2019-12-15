import React from "react"

const Header = () => {
  return (
    <div className={"product-list-header"}>
      <div className="product-list-header-top">
        <p className="product-list-header-top-category-name">+ 고무보트</p>
        <p className="product-list-header-top-category-path">
          HOME > 고무보트 > 스네이크헤드
        </p>
      </div>
      <div className="product-list-header-bottom">
        <ul>
          <li style={{ fontWeight: "bold" }}>+ SNAKEHEAD (53)</li>
          <li>+ SNAKEHEAD (53)</li>
          <li>+ SNAKEHEAD (53)</li>
          <li>+ SNAKEHEAD (53)</li>
          <li>+ SNAKEHEAD (53)</li>
          <li>+ SNAKEHEAD (53)</li>
        </ul>
      </div>
    </div>
  )
}
export default Header
