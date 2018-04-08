import java.util.Scanner; 
public class primenoornot {
	public static void main(String[] args) {
		 int num, i, count=0,flag = 0;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter a Number : ");
	        num = scan.nextInt();
	        for(i=2; i<num; i++)
	        {
	            if(num%i == 0)
	            {
	             flag=1;
	                break;
	            }
	        }
	        if(flag == 0)
	        {
	            System.out.print("This is a Prime Number");
	        }
	        else
	        {
	            System.out.print("This is not a Prime Number");
	        }
	}
}
