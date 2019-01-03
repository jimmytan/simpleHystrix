package wenjun.simpleHystrix.circuit

import java.time.LocalDateTime
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicLong

class CircuitBreakerImpl(var errorThreshold: Int = 5, var timeSlice: Int = 10000) : CircuitBreaker {

  var isCircuitOpen = AtomicBoolean(false)
  var lastOpenTime = AtomicLong()








  override fun isOpen(): Boolean {
    return isCircuitOpen.get()
  }

  override fun onSuccess() {


    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun onNonSuccess() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  enum class Status {
    OPEN, CLOSED, HALF_OPEN
  }
}