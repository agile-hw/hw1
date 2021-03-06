// See README.md for license details.

package hw1

import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class HW1Tester extends AnyFlatSpec with ChiselScalatestTester {
  behavior of "CombLogic"
  it should  "correctly calculate out0" in {
    test(new CombLogic) { c =>
      ???
    }
  }
  it should "correctly calculate out1" in {
    test(new CombLogic) { c =>
      ???
    }
  }

  // See src/test/scala/hw1/Problem2Tester.scala for Problem2

  behavior of "PolyEval"
  it should "correctly calculate out" in {
    val c0 = ???
    test(new PolyEval(c0, c0, c0)) { dut =>
      ???
    }
  }

  behavior of "ComplexALU"
  it should "correctly calculate realOut onlyAdd=true" in {
    test(new ComplexALU(onlyAdder=true)) { dut =>
      ???
    }
  }
  it should "correctly calculate realOut onlyAdd=false" in {
    test(new ComplexALU(onlyAdder = false)) { dut =>
      ???
    }
  }
  it should "correctly calculate imagOut onlyAdd=true" in {
    test(new ComplexALU(onlyAdder = true)) { dut =>
      ???
    }
  }
  it should "correctly calculate imagOut onlyAdd=false" in {
    test(new ComplexALU(onlyAdder = false)) { dut =>
      ???
    }
  }
}
