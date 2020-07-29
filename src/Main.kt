val name: String = "KHK"
var greeting: String? = "Hello"

fun main() {
  val greetingToPrint = when (greeting) {
    null -> "This is null"
    else -> greeting
  }
  println(greetingToPrint)
  println(name)
  println(greeting)
}