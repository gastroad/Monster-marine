import React from "react"
import ProductList from "./ProductList"
import { API } from "@components/axios"
const Main = () => {
  // React.useEffect(() => {
  //   API.get(`/notice`).then(res => {
  //     console.log(res)
  //   })
  // }, [])

  return (
    <section
      style={{
        width: "1000px",
        outline: "1px solid blue",
        display: "inline-block",
        height: "3667px"
      }}
    >
      <article id="main">
        <div
          style={{
            height: "442px",
            marginBottom: "40px",
            display: "flex",
            justifyContent: "space-between"
          }}
        >
          <div
            style={{
              width: "611px",
              height: "100%"
            }}
          >
            <div
              style={{
                width: "100%",
                height: "413px"
              }}
            >
              <img src={require("../../../assets/img/test.jpg").default} />
            </div>
            <div
              style={{
                borderTop: "1px solid #dfdfdf",
                height: " 28px",
                background: "#5b5f63",
                display: "flex",
                justifyContent: "space-between"
              }}
            >
              <div
                style={{
                  width: "122px",
                  background: "#5b5f63",
                  height: "28px",
                  lineHeight: "26px",
                  color: "#ffffff",
                  textAlign: "center",
                  fontSize: "11px",
                  cursor: "pointer"
                }}
              >
                01
              </div>
              <div
                style={{
                  width: "122px",
                  background: "#5b5f63",
                  height: "28px",
                  lineHeight: "26px",
                  color: "#ffffff",
                  textAlign: "center",
                  fontSize: "11px",
                  cursor: "pointer"
                }}
              >
                02
              </div>
              <div
                style={{
                  width: "122px",
                  background: "#5b5f63",
                  height: "28px",
                  lineHeight: "26px",
                  color: "#ffffff",
                  textAlign: "center",
                  fontSize: "11px",
                  cursor: "pointer"
                }}
              >
                03
              </div>
              <div
                style={{
                  width: "122px",
                  background: "#5b5f63",
                  height: "28px",
                  lineHeight: "26px",
                  color: "#ffffff",
                  textAlign: "center",
                  fontSize: "11px",
                  cursor: "pointer"
                }}
              >
                04
              </div>
              <div
                style={{
                  width: "122px",
                  background: "#5b5f63",
                  height: "28px",
                  lineHeight: "26px",
                  color: "#ffffff",
                  textAlign: "center",
                  fontSize: "11px",
                  cursor: "pointer"
                }}
              >
                05
              </div>
            </div>
          </div>
          <div
            style={{
              width: "387px",
              height: "100%",
              backgroundColor: "gold"
            }}
          >
            배너 오른쪽
          </div>
        </div>
        <div
          style={{
            height: "260px"
          }}
        >
          <div
            style={{
              width: "325px",
              display: "inline-block",
              backgroundColor: "red",
              height: "100%"
            }}
          >
            스몰배너 사진
          </div>
          <div
            style={{
              width: "675px",
              display: "inline-block",
              backgroundColor: "blue",
              height: "100%"
            }}
          >
            스몰배너 오른쪽
          </div>
        </div>
        <div
          style={{
            padding: "40px 0 10px 0",
            backgroundColor: "green",
            height: "246px"
          }}
        >
          asd
        </div>
        <ProductList />
        <ProductList />
        <ProductList />
      </article>
    </section>
  )
}
export default Main
