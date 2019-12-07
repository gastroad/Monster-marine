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

import "./index.scss"

const App = () => {
  return (
    <Router>
      <>
        <div
          style={{
            width: "1200px",
            margin: "0 auto"
          }}
        >
          <Header />
          <>
            <div id="root-modal" />
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
        <Footer />
      </>
    </Router>
  )
}
export default App
