import java.util.Scanner;
public class count {
	public int Number;
	public int Count=0;
	public int n, sum = 0;
	public void abc()
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Please Enter any Number: ");
		Number = sc.nextInt();
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.format("\n Number of Digits in a Given Number = %d", Count);
	if(Count>=4)
	{
		
        while(Number>0)
        {
            n = Number % 10;
            sum = sum + n;
            Number = Number / 10;
        }
        System.out.println(" \n Sum of Digits:" + sum);
	}
        else
        {
        System.out.println(" \n Can't perform sum of digits, because count<=4");	
        }
	}
	public static void main(String[] args) {
		count obj=new count();
		obj.abc();
}
}

