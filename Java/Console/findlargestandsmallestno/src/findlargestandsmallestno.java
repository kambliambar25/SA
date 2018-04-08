import java.util.Scanner;
public class findlargestandsmallestno {
	public static void main(String[] args) {
		int n;
		  int max = Integer.MIN_VALUE; 
		 int min = Integer.MAX_VALUE;   
		 Scanner in = new Scanner(System.in); 
		 System.out.println("Enter the numbers"); 	
		 for(int i=1;i<=3;i++) 
		 {
		 n=in.nextInt();
		 if (n > max) 
		 { 
		 max = n;
		  } 
		 if(n<min) 
		 {
		  min = n; 
		 }
		 } 
		 System.out.println("Largest Number is: "+max); 
		 System.out.println("Smalest Number is: "+min); 
	}
}
