object assign5_q6 extends App {
  // Define the function to convert lowercase letters to uppercase
  def toUppercase(str: String): String = {
    str.toUpperCase
  }

  // Create a list of strings
  val lowercaseList = List("hello", "world", "scala", "programming")

  // Use map to apply the toUppercase function to each element in the list
  val uppercaseList = lowercaseList.map(toUppercase)

  // Print the result
  println("Original List: " + lowercaseList)
  println("Uppercase List: " + uppercaseList)
}
