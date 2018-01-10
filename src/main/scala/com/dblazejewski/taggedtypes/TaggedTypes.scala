package com.dblazejewski.taggedtypes

import java.time.LocalDate

case class Booking(id: String, date: LocalDate)

case class Payment(id: String, bookingId: String, date: LocalDate)

object TaggedTypes {
  val booking1 = Booking("bookingId1", LocalDate.now)
  val booking2 = Booking("bookingId2", LocalDate.now)

  val payment1 = Payment("paymentId1", booking1.id, LocalDate.now)
  val payment2 = Payment("paymentId2", booking2.id, LocalDate.now)

  val bookingPaymentMapping: Map[String, String] = Map(booking1.id -> payment1.id, booking2.id -> payment2.id)
}
