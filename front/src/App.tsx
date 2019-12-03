import React from "react"

import Main from "./pages/Main"
import {
  BrowserRouter as Router,
  Redirect,
  Route,
  Switch
} from "react-router-dom"

import "./index.scss"

const App = () => {
  return (
    <Router>
      <>
        header
        <>
          <div id="root-modal" />
          <Switch>
            <Route path="/main" component={Main} />
            <Redirect to="/" />;
          </Switch>
        </>
      </>
    </Router>
  )
}
export default App
