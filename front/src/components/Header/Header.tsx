import React from "react"

const Header = () => {
  return (
    <>
      <header
        style={{
          display: "flex",
          justifyContent: "space-between",
          marginTop: "24px"
        }}
      >
        <h1>
          <img src={require("../../../assets/img/logo.png").default} />
        </h1>
        <div className="header-input-wrapper">
          <input />
          <div className="search-icon">
            <img src={require("../../../assets/img/search.png").default} />
          </div>
        </div>
      </header>
      <nav
        style={{
          marginBottom: "20px"
        }}
      >
        <div style={{ display: "flex" }}>
          <span className={"nav-list-item"}>전체카테고리</span>
          <span className={"nav-list-item"}>브랜드</span>
          <span className={"nav-list-item"}>전체 상품</span>
        </div>
        <span className={"nav-list-item"}>사용 후기</span>
      </nav>
    </>
  )
}
export default Header
