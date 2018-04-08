package write.a.java.program.to.reverse.an.array.of.integer.values;
import java.util.Scanner;
public class WriteAJavaProgramToReverseAnArrayOfIntegerValues {
    public static void main(String[] args)
    {
        int i;
       int arr[]=new int[5];
          Scanner sn = new Scanner(System.in);
       for(i=0;i<=4;i++)
       {  
     arr[i] = sn.nextInt();  
    }
       System.out.println("Original array");
       for(i=0;i<=4;i++)
       {  
        System.out.println(arr[i]);
    }
     System.out.println("Reverse array");
       for(i=4;i>=0;i--)
       {  
        System.out.println(arr[i]);
    }
}
}
   

