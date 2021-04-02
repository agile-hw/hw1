// Lab 1 tester

// package dinocpu.test.grader
package hw1

import com.gradescope.jh61b.grader.{GradedTest,GradedTestRunnerJSON}
import org.junit.Test
import org.scalatest.junit.JUnitSuite
import org.junit.runner.RunWith


@RunWith(classOf[GradedTestRunnerJSON])
class HW1Grader extends JUnitSuite {

  @Test
  @GradedTest(name="CombLogicOut0", max_score=30)
  def verifyCombLogicOut0() {

    // Capture all of the console output from the test
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {

      val success = CombLogicBehavior.testCombLogicOut0

      // Dump the output of the driver above onto the system out so that the
      // gradescope function will catch it.
      System.out.print(stream)
      if (!success) fail("Test failed!")
    }
  }

  @Test
  @GradedTest(name="CombLogicOut1", max_score=30)
  def verifyCombLogicOut1() {

    // Capture all of the console output from the test
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {

      val success = CombLogicBehavior.testCombLogicOut1

      // Dump the output of the driver above onto the system out so that the
      // gradescope function will catch it.
      System.out.print(stream)
      if (!success) fail("Test failed!")
    }
  }

  @Test
  @GradedTest(name="Problem2", max_score=30)
  def verifyProblem2() {

    // Capture all of the console output from the test
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {

      val success = Problem2Behavior.testProblem2

      // Dump the output of the driver above onto the system out so that the
      // gradescope function will catch it.
      System.out.print(stream)
      if (!success) fail("Test failed!")
    }
  }

  @Test
  @GradedTest(name="PolyEvalOut", max_score=30)
  def verifyPolyEvalOut() {

    // Capture all of the console output from the test
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {

      val success = PolyEvalBehavior.testPolyEvalOut

      // Dump the output of the driver above onto the system out so that the
      // gradescope function will catch it.
      System.out.print(stream)
      if (!success) fail("Test failed!")
    }
  }

  @Test
  @GradedTest(name="ComplexALUrealOutOnlyAdder", max_score=30)
  def verifyComplexALUrealOutOnlyAdder() {

    // Capture all of the console output from the test
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {

      val success = ComplexALUBehavior.testComplexALUrealOutOnlyAdder

      // Dump the output of the driver above onto the system out so that the
      // gradescope function will catch it.
      System.out.print(stream)
      if (!success) fail("Test failed!")
    }
  }

  @Test
  @GradedTest(name="ComplexALUrealOut", max_score=30)
  def verifyComplexALUrealOut() {

    // Capture all of the console output from the test
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {

      val success = ComplexALUBehavior.testComplexALUrealOut

      // Dump the output of the driver above onto the system out so that the
      // gradescope function will catch it.
      System.out.print(stream)
      if (!success) fail("Test failed!")
    }
  }

  @Test
  @GradedTest(name="ComplexALUimagOutOnlyAdder", max_score=30)
  def verifyComplexALUimagOutOnlyAdder() {

    // Capture all of the console output from the test
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {

      val success = ComplexALUBehavior.testComplexALUimagOutOnlyAdder

      // Dump the output of the driver above onto the system out so that the
      // gradescope function will catch it.
      System.out.print(stream)
      if (!success) fail("Test failed!")
    }
  }

  @Test
  @GradedTest(name="ComplexALUimagOut", max_score=30)
  def verifyComplexALUimagOut() {

    // Capture all of the console output from the test
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {

      val success = ComplexALUBehavior.testComplexALUimagOut

      // Dump the output of the driver above onto the system out so that the
      // gradescope function will catch it.
      System.out.print(stream)
      if (!success) fail("Test failed!")
    }
  }
}
