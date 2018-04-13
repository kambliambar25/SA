class th extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(i);
}
}
}
class abc
{
public static void main(String [] args)
{
th obj=new th();
obj.start();
}
}