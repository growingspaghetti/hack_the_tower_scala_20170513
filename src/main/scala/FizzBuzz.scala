/**
  * Created by ryoji on 13/05/17.
  */
object FizzBuzz {

  def getResult(number: Int) = {
    var result = ""
    if (number % 3 == 0) result = "fizjjz"
    if (number % 5 == 0) result += "buzz"
    if (result == "") number.toString
    else result
  }

}