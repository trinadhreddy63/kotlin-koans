package iii_conventions

data class MyDate(var year: Int, var month: Int, var dayOfMonth: Int)

operator fun MyDate.rangeTo(other: MyDate): DateRange = todoTask27()

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(var start: MyDate, var endInclusive: MyDate)
