abstract class abc
{
	String name;
	abstract String person();	
}
public class AbstractClass extends abc{
	public AbstractClass()
	{
		this.name="Shivananda";	
}	
	public String person() {
		return "Hello!";
	}
	public static void main(String[] args) {
		AbstractClass obj = new AbstractClass();
		System.out.print(obj.person());
	}
}
