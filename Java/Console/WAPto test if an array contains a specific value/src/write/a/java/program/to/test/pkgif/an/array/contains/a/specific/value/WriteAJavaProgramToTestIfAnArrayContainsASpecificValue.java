package write.a.java.program.to.test.pkgif.an.array.contains.a.specific.value;
import java.util.Scanner;
import java.util.Arrays;
public class WriteAJavaProgramToTestIfAnArrayContainsASpecificValue {
    public static void main(String[] args) {
       int arr[] =new int [5];
       Scanner sn= new Scanner(System.in);
       
       System.out.println("Enter the Elements:");
       for(int i=0;i<=4;i++)
       {
       arr[i]=sn.nextInt();
       
       }
       System.out.println(Arrays.toString(arr));
          int a;
          boolean check = true;
        
          System.out.println("Enter the Specific value:");
            a = sn.nextInt();
          for(int i=0;i<=4;i++)
          {
             
              if(a==arr[i])
              {
                            System.out.println("Array contains a specific value");
                            check = true;
                            break;
              }
              else{
                  check = false;
              }
          }
          if(! check){
          System.out.println("Element not found");
          }
    }
}
