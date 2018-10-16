package iii_conventions

data class MyDate(var year: Int, var month: Int, var dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate ): Int{
        if (this.year != other.year) return (this.year - other.year)
        if (this.month != other.month) return (this.month - other.month)
        return (this.dayOfMonth - other.dayOfMonth)
    }
}

operator fun MyDate.rangeTo(other: MyDate): DateRange = todoTask27()

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(var start: MyDate, var endInclusive: MyDate)