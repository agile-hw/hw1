// See README.md for license details.

package hw1

import chisel3.tester._
import org.scalatest.FreeSpec

import scala.language.implicitConversions
class HW1Tester extends FreeSpec with ChiselScalatestTester {
    "CombLogic should correctly calculate out0" in {
        assert(CombLogicBehavior.testCombLogicOut0)
    }
    
    "CombLogic should correctly calculate out1" in {
        assert(CombLogicBehavior.testCombLogicOut1)
    }

    "Problem2 should correctly pass tests on all 8 inputs" in {
        assert(Problem2Behavior.testProblem2)
    }
    
    "PolyEval should correctly calculate out" in {
        assert(PolyEvalBehavior.testPolyEvalOut)
    }
    
    "ComplexALU should correctly calculate realOut onlyAdd=true" in {
        assert(ComplexALUBehavior.testComplexALUrealOutOnlyAdder)
    }
    
    "ComplexALU should correctly calculate realOut onlyAdd=false" in {
        assert(ComplexALUBehavior.testComplexALUrealOut)
    }
    
    "ComplexALU should correctly calculate imagOut onlyAdd=true" in {
        assert(ComplexALUBehavior.testComplexALUimagOutOnlyAdder)
    }
    
    "ComplexALU should correctly calculate imagOut onlyAdd=false" in {
        assert(ComplexALUBehavior.testComplexALUimagOut)
    }
}
