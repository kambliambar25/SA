import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class array {
  public static void main(String[] args) {
	    System.out.println("Enter the number:");
    Integer[] intArray = new Integer[5];
    Scanner sn=new Scanner(System.in);
    for(int i=0;i<5;i++)
    {
    intArray[i]=sn.nextInt();
    }
    Arrays.sort(intArray, Collections.reverseOrder());
    System.out.println("Int Array Elements in reverse order:");
    for (int i = 0; i < intArray.length; i++)
       System.out.println(intArray[i]);
  }
}

 