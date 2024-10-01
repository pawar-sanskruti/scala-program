class Sports(id: Int, name: String, description: String, amount: Double)
{
def getId(): Int = this.id
def getName(): String = this.name
def getDescription(): String = this.description
def getAmount(): Double = this.amount
}

class Indoor(id: Int, name: String, description: String, amount: Double) extends Sports(id, name, description, amount)
{
def play(): Unit = {
    println(" ")
}
}

class Outdoor(id: Int, name: String, description: String, amount: Double) extends Sports(id, name, description, amount)
{
def play(): Unit = {
    println(" ")
}
}

object Main {
def main(args: Array[String]):Unit =
{
val indoor = new Indoor(1,"Badminton", "Racquet sport", 50.0)
val outdoor = new Outdoor(2, "Cricket", "Bat and Ball", 100.0)
println("Name of indoor game: " + indoor.getName())
println("Name of outdoor game: " + outdoor.getDescription())
indoor.play()
outdoor.play()
}
}
