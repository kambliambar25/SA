package matrix;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
     int arr[][]= new int[3][3];
      int arr2[][]= new int[3][3];
     Scanner sa=new Scanner(System.in);
     for(int i=0;i<=2;i++)
     {
         for(int j=0;j<=2;j++)
         {
           arr[i][j]=sa.nextInt();
         }
     }
      for(int i=0;i<=2;i++)
     {
         for(int j=0;j<=2;j++)
         {
           arr2[i][j]=sa.nextInt();
         }
     }
   for(int i=0;i<=2;i++)
     {
         for(int j=0;j<=2;j++)
         {
           System.out.print((arr[i][j] +arr2[i][j]) + " ");
         }
         System.out.println();
     } 
    }  
}
