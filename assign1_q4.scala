object assign1_q4{
def binaryCon(n : Int) =
{
var i=0
var num=n
var A=new Array[Int](10)
while(num>0)
{
A(i)=num%2
i=i+1
num=num/2
}
println("\nbinary number " )
for(j<-i-1 to 0 by -1)
print(A(j))
}
def octalCon(n:Int)=
{
var i=0
var num=n
var A=new Array[Int](10)
while(num>0)
{
A(i)=num%8
i=i+1
num=num/8
}
println("\n Octal number " )
for(j<-i-1 to 0 by -1)
print(A(j))
}
def main(args: Array[String]) = 
{
println("enter nO.")
var n=scala.io.StdIn.readInt()
println("%d".format(n))
octalCon(n)
binaryCon(n)
}//main
}//object