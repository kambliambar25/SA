import java.util.Scanner;
public class checkwhetherthealphabetisuppercaseorlowercaseordigitorspecialsymbol {
public static void main(String [] args)
{
    Scanner sn = new Scanner(System.in);
    System.out.println("Enter the value");
    String data;
    data = sn.next();

    int len = data.length();
    for (int i = 0 ; i < len ; i++)
    {
        char ch = data.charAt(i);

        if ((ch >= '0' && ch <= '9')){
            System.out.println("Number");
        }
        else if(ch >= 'a' && ch <= 'z') 
        {
        System.out.println("Lower Case Character");
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
        System.out.println("Upper Case Character");	
        }
        else
        {
            System.out.println("Symbol");
         }
    }
	}
}

