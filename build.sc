import mill._, scalalib._

object root extends ScalaModule {
  def scalaVersion = "2.12.4"

  object test extends Tests {
def ivyDeps = Agg(
      ivy"com.lihaoyi::utest:0.6.0"
    )
    def testFrameworks = Seq("utest.runner.Framework")

  }
}
