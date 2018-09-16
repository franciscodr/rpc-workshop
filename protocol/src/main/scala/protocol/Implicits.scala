package com.fortyseven.protocol

import cats.Show

trait Implicits {
  implicit val catsShowInstanceForSmartHomeAction: Show[SmartHomeAction] =
    new Show[SmartHomeAction] {
      override def show(action: SmartHomeAction): String = s"${action.value}\n"
    }
}

object implicits extends Implicits
