import React from "react"

import { API } from "@components/axios"
import ProductList from "./ProductList"
import MainBanner from "./MainBanner"
import SmallBanner from "./SmallBanner"

import "./Main.scss"
const Main = () => {
  React.useEffect(() => {
    API.get("/category/").then(res => {})
  }, [])

  return (
    <section
      style={{
        width: "1000px",
        display: "inline-block"
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
      </article>
    </section>
  )
}
export default Main
