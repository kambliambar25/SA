package exception.divide.by.zero;
public class ExceptionDivideByZero {
    public static void main(String[] args) {
        try
        {
      int div;
      div=10/0;
      System.out.println("Answer:"+ div);
        }
        catch(Exception e){
            System.out.print("Can't divide by zero:" + e);   
        }
    }
}
