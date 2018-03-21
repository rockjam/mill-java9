import utest._

object MainTests extends TestSuite {
  def tests = Tests {
    'one - {
      assert(1+1 == 2)
      val d = java.sql.Date.valueOf("2017-01-01")
      println(d)
    }
  }
}
