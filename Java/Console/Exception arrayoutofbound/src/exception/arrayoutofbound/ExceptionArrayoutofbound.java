package exception.arrayoutofbound;
import java.util.Arrays;
public class ExceptionArrayoutofbound {
  public static void main(String[] args) {
 int a[] = new int[5];
      try {a[0] = 1;
           a[1] = 5/0;
           a[2] = 2;
           a[3] = 3;
           a[4] = 4;
      }catch (Exception e) {
         try{
             System.out.println(e);
             System.out.println("current array is\n" + Arrays.toString(a));
             a[1] = 25;
             a[2] = 45;
             a[3] = 55;
             a[4] = 75;
             a[5] = 65;
         }catch(Exception ex){
             System.out.println("2nd Current array is\n" + Arrays.toString(a));
          System.out.println(ex);
         }
      }finally {
       System.out.println("Finally printing array");
            System.out.println(Arrays.toString(a));  
    }

  }
}

