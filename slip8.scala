class Employee(val id: Int, val name: String, val salary: Double) {
  
  def display(): Unit = {
    println(s"Employee ID: $id")
    println(s"Employee Name: $name")
    println(f"Employee Salary: $$salary%%.2f")
  }
}  

object slip8 {
  var employees: List[Employee] = List()

  def accept(id: Int, name: String, salary: Double): Unit = {
    val newEmployee = new Employee(id, name, salary)
    employees = employees :+ newEmployee
  }

  def displayMaxSalaryEmployee(): Unit = {
    if (employees.isEmpty) {   
      println("No employees available.")
    } else {
      val maxSalaryEmployee = employees.maxBy(_.salary)
      println("Employee with Maximum Salary:")
      maxSalaryEmployee.display()
    }
  }

  def main(args: Array[String]): Unit = {
    // Sample data entry
    accept(1, "Alice", 50000)
    accept(2, "Bob", 60000)
    accept(3, "Charlie", 55000)
    
    // Display employee with maximum salary
    displayMaxSalaryEmployee()
  }
}

// To run the program, you would call EmployeeManagement.main(Array())
