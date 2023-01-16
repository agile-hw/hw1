// See README.md for license details.

package hw1

import chisel3._
import chisel3.util._

// Note ??? will compile but not work at runtime.

/**
 * io.instWord: 32b UInt Input
 * io.opcode: 7b UInt Output
 * io.funct3: 3b UInt Output
 * io.rs1: 5b UInt Output
 * io.rd: 5b UInt Output
 * io.immSignExtended: 32b UInt Output
 */
class RiscvITypeDecoder extends Module {
    val io = ???
}


class MajorityCircuit extends Module {
    val io = IO(new Bundle {
        val a = Input(Bool())
        val b = Input(Bool())
        val c = Input(Bool())
        val out = Output(Bool())
    })
    io.out := (io.a & io.b) | (io.a & io.c) | (io.b & io.c)
}


/**
  * c0: 6-bit Int
  * c1: 6-bit Int
  * c2: 6-bit Int
  * io.enable: Bool Input
  * io.x: 6-bit UInt Input
  * io.out: ???-bit UInt Output
  */
class PolyEval(c0: Int, c1: Int, c2: Int) extends Module {
  require (c0 >= 0 && c0 < 64)
  require (c1 >= 0 && c1 < 64)
  require (c2 >= 0 && c2 < 64)
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
  val io = IO(new Bundle {
      val doAdd   = Input(Bool())
      val real0   = Input(SInt(5.W))
      val imag0   = Input(SInt(5.W))
      val real1   = Input(SInt(5.W))
      val imag1   = Input(SInt(5.W))
      val realOut = Output(SInt())
      val imagOut = Output(SInt())
  })
  ???
}
