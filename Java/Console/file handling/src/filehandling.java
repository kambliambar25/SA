import java.io.*;
import java.util.Scanner;
public class filehandling {
	public static void main(String[] args) {
		System.out.println("Enter the text:");
		String str;
		Scanner sn=new Scanner(System.in);
		str=sn.nextLine();
File f= new File ("abc.txt");
try {
	FileWriter fw = new FileWriter(f);
	fw.write(str);
	System.out.println("File Created!");
	fw.close();
}
catch(Exception e)
{
	System.out.println(e);
}
	}
}

