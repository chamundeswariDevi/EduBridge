package EvenOdd;
import java.util.Scanner;
public class EvenOdd {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		  Scanner scanner=new Scanner(System.in);
			System.out.println("Enter a number : ");
			int num=scanner.nextInt();
			if(num %2 ==0)
			{
				System.out.println(num +"number is even");
			}
			else
			{
				System.out.println(num +"number is odd");
			}
		scanner.close();
		}
		

	}

