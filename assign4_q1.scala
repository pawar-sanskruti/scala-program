// Class definition for CurrentAccount
class CurrentAccount(accNo: Int, name: String, var balance: Double, val minBalance: Double) {
    
    // Method to withdraw money from the account
    def withdraw(amount: Double): Unit = {
        if (balance - amount >= minBalance) {
            balance -= amount
            println(s"Withdrawal successful. Your new balance is $$ $balance")
        } else {
            println("Insufficient balance. Withdrawal failed.")
        }
    }

    // Method to deposit money into the account
    def deposit(amount: Double): Unit = {
        balance += amount
        println(s"Deposit successful. Your new balance is $$ $balance")
    }

    // Method to view the current balance
    def viewBalance(): Unit = {
        println(s"Your current balance is $$ $balance")
    }
}

// Object with a main function to create an instance and perform operations
object assign4_q1 {
    def main(args: Array[String]): Unit = {
        // Create an object of CurrentAccount class
        val acc1 = new CurrentAccount(accNo = 101, name = "John Doe", balance = 5000, minBalance = 3000)

        // Perform operations
        println("Performing operations on John's account:")
        
        // View balance
        acc1.viewBalance()
        
        // Try to withdraw money
        acc1.withdraw(1500)  // This should succeed
        acc1.withdraw(2000)  // This should fail (due to minimum balance constraint)
        
        // Deposit money
        acc1.deposit(1000)
        
        // View balance again after deposit
        acc1.viewBalance()
    }
}
