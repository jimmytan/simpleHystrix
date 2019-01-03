package wenjun.simpleHystrix.circuit

data class CircuitStatistic(var createdAt: Long, var timeOut: Int = 0, var failedRequest: Int = 0, var totalRequest: Int = 0)