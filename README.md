Homework 1 - Intro to Chisel and Scala
=======================

## Problem 1 - Combinational Logic (20pts)
To familiarize ourselves with the Chisel bit-wise operators we will fill in the module `CombLogic` that satisfies these specs:
#### Input
- b: _Bool_
- x: _6-bit UInt_
- y: _6-bit UInt_
#### Output
- out0: _Bool_
    - `XOR` of `b` and the most-significant bit from `x AND y`
- out1: 6-bit UInt (table below)

| b   | top 3 bits of `out1` | bottom 3 bits of `out1` |
| --- | ---               | ---                  |
|  0  | top 3 bits of `y` | bottom 3 bits of `x` |
|  1  | top 3 bits of `x` | bottom 3 bits of `y` |


## Problem 2 - Write a Chisel Test (10pts)
We can use Scala to write exhaustive tests for our modules assuming the input space is relatively small. In this problem, we provide `Problem2` in the file `src/main/scala/hw1/HW1.scala`. Your job is to edit the file `src/test/scala/hw1/Problem2Test.scala` and fill in the unimplemented `testProblem2` function using Chisel `peek`, `poke`, and `expect`. Make sure to test that the output is correct for all 8 possible input values. You may run your test using the command `sbt test` from your terminal. _**We strongly encourage you to fill in your own tests for the other problems located in `src/test/scala/hw1/HW1TestSuite.scala` but they will not be graded.**_


## Problem 3 - Polynomial Evaluator (20pts)
Given 3 input coefficients `c0`, `c1`, and `c2` and variable `x`, fill in the rest of the `PolyEval` to implement the module:
#### Parameters (Scala)
- c0: _positive Int (<= 5b)_
- c1: _positive Int (<= 5b)_
- c2: _positive Int (<= 5b)_
#### Input (Chisel)
- enable: _Bool_
- x: _UInt of width 5_
#### Output (Chisel)
- out: _UInt of sufficient width to support growth_
    - if `enable` is high: `c0 * x^0 + c1 * x^1 + c2 * x^2`
    - if `enable` is low: `0`


## Problem 4 - ComplexALU (50pts)
Fill in the module `ComplexALU`. It is an adder/subtractor for complex numbers. If the Chisel input `doAdd` is high, the module adds the complex numbers, and if it is low, the module subtracts the complex numbers. There is a Scala parameter `onlyAdder`, and if it is true, the module should not generate any hardware for subtraction logic (and thus ignore `doAdd`). The module's IO is already in the code, and here is a summary of the module's behavior:
- if `doAdd` is high, add the complex numbers (add the real inputs and add the imaginary inputs)
- if `doAdd` is low, subtract the complex numbers (find the difference between the real inputs and the difference between the imaginary inputs)
- if `onlyAdder` is true, only generate hardware to sum the real inputs and sum the imaginary inputs (ignore `doAdd`)


<!-- ## Bonus
- When `onlyAdd` is true, programatically prevent the `useAdd` input from being elaborated. (Hint: https://github.com/ucb-bar/chisel3-wiki/blob/master/Cookbook.md) -->
