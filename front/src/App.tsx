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
      <div
        style={{
          margin: "24px 60px 60px",
        }}
      >
        <Header />
        <>
          <div id="root-modal" />
          <Switch>
            <Route path="/main" component={Main} />
            <Redirect to="/main" />;
          </Switch>
        </>
        <Footer />
      </div>
    </Router>
  )
}
export default App
