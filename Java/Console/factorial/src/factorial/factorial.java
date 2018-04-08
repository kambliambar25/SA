package factorial;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
	Scanner sn=new Scanner(System.in);
	int a,fact=1;
	a=sn.nextInt();
	if(a!=0 && a>0)
	{
		int i=1;
		while(i<=a)
				
		{
			fact=fact*i;
			i++;
			
		}
		System.out.println(fact);
	}
	else
	{
		System.out.println("Its not an positive integer");
	}
	}
}
