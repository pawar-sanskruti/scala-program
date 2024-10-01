class employee(id:Int, name:String)
{
var salary:Int = 0 //default value
def showDetails()=
{
println(id+" "+name+" "+salary)
}
def this(id:Int, name:String,salary:Int)=
{
this(id,name) // Calling primary constructor (see parameters in class decalration)
this.salary = salary
}
}

object MainObject
{  
    def main(args:Array[String])=
    {
	var employee:Array[employee]=new Array[employee](4)
	employee(0)=new employee(101,"Ram gangarde",20)
	employee(1)=new employee(10,"sita pawar",60)
	employee(2)=new employee(103,"Ravi satale",80)
	employee(3)=new employee(104,"komal tupe",100)
	
	
	var max:employee=new employee(0,"",0) // a temporary object
	max = employee(0) //assigning first record/object to max
	var maxsalary=employee(0).salary // a temporary maxmarks variable to contain max value
	for( i <-0 to 3)
	  {
	    
	    if(employee(i).salary>maxsalary)
	    {
	      maxsalary=employee(i).salary
	      max=employee(i)
	    }
	    
	  }
	  println("employee details with maximum salary is")
	  println(max.showDetails())
      
}  
}