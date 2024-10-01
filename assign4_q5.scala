class Project(val id: Int, val name: String, val location: String) {
  // Display the details of the project
  def displayDetails(): Unit = {
    println(s"Project ID: $id, Name: $name, Location: $location")
  }
}

// Companion object for Project to keep track of the count of objects created
object Project {
  private var count: Int = 0

  // Increment count each time a new Project object is created
  def incrementCount(): Unit = {
    count += 1
  }

  // Method to get the count of objects created
  def getCount: Int = count

  // Create a new Project object and update the count
  def createProject(id: Int, name: String, location: String): Project = {
    incrementCount()
    new Project(id, name, location)
  }

  def main(args: Array[String]): Unit = {
    // Creating objects of Project using the factory method
    val project1 = createProject(1, "Apollo", "New York")
    val project2 = createProject(2, "Zeus", "Los Angeles")
    val project3 = createProject(3, "Hermes", "Chicago")

    // Displaying details of each project
    project1.displayDetails()
    project2.displayDetails()
    project3.displayDetails()

    // Displaying the total number of Project objects created
    println(s"Total number of Project objects created: ${getCount}")
  }
}

