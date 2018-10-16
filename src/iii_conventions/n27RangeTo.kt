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
    var count=0
    var first1=first
    while(first1 < last.nextDay())
    {
        if(date.equals(first1))
        {
            count++
            break
        }
        else
        {
            first1=first.nextDay()
            continue
        }
    }
    if(count==1)
        return true
    else
        return false

//    return date in first..last
}
