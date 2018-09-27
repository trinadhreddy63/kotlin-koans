package i_introduction._4_Lambdas

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class N04LambdasKtTest {
    @Test fun contains() {
        assertTrue(task4(listOf(1, 2, 3)))
        //assertTrue(task4(listOf(1, 8, 3)))

    }

    @Test fun notContains() {
        assertTrue(task4(listOf(6,9,8)))
       // assertFalse(task4(listOf(1, 3, 5)))

    }
}