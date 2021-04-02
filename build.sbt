// See README.md for license details.

ThisBuild / scalaVersion     := "2.12.12"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "%ORGANIZATION%"

// lazy val root = (project in file("."))
//   .settings(
//     name := "%NAME%",
//     libraryDependencies ++= Seq(
//       "edu.berkeley.cs" %% "chisel3" % "3.4.2",
//       "edu.berkeley.cs" %% "chiseltest" % "0.3.2" % "test",
//       "edu.berkeley.cs" %% "chisel-iotesters" % "1.3.+"
//     ),
//     scalacOptions ++= Seq(
//       "-Xsource:2.11",
//       "-language:reflectiveCalls",
//       "-deprecation",
//       "-feature",
//       "-Xcheckinit"
//     ),
//     addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % "3.4.2" cross CrossVersion.full),
//     addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)
//   )


// Below borrowed from DINO CPU

def javacOptionsVersion(scalaVersion: String): Seq[String] = {
  Seq() ++ {
    // Scala 2.12 requires Java 8. We continue to generate
    //  Java 7 compatible code for Scala 2.11
    //  for compatibility with old clients.
    CrossVersion.partialVersion(scalaVersion) match {
      case Some((2, scalaMajor: Long)) if scalaMajor < 12 =>
        Seq("-source", "1.7", "-target", "1.7")
      case _ =>
        Seq("-source", "1.8", "-target", "1.8")
    }
  }
}

// https://mvnrepository.com/artifact/junit/junit
// For running the gradescope tests
libraryDependencies += "junit" % "junit" % "4.12" % Test

// This sets it up so all tests that end in "Tester" will be run when you run sbt test
// and all tests that end in "Grader" will run when you run stb Grader / test
lazy val scalatest = "org.scalatest" %% "scalatest" % "3.0.5"
lazy val Grader = config("grader") extend(Test)
lazy val TestAll = config("testAll") extend(Test)
lazy val Hw1 = config("hw1") extend(Test)
lazy val Hw2 = config("hw2") extend(Test)
lazy val Hw3 = config("hw3") extend(Test)
lazy val Hw4 = config("hw4") extend(Test)

def allFilter(name: String): Boolean = name endsWith "Tester"
def graderFilter(name: String): Boolean = name endsWith "Grader"
def hw1Filter(name: String): Boolean = name endsWith "Testerhw1"
def hw2Filter(name: String): Boolean = name endsWith "Testerhw2"
def hw3Filter(name: String): Boolean = name endsWith "Testerhw3"
def hw4Filter(name: String): Boolean = name endsWith "Testerhw4"

lazy val root = (project in file("."))
  .configs(TestAll).configs(Grader).configs(Hw1).configs(Hw2).configs(Hw3).configs(Hw4)
  .settings(
    name := "%NAME%",
    libraryDependencies ++= Seq(
      "edu.berkeley.cs" %% "chisel3" % "3.4.2",
      "edu.berkeley.cs" %% "chiseltest" % "0.3.2" % "test",
      "edu.berkeley.cs" %% "chisel-iotesters" % "1.3.+"
    ),
    scalacOptions ++= Seq(
      "-Xsource:2.11",
      "-language:reflectiveCalls",
      "-deprecation",
      "-feature",
      "-Xcheckinit"
    ),
    addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % "3.4.2" cross CrossVersion.full),
    addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full),

    // from dino
    inConfig(Grader)(Defaults.testTasks),
    inConfig(TestAll)(Defaults.testTasks),
    inConfig(Hw1)(Defaults.testTasks),
    inConfig(Hw2)(Defaults.testTasks),
    inConfig(Hw3)(Defaults.testTasks),
    inConfig(Hw4)(Defaults.testTasks),
    libraryDependencies += scalatest % TestAll,
    libraryDependencies += scalatest % Grader,
    libraryDependencies += scalatest % Hw1,
    libraryDependencies += scalatest % Hw2,
    libraryDependencies += scalatest % Hw3,
    libraryDependencies += scalatest % Hw4,
    testOptions in TestAll := Seq(Tests.Filter(allFilter)),
    // CHANGE THE LINE BELOW FOR EACH LAB!!!! Use the matching filter
    testOptions in Test := Seq(Tests.Filter(allFilter)),
    testOptions in Grader := Seq(Tests.Filter(graderFilter)),
    testOptions in Hw1 := Seq(Tests.Filter(hw1Filter)),
    testOptions in Hw2 := Seq(Tests.Filter(hw2Filter)),
    testOptions in Hw3 := Seq(Tests.Filter(hw3Filter)),
    testOptions in Hw4 := Seq(Tests.Filter(hw4Filter))
  )