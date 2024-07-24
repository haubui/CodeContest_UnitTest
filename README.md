# CodeContest_UnitTest

# This code also provide UnitTest with 100% CodeCoverage Of Unit Test. Help to prove how UnitTest can cover issues. 

This code simulates a scenario where you have a certain number of empty Coca-Cola bottles (numBottles) and can exchange them for a new bottle (numExchange). You want to find the total number of bottles you can drink (allDrinkAble) by considering both the initial bottles and those obtained through exchange.


Here's the math problem corresponding to the code:

Let:

numBottles be the initial number of empty bottles you have.
numExchange be the number of empty bottles required to get one new bottle.
We want to find the total number of bottles you can drink (allDrinkAble), which is the sum of:

The initial number of bottles (numBottles).
The additional bottles obtained through exchange.
The additional bottles are calculated recursively using the following logic:

If you have enough empty bottles (numBottles >= numExchange), you can exchange them for a new bottle.
The number of additional bottles obtained is the quotient (numBottles / numExchange), which represents the whole bottles you can exchange.
However, there might be some leftover bottles (numBottles % numExchange) after the exchange.
These leftover bottles can also be used for further exchange, but only if they are enough (numBottles / numExchange + numBottles % numExchange >= numExchange).
The total additional bottles are then the sum of the initial exchange and the additional bottles obtained from leftover bottles (calculated recursively using the same logic).
In simpler terms:

You start with numBottles and can drink them.
If you have enough leftover bottles (>= numExchange), you can exchange them for a new bottle to drink.
Any remaining bottles after the exchange can also be used for further exchange (if there are enough), adding to the total number you can drink.
This process continues recursively until you don't have enough leftover bottles for another exchange.
The code translates this logic into functions to calculate the total number of drinkable bottles (numWaterBottles).