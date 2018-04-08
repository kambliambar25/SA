import java.util.Scanner;
public class vowelsfromastring {	
	public static void main(String[] args) {  
		int counter = 0;
Scanner sn=new Scanner(System.in);
String str;
str=sn.nextLine();
		        for(int i=0;i <str.length();i++){
		            if((str.charAt(i) == 'a') || 
		                (str.charAt(i) == 'e')  ||
		                (str.charAt(i) == 'i') || 
		                (str.charAt(i) == 'o') ||
		                (str.charAt(i) == 'u')) {
		                System.out.println(" The String contains " + str.charAt(i));
		            }
		        }
		                for(int i=0; i<str.length(); i++ ) {
				            if(( str.charAt(i) == str.charAt(i)) && (str.charAt(i) != ' '))
				            {
				                counter++;        	            
		        }				        
		        }
		                System.out.print("No of character:" + counter);	
	}
}

		    
