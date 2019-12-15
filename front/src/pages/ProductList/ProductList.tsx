import React from "react"

import Header from "./Header"
import Content from "./Content"

import "./ProductList.scss"

const ProdcutList = () => {
  return (
    <section
      style={{
        width: "1000px",
        display: "inline-block"
      }}
    >
      <article id="product-list">
        <Header />
        <Content />
      </article>
    </section>
  )
}
export default ProdcutList
