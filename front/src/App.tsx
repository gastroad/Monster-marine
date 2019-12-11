import React from "react"

import Main from "./pages/Main"
import {
  BrowserRouter as Router,
  Redirect,
  Route,
  Switch
} from "react-router-dom"

import Header from "./components/Header"
import Footer from "./components/Footer"
import SubMenu from "./components/SubMenu"

import "./index.scss"

const App = () => {
  return (
    <Router>
      <>
        <div id="root-modal" />
        <div>
          <Header />
          <div
            style={{
              width: "1200px",
              margin: "0px auto",
              display: "flex",
              justifyContent: " space-between"
            }}
          >
            <SubMenu />
            <>
              <Switch>
                <Route path="/main" component={Main} />
                <Route
                  path="/test"
                  component={() => {
                    return <div>test</div>
                  }}
                />
                <Redirect to="/main" />
              </Switch>
            </>
          </div>
        </div>
        <Footer />
      </>
    </Router>
  )
}
export default App
