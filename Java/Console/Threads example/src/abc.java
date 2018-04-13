class EvenNumber implements Runnable
{
public void run()
{
System.out.println("Even Numbers Between 1 to 10:");
for(int i=1;i<=10;i++)
{
if(i%2==0)
System.out.println(i);
}
}
}
class OddNumber implements Runnable
{
public void run()
{
System.out.println("Odd Numbers Between 1 to 10:");
for(int i=1;i<=10;i++)
{
if(i%2==1)
System.out.println(i);

}
}
}
class abc
{
public static void main(String [] args)
{
Runnable r=new EvenNumber();
Thread t=new Thread(r);
t.start();
Runnable r1=new OddNumber();
Thread t2=new Thread(r1);
t2.start();
}
}