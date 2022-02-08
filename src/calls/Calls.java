package calls;
import java.util.Scanner;
public class Calls {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Telephone call number");
		int calls=sc.nextInt();;
		if(calls<=100) {
			int bill=200;
			System.out.println("The bill is :"+bill);
			}
		else if(calls>=100 && calls<150) {
			calls=calls-100;
			double bill=200+ (0.60*calls);
			System.out.println("The bill is :"+bill);
		}
		else if(calls>=100 && calls<200) {
			calls=calls-150;
			double bill=200+ (0.60*50)+(0.50*calls);
			System.out.println("The bill is :"+bill);
		}
		else if(calls>=200) {
			calls=calls-200;
			double bill=200+(0.60*50)+(0.50*50)+(0.40*calls);
			System.out.println("The bill is :"+bill);
		}
		else
		{
			System.out.println("Invalid");
		}
	sc.close();
	}
	
}

	