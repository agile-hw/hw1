// See README.md for license details.

package hw1

import chisel3._
import chisel3.tester._
import chisel3.tester.RawTester.test
import chisel3.experimental.BundleLiterals._
import scala.language.implicitConversions

object CombLogicBehavior {
    implicit def int2Bool(b:Int) = if (b > 0) true else false
    def testCombLogicOut0(): Boolean = {
        test(new CombLogic) { dut =>
            ???
        } 
        true
    }
    
    def testCombLogicOut1(): Boolean = {
        test(new CombLogic) { dut =>
            ???
        }
        true 
    }
}
    
object PolyEvalBehavior {
    def testPolyEvalOut(): Boolean = {
        val w = 5
        for (c0 <- Seq(0, 31)) {
            test(new PolyEval(c0, c0, c0)) { dut =>
                ???
            }
        }
        true
    }
}

object ComplexALUBehavior {
    def testComplexALUrealOutOnlyAdder(): Boolean = {
        test(new ComplexALU(onlyAdder=true)) { dut =>
            ???
        }
        true
    }
    
    def testComplexALUrealOut(): Boolean = {
        test(new ComplexALU(onlyAdder=false)) { dut =>
            ???
        }
        true
    }
    
    def testComplexALUimagOutOnlyAdder(): Boolean = {
        test(new ComplexALU(onlyAdder=true)) { dut =>
            ???
        }
        true
    }
    
    def testComplexALUimagOut(): Boolean = {
        test(new ComplexALU(onlyAdder=false)) { dut =>
            ???
        }
        true
    }
}
