
import java.util.Scanner;
public class balance {
public String name;
public float bal;
public void abc()
{
Scanner sn = new Scanner(System.in);
name=sn.nextLine();
bal=sn.nextInt();
}
public void  def()
{
	if(bal<=0)
	{
		System.out.println("Your account balance is low");
	}
	else
	{
		System.out.println("Name:"+ name);
		System.out.println("Balance Rs:"+ bal);
	}
}
	public static void main(String[] args)
	{
		balance obj=new balance();
	}
}

