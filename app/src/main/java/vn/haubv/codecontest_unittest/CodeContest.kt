package vn.haubv.arc_base.data.local.db.dao

class CodeContest {
    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
        var allDrinkAble = numBottles
        if (meetConditionInitial(numBottles, numExchange)) {
            val nextDrinkable = if (meetConditionForNextDrinkable(numBottles, numExchange)) {
                getNextDrinkAbleBottle(numBottles, numExchange)
            } else {
                0
            }
            allDrinkAble += nextDrinkable
        } else {
            throw Exception(
                "Please enter correct number ranging in: 1 <= numBottles <= 100\n" + "2 <= numExchange <= 100"
            )
        }
        return allDrinkAble
    }

    private fun meetConditionInitial(numBottles: Int, numExchange: Int) =
        numBottles in 1..100 && numExchange in 2..100

    private fun meetConditionForNextDrinkable(numBottles: Int, numExchange: Int) =
        numBottles in 1..100 && numExchange in 2..100 && numBottles >= numExchange

    private fun getNextDrinkAbleBottle(numBottles: Int, numExchange: Int): Int {
        if (meetConditionForNextDrinkable(numBottles, numExchange)) {
            return numBottles / numExchange + getNextDrinkAbleBottle(
                numBottles / numExchange + numBottles % numExchange,
                numExchange
            )
        }
        return 0
    }


}