import java.util.*;
public class evenodd {
public static void main(String[] args)
{
	int n;
	System.out.println("Enter any number");
	Scanner sn = new Scanner (System.in);
	n=sn.nextInt();
	if(n%2==0)
	{
		System.out.println("It is even number");
	}
	else
	{
		System.out.println("It is odd number");	
	}	
}
}
