class A extends Thread
{
public void run()
{

for(int i = 1;i<10;i++)
{
System.out.println("process1: "+i);
}
}
}
class B extends Thread
{
public void run()
{

for(int j = 1;j<10;j++)
{
System.out.println("process2: "+j);
}
}
}
class multiT
{
public static void main(String a[])
{
A ob1 = new A();
B ob2 = new B();
ob1.start();
ob2.start();
}
}
