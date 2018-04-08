
public class print1to100usingallloop 
{
	public static void main(String [] args)
	{
		int i;
		System.out.println("for loop:");
		
		for(i=1;i<=100;i++)
		{
			System.out.print( " " + i);	
		}
		System.out.println(" \n while loop:");
		i=1;
		while(i<=100)
		{
			System.out.print( " " + i);
			i++;
			
		}
		System.out.println(" \n do while loop:");
		i=1;
		do
		{
			System.out.print( " " + i);
			i++;
		}
			while(i<=100);
	}	
}
