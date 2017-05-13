import org.scalatest._
/**
  * Created by ryoji on 13/05/17.
  */
class FizzBuzzTest extends FlatSpec {

    "FizzBuzz" should "return fizz if the number is dividable by 3" in {
      FizzBuzz.getResult(3) eq ("fizz")
      FizzBuzz.getResult(6) eq ("fizz")
    }
  }
