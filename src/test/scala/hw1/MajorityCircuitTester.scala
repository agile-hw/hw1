package hw1

import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class MajorityCircuitTester extends AnyFlatSpec with ChiselScalatestTester {
  behavior of "MajorityCircuit"
  it should "correctly pass tests on all 8 possible inputs" in {
    test(new MajorityCircuit) { dut =>
      // FILL IN HERE
			???
    }
  }
}
