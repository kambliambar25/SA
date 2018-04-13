class thread extends Thread
{
public void run()
{
for(int i=1;i<=100;i++)
{
System.out.print(i+ "\t");
}
}
}
class MyThreadDemo
{
public static void main(String [] args)
{
thread obj=new thread();
obj.start();
}
}