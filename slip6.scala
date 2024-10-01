object slip6 {
  def main(args: Array[String]): Unit = {
    // Reading two strings from the user
    println("Enter the first string:")
    val firstString = scala.io.StdIn.readLine()

    println("Enter the second string:")
    val secondString = scala.io.StdIn.readLine()

    // a. Concatenate two strings
    val concatenatedString = firstString + secondString
    println(s"a. Concatenated String: $concatenatedString")

    // b. Check if the first string ends with "la"
    val endsWithLa = firstString.endsWith("la")
    println(s"b. Does the first string end with 'la'?: $endsWithLa")

    // c. Find the index of character 'a' in the second string
    val indexOfA = secondString.indexOf('a')
    println(s"c. Index of character 'a' in the second string: $indexOfA")
  }
}
