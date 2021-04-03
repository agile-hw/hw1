Homework 1 - Intro to Chisel and Scala
=======================

## Problem 1 - Combinational Logic (20pts)
To familiarize ourselves with the Chisel bit-wise operators we will fill in the module `CombLogic` that satisfies these specs:
- IO
    - inputs:
        - b: Bool
        - x: UInt of width `6` bits
        - y: UInt of width `6` bits
    - outputs:
        - out0: Bool
        - out1: UInt of width `6` bits

- Assignments
    - out0 will equal the `XOR` of `b` and the most-significant bit from `x and y` 
    - out1:

| b   | top 3 bits of `out1` | bottom 3 bits of `out1` |
| --- | ---               | ---                  |
|  0  | top 3 bits of `y` | bottom 3 bits of `x` |
|  1  | top 3 bits of `x` | bottom 3 bits of `y` |


## Problem 2 - Write a Chisel Test (10pts)
We can use Scala to write exhaustive tests for our modules assuming the input space is relatively small. In this problem, we provide the `Problem2` module in the file `src/main/scala/hw1/HW1.scala`. Your job is to edit the file `src/test/scala/hw1/Problem2Test.scala` and fill in the unimplemented `testProblem2` function using Chisel `peek, poke, and expect`. Make sure to test that the output is correct for all `8` possible input values. You may run your test using the command `sbt test` from your terminal. We strongly encourage you to fill in your own tests for the other problems located in `src/test/scala/hw1/HW1TestSuite.scala` but they will not be graded.


## Problem 3 - Polynomial Evaluator (20pts)
Given `3` input coefficients `c0, c1, and c2` and variable `x`, fill in the rest of the `PolyEval` implement the module:
- Module Scala Parameters
    - c0: positive Int (<= 5b)
    - c1: positive Int (<= 5b)
    - c2: positive Int (<= 5b)
- IO
    - inputs
        - enable: Bool 
        - x: UInt of width 5
    - outputs
        - out: UInt of sufficient width to support growth
        
- Assignments
    - out0: 
        - if `enable` is high: `c0 * x^0 + c1 * x^1 + c2 * x^2`
        - if `enable` is low: `0`


## Problem 4 - ComplexALU (50pts)
Fill in the module `ComplexALU`. It is an adder/subtractor for complex numbers. If the Scala parameter `onlyAdder` is `true`, the module should not generate any hardware for subtraction logic. The module's IO is given to you this time, and the behavior should follow this pseudo-code:
- if `doAdd` sum the real inputs and sum the imaginary inputs
- if not `doAdd` find difference between the real inputs and the difference between the imaginary inputs
- if `onlyAdder` only generate logic to sum the real inputs and sum the imaginary inputs (ignore `doAdd`)


<!-- ## Bonus
- When `onlyAdd` is true, programatically prevent the `useAdd` input from being elaborated. (Hint: https://github.com/ucb-bar/chisel3-wiki/blob/master/Cookbook.md) -->
