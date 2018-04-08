package evenandoddnumberbetween1to100usingallloop;

public class evenandoddnumberbetween1to100usingallloop {
public static void main(String [] args)
{
	int i;
	System.out.println("***********************************");
	System.out.println("For loop");
	System.out.println("***********************************");
	System.out.println("Even numbers:");
	for(i=1;i<=100;i++)
		if(i%2==0)
		{
			System.out.print(i+","); 
		}
	System.out.println("\n Odd numbers:");
	for(i=1;i<=100;i++)
	if(i%2!=0)
	{
		System.out.print(i+",");
	}
	
	
	System.out.println("\n***********************************");
	System.out.println("while loop");
	System.out.println("***********************************");
	System.out.println("Even numbers:");
	i=1;
	while(i<=100) {
		if(i%2==0)
		{
			System.out.print(i+",");
		}	
		i++;
	}
	
	System.out.println("\n Odd numbers:");
	i=1;
	while(i<=100) {
	if(i%2!=0)
	{
		System.out.print(i + ",");
	}
	i++;
	}
	
	System.out.println("\n***********************************");
	System.out.println("do while loop");
	System.out.println("***********************************");
	System.out.println("Even numbers:");
	i=1;
	do {
		if(i%2==0)
		{
			System.out.print(i+",");
		}	
		i++;
	}
	while(i<=100);
	System.out.println("\n Odd numbers:");
	i=1;
	do {
		if(i%2!=0)
		{
			System.out.print(i+",");
		}	
		i++;
	}
	while(i<=100);
}
}
