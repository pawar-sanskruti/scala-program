object slip5 {
  def main(args: Array[String]): Unit = {
    // Reading two strings from the user
    println(s"Enter the first string:")
    val str1 = scala.io.StdIn.readLine()
    
    println(s"Enter the second string:")
    val str2 = scala.io.StdIn.readLine()
    
    // a. Compare using == operator
    //println("\n(a) Comparing using '==' operator:")
    if (str1 == str2) {
      println(s"Strings are equal using '=='")
    } else {
      println(s"Strings are not equal using '=='")
    }
    
          // b. Compare using equals() and compareTo() functions
         //println("\n(b) Comparing using 'equals()' and 'compareTo()' functions:")
     if (str1.equals(str2)) {
      println("Strings are equal using 'equals()'")
    } else {
      println("Strings are not equal using 'equals()'")
    }

    val comparisonResult = str1.compareTo(str2)
    if (comparisonResult == 0) {
           
      println("Strings are equal using 'compareTo()'")
    } //else if (comparisonResult > 0) {
      //println("First string is greater than the second string using 'compareTo()'")
    //} 
    else {
      println("First string is less than the second string using 'compareTo()'")
    }
    
    // c. Find character at position 5 (4th index)
    //println("\n(c) Character at position 5:")


    if (str1.length >= 5) {
      println(s"Character at position 5 in the first string: '${str1.charAt(4)}'")
       
    } /*else {
      println("First string does not have 5 characters.")
    }*/

    if (str2.length >= 5) {
      println(s"Character at position 5 in the second string: '${str2.charAt(4)}'")
    } else {
      println("Second string does not have 5 characters.")
    }
    
  }
}
