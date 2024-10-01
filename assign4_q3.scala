abstract class Order(id:Int,description:String)
class PurchaseOrder(id:Int,description:String,vendor:String)extends Order(id,description)
{
def displayDetails():Unit=
{
println("Id:" +id)
println("Description:" +description)
println("Vendor:" +vendor)
}
}

class SalesOrder(id:Int,description:String,Customer:String)extends Order(id,description)
{
def displayDetails():Unit=
{
println("Id:" +id)
println("Description:" +description)
println("Customer:" +Customer)
}
}
object main
{
def main(agrs:Array[String]):Unit=
{
val PurchaseOrder=new PurchaseOrder(1,"computer","dell")
val SalesOrder=new SalesOrder(2,"lp","jhon")
println("prchase order details:")
PurchaseOrder.displayDetails()
println("sales order details:")
SalesOrder.displayDetails()
}
}

