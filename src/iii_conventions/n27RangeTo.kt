package iii_conventions

import util.TODO
import util.doc26

fun todoTask27(): Nothing = TODO(
    """
        Task 27.
        Uncomment the commented code and make it compile.
        Make all the changes to the file MyDate.kt.

        Tips: To make '..' work implement a 'MyDate.rangeTo()' extension function returning 'DateRange'.
    """,
    documentation = doc26()
)

fun checkInRange2(date: MyDate, first: MyDate, last: MyDate): Boolean {
    if(date >= first)
    {
        if(date <= last)
            return true
        else
            return false
    }
    else
        return false


//    return date in first..last
}
