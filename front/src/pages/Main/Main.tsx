import React from "react"
import ProductList from "./ProductList"
import MainBanner from "./MainBanner"
import SmallBanner from "./SmallBanner"
const Main = () => {
  return (
    <section
      style={{
        width: "1000px",
        display: "inline-block",
        height: "3200px"
      }}
    >
      <article id="main">
        <MainBanner />
        <SmallBanner />
        <div
          style={{
            padding: "40px 0 10px 0",
            height: "246px"
          }}
        >
          <img src={require("../../../assets/img/test6.jpg")} />
        </div>
        <ProductList />
        <ProductList />
        <ProductList />
      </article>
    </section>
  )
}
export default Main
