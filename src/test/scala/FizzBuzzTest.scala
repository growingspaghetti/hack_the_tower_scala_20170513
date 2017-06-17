import org.scalatest._

/**
  * Created by ryoji on 13/05/17.
  */
class FizzBuzzTest extends FlatSpec with Matchers {
    "FizzBuzz" should "return fizz if the number is dividable by 3" in {
      FizzBuzz.getResult(3) should be ("fizjjz")
      FizzBuzz.getResult(6) should be ("fizjjz")
    }
  }
