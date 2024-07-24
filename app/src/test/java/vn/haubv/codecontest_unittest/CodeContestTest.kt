package vn.haubv.codecontest_unittest

import org.junit.Assert.*

import org.junit.Test
import vn.haubv.arc_base.data.local.db.dao.CodeContest

class CodeContestTest {
    val codeContest = CodeContest()
    @Test
    fun numWaterBottles() {
        val numberBottles = 9
        val numberExchange = 3
        val testCase1 = 13
        assertEquals(testCase1 , codeContest.numWaterBottles(numberBottles, numberExchange))
    }

    @Test
    fun numWaterBottlesCase2() {
        val numberBottles = 15
        val numberExchange = 4
        val testCase1 = 19
        assertEquals(testCase1 , codeContest.numWaterBottles(numberBottles, numberExchange))
    }

    @Test(expected = Exception::class)
    fun outOfRange_case(){
        val numberBottles = 0
        val numberExchange = 0
        codeContest.numWaterBottles(numberBottles, numberExchange)
    }

    @Test
    fun outOfRangeCase3(){
        val numberBottles = 3
        val numberExchange = 4
        codeContest.numWaterBottles(numberBottles, numberExchange)
    }

    @Test(expected = Exception::class)
    fun numWaterBottles_exception_because_user_input_wrong_constraints() {
        val numberBottles = 1
        val numberExchange = 1
        val testCase1 = 13
        assertEquals(testCase1 , codeContest.numWaterBottles(numberBottles, numberExchange))
    }

    @Test()
    fun numWaterBottles_CaseDrinkOnceOnly() {
        val numberBottles = 2
        val numberExchange = 5
        val testCase1 = 2
        assertEquals(testCase1 , codeContest.numWaterBottles(numberBottles, numberExchange))
    }
}