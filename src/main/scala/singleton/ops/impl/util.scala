package singleton.ops.impl

object nlz { //number of leading zeros
  def apply(value : Int) : Int = java.lang.Integer.numberOfLeadingZeros(value)
  def apply(value : Long) : Int = java.lang.Long.numberOfLeadingZeros(value)
}

object _require {
  @inline def apply(requirement: Boolean, message: => Any) = require(requirement, message)
}
