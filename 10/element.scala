abstract class Element {
  def contents: Array[String]

  val height: Int = contents.length

  val width: Int = if (height == 0) 0 else contents(0).length
}

class ArrayElement(val contents: Array[String]) extends Element
