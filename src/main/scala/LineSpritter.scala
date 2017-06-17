/**
  * Created by ryoji on 13/05/17.
  */
object LineSpritter {
  def wrap(text: String, columns: Int) : String = {
    val mutStringBuilder = new StringBuilder();
    val posWhiteSpace = text.indexOf(" ")
    val split = text.substring(0, columns);
    val lines = text.split(" ");
    var stock : String = "";
    for (l <- lines) {
      //if (stock + l)
      print(l)
    }
    "a"
  }
}
