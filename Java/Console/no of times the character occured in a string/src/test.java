import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		int count=0;
		Scanner sn=new Scanner(System.in);
		String str;
		str=sn.nextLine();
		char a;
		a=sn.next().charAt(0);
				        for(int i=0;i <str.length();i++){
				            if(str.charAt(i) == a){
				            	count++;
				            }			            
				            }
				        System.out.println("Count:"+count);
	}
}
