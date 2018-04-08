public class atozinuppercaseusingallloop {

	public static void main(String [] args) {
		System.out.println("*************************************");
		System.out.println("\n For loop ");
		System.out.println("*************************************");
        char c;
        for(c = 'A'; c <= 'Z'; ++c)
            System.out.print(c + " ");
    	System.out.println("\n *************************************");
		System.out.println("\n While loop ");
		System.out.println("*************************************");
		 c='A';
		while(c<='Z')
		{
			System.out.print(c + " ");	
			++c;
		}
		System.out.println("\n *************************************");
		System.out.println("\n Do while loop ");
		System.out.println("*************************************");
		c='A';
		do 
		{
			System.out.print(c + " ");	
			++c;
		}
		while(c<='Z');
	}

}
