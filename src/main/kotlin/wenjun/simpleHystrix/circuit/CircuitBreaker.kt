package wenjun.simpleHystrix.circuit

interface CircuitBreaker {
  fun isOpen(): Boolean
  fun onSuccess()
  fun onNonSuccess()
}