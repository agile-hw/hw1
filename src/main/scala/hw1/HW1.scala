// See README.md for license details.

package hw1

import chisel3._

// Note ??? will compile but not work at runtime.

/**
  * io.b: Bool Input
  * io.x: 6-bit UInt Input
  * io.y: 6-bit UInt Input
  * io.out0: Bool Output
  * io.out1: 6-bit UInt Output
  */
class CombLogic extends Module {
    val io = ???
}

class Problem2 extends Module {
    val io = IO(new Bundle {
        val a   = Input(Bool())
        val b   = Input(Bool())
        val c   = Input(Bool())
        val out = Output(Bool())
    })
    
    io.out := io.a & (io.b ^ io.c)
}

/**
  * c0: 5-bit Int
  * c1: 5-bit Int
  * c2: 5-bit Int
  * io.enable: Bool Input
  * io.x: 5-bit UInt Input
  * io.out: ???-bit UInt Output
  */
class PolyEval(c0: Int, c1: Int, c2: Int) extends Module {
    require (c0 >= 0 && c0 < 32)
    require (c1 >= 0 && c1 < 32)
    require (c2 >= 0 && c2 < 32)
    val io = ???
}


/**
  * onlyAdder: Boolean
  * io.doAdd: Bool Input
  * io.real0: 5-bit SInt Input
  * io.imag0: 5-bit SInt Input
  * io.real1: 5-bit SInt Input
  * io.imag1: 5-bit SInt Input
  * io.realOut: SInt() Output
  * io.imagOut: SInt() Output
  */
class ComplexALU(onlyAdder: Boolean) extends Module {
    val io = ???
}
