public class print100to50usingallloop {
	public static void main(String [] args)
	{
		int i;
		System.out.println("for loop:");		
		for(i=100;i>=50;i--)
		{
			System.out.print(" " + i);	
		}
		System.out.println("\n while loop:");
		
		i=100;
		while(i>=50)
		{
			System.out.print(" " + i);
			i--;
		}
		System.out.println("\n do while loop:");
		
		i=100;
		do
		{
			System.out.print(" " + i);
			i--;
		}
			while(i>=50);
	}
}
