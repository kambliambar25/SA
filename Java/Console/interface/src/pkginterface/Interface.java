
package pkginterface;
interface sa
{
    void print();
            void add();
}

public class Interface {
public void print()
{
    System.out.println("This is interface program");
}
public void add()
{
    int a=10,b=20,c;
    c=a+b;
    System.out.println("Addition:" + c);
}
    public static void main(String[] args) {
         Interface obj = new  Interface();
         obj.print();
         obj.add();
         
        
    }
    
}
