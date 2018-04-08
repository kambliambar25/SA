package write.a.java.program.to.insert.an.element.specific.position.into.an.array;
import java.util.Scanner;
import java.util.Arrays;
public class WriteAJavaProgramToInsertAnElementSpecificPositionIntoAnArray {
    public static void main(String[] args) {
       int arr[] =new int [10];
       Scanner sn= new Scanner(System.in);     
       System.out.println("Enter the Elements:");
       for(int i=0;i<=9;i++)
       {
       arr[i]=sn.nextInt(); 
       }
       System.out.println(Arrays.toString(arr));
       System.out.println("Enter element to be inserted and position");     
       int a=sn.nextInt();
       int pos = sn.nextInt();
       if(pos - 1 < arr.length && pos - 1 > 0)
       {
       for(int i=8;i>=pos - 1;i--)
       {
       arr[i + 1] = arr[i];
       }
       arr[pos - 1] = a;
        System.out.println(Arrays.toString(arr));
       }
       else{
       System.out.println("Incorrect position");
       }
    }    
}
