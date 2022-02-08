package Triangle;
import java.util.Scanner;
public class Triangle {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the a Traiangle value :");
	int a=sc.nextInt();
	System.out.println("Enter the b Traiangle value :");
	int b=sc.nextInt();
	System.out.println("Enter the c Traiangle value :");
	int c=sc.nextInt();
	int t=a+b+c;
	System.out.println("Provided a value is:"+a);
	System.out.println("Provided b value is :"+b);
	System.out.println("Provided c value is :"+c);
	System.out.println("Provided t value is :"+t);
	if(t==180) {
		System.out.println("This is valid Triangle");
	}
	else
	{
		System.out.println("This is not valid Triangle");
	}
sc.close();	
}
}
