import java.util.Scanner;

public class inputtwointegerandoneoperatorandperformoperation {

	public static void main(String[] args) {
		int a,b;
		int p;     
		   Scanner sn = new Scanner(System.in);
		   p=sn.nextInt();
		   a=sn.nextInt();
		   b=sn.nextInt();


	        switch(p)
	        {
	            case '+':
	                System.out.println("Addition of "+a+" and "+b+" : "+(a+b));
	                break;

	            case '-':
	                System.out.println("Subtraction of "+a+" and "+b+" : "+(a-b));
	                break;

	            case '*':
	                System.out.println("Multiplication of "+a+" and "+b+" : "+(a*b));
	                break;

	            case '/':
	                System.out.println("Division of "+a+" and "+b+" : "+(a/b));
	                break;

	            case '%':
	                System.out.println("Modulo of "+a+" and "+b+" : "+(a%b));
	                break;


	            default:
	                System.out.println("Please Enter '+', '-', '*', '/' & '%' operator only");
		}

	}
	}
