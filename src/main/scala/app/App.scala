package app

import scala.scalajs.js
import scala.scalajs.js.annotation.*

import org.scalajs.dom


@main
def App() =
  dom.document.querySelector("#app").innerHTML = s"""
    <div>
      <p>hello :)</p>
    <div>
  """
