abstract class shape(r:Int,h:Int)
	{
	  var vol1:Double=0
	  var pi:Double=3.14
	  
	  def volume():
	  def display():
	}

	class cylinder(r:Int,h:Int)extends shape(r,h)
	{
	  def volume()=
	  {
	    var vol:Double=0
	    vol=pi*r*r*h
	    vol1=vol
	    println("*****")
	    println("volume is:"+vol)
        
	  }
	  
	  def display()=
	  {
       println("***")
       println("radius of cylinder:".r)
	   println("height of cylinder:"+h)
	   println("volume of cylinder:"+vol1)
     }
	}

	object assign4_q4
	{
	  def main(args:Array[String])=
	  {
	    var radius:Int=0
	    var height:Int=0
	    println("enter radius of cylinder:")
	    radius=scala.io.StdIn.readInt()
	    
	    println("enter hight of cylinder")
	    height=scala.io.StdIn.readInt()
	    
	    var n=new cylinder(radius,height)
	    n.volume()
	    n.display()
	  }
	}
