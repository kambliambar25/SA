import java.util.Random;
public class cricket {
public static void main(String[] args) {
int arr[]=new int[6];
int sum = 0,i,score=0;
int ara[]=new int[6];
Random abc=new Random();
arr[0]=abc.nextInt(7);
arr[1]=abc.nextInt(7);
arr[2]=abc.nextInt(7);
arr[3]=abc.nextInt(7);
arr[4]=abc.nextInt(7);
arr[5]=abc.nextInt(7);
System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
System.out.println(arr[3]);
System.out.println(arr[4]);
System.out.println(arr[5]);
for(i=0;i<=5;i++)
{
sum = sum + arr[i];
}
System.out.println("Team India Total:" + sum);
ara[0]=abc.nextInt(7);
ara[1]=abc.nextInt(7);
ara[2]=abc.nextInt(7);
ara[3]=abc.nextInt(7);
ara[4]=abc.nextInt(7);
ara[5]=abc.nextInt(7);
System.out.println(ara[0]);
System.out.println(ara[1]);
System.out.println(ara[2]);
System.out.println(ara[3]);
System.out.println(ara[4]);
System.out.println(ara[5]);
for(i=0;i<=5;i++)
{
score = score + ara[i];
}
System.out.println("Team Australia Total:" + score);
if(sum>score) {
	System.out.println("India is winner");
}
	else {
		System.out.println("Australia is winner");	
	}
}
}
