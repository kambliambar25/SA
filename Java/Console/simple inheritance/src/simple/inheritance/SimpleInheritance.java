package simple.inheritance;
 class a{
public int x,y,z;
    void sa(int a,int b)
    {
        x=a;
        y=b;
        z=a+b;   
    }
}
class b extends a{
    void run(){        
    System.out.println("answer:" + z);
}
}
public class SimpleInheritance {
    public static void main(String[] args) {
        a gf = new a();
        b bb = new b();
        bb.sa(12, 67);
        bb.run();
    }
}
