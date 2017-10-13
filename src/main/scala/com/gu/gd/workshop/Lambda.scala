package com.gu.gd.workshop

import com.typesafe.scalalogging.LazyLogging

object Lambda extends LazyLogging {

  def handler(): String = {
    "hello world!"
  }
}
