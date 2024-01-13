Homework 1 - Intro to Chisel and Scala
=======================

## Problem 1 - Bit Extraction & Manipulation (10pts)
Fill in the module `RiscvITypeDecoder` to practice bit extraction. Given a 32-bit instruction word (`instWord`) as input, it extracts the fields of a RISC-V I-type instruction ([ISA summary](http://riscvbook.com/greencard-20181213.pdf])). Here are the fields and their bit positions:

| Field | Positions (inclusive) |
| --- | --- |
| opcode | 6 - 0|
| funct3 | 14 - 12 |
| rs1 | 19 - 15 |
| rd | 11 - 7 |
| immSignExtended | 31 - 20 (sign-extend to 32b) |

<!-- ## Problem 1 - Combinational Logic (20pts)
To practice using Chisel's bit-wise operators, fill in the module `CombLogic` to satisfy these specs:
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
|  1  | top 3 bits of `x` | bottom 3 bits of `y` | -->


## Problem 2 - Write a Chisel Test (20pts)
We can use Scala to write exhaustive tests for a module assuming its input space is relatively small. In this problem, we provide the implementation of `MajorityCircuit` in the file `src/main/scala/hw1/HW1.scala`. Your job is to edit the file `src/test/scala/hw1/MajorityCircuitTester.scala` to fill in the unimplemented test for MajorityCircuit using Chiseltest's `peek`, `poke`, and `expect`. Make sure to test that the output is correct for all 8 possible input values. You may run your test using the command `sbt test` from your terminal. _**We strongly encourage you to fill in your own tests for the other problems using `src/test/scala/hw1/HW1Tester.scala` but they will not be graded.**_

<!-- ## Problem 2 - Write a Chisel Test (10pts)
We can use Scala to write exhaustive tests for a module assuming its input space is relatively small. In this problem, we provide the implementation of  in the file `src/main/scala/hw1/HW1.scala`. Your job is to edit the file `src/test/scala/hw1/Problem2Tester.scala` to fill in the unimplemented test for Problem2 using Chisel's `peek`, `poke`, and `expect`. Make sure to test that the output is correct for all 8 possible input values. You may run your test using the command `sbt test` from your terminal. _**We strongly encourage you to fill in your own tests for the other problems located in `src/test/scala/hw1/HW1Tester.scala` but they will not be graded.**_ -->


## Problem 3 - Polynomial Evaluator (20pts)
The `PolyEval` module will be given 3 input coefficients (`c0`, `c1`, and `c2`) at generation time and produce a circuit that computes the polynomial using them and a hardware input `x`. The circuit will also take an input `enable` that if true, the output will be the polynomial result, and if false, it will be 0. Fill in the rest of `PolyEval`.

#### Parameters (Scala)
- c0: _positive Int (8b)_
- c1: _positive Int (8b)_
- c2: _positive Int (8b)_
#### Input (Chisel)
- enable: _Bool_
- x: _UInt of width 8_
#### Output (Chisel)
- out: _UInt of sufficient width to support growth_
    - if `enable` is high: `c0 * x^0 + c1 * x^1 + c2 * x^2`
    - if `enable` is low: `0`


## Problem 4 - ComplexALU (50pts)
`ComplexALU` is a generator for an adder/subtractor for complex numbers. If the Chisel input `doAdd` is high, the module adds the complex numbers, and if it is low, the module subtracts the complex numbers. There is also a Scala parameter (for generation time) `onlyAdder`, which if true, the generated module should not have any hardware for subtraction logic (and thus ignore `doAdd`). Fill in `ComplexALU`, and a summary of its operation is below:
- if `doAdd` is high, add the complex numbers (add the real inputs and add the imaginary inputs)
- if `doAdd` is low, subtract the complex numbers (find the difference between the real inputs and the difference between the imaginary inputs)
- if `onlyAdder` is true, only generate hardware to sum the real inputs and sum the imaginary inputs (ignore `doAdd`)


<!-- ## Bonus
- When `onlyAdd` is true, programatically prevent the `useAdd` input from being elaborated. (Hint: https://github.com/ucb-bar/chisel3-wiki/blob/master/Cookbook.md) -->
