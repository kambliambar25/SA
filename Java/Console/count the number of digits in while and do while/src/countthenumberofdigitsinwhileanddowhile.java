import java.util.Scanner;
public class countthenumberofdigitsinwhileanddowhile {

	public static void main(String[] args) {
	
		int Number, Count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("*************************************");
		System.out.println("\n While loop ");
		System.out.println("*************************************");
		System.out.println("\n Please Enter any Number: ");
		Number = sc.nextInt();
		
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.format("\n Number of Digits in a Given Number = %d", Count);
		System.out.println("\n *************************************");
		System.out.println("\n do while loop ");
		System.out.println("*************************************");
		System.out.println("\n Please Enter any Number: ");
		int num,cot=0;
		Scanner sn = new Scanner(System.in);
		num = sn.nextInt();
		do {
			num = num / 10;
			cot = cot + 1;
		}while(num > 0);
		System.out.format("\n Number of Digits in a Given Number = %d", cot);
	}
}
