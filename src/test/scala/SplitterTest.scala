import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by ryoji on 13/05/17.
  */
class SplitterTest extends FlatSpec with Matchers {
  "Splitter" should "foo" in {
    LineSpritter.wrap("rjaojvpra vraopnvap", 10) should be ("rjaojvpra\nrjaojvpra") //should equals
  }
}
