import java.util.Scanner;
public class countthenumberofvowelandconsonents {
	public static void main(String[] args) 
	{
		
		 Scanner a=new Scanner(System.in);
		 System.out.println("enter the string");
		 String str=a.nextLine();
		 int count=0;
		 int num=0;
		 for (int i = 0; i < str.length(); i++)
		  {
		   char c = str.charAt(i);
		   if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		   {
		   count++;
		   }
		    else
		    {
		     num++;
		 }
		 }
		   System.out.println("There are" + " " + count + " " + "vowels and " + num+" consonant");
		}
		}
