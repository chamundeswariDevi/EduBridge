package LeapYear;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the year :");
    int Year=sc.nextInt();
    System.out.println("The Year is:"+Year);	
    if(Year % 4==0)
    {
    	System.out.println("This year is a leap  year ");
    }
    else
    {
    	System.out.println("This is not a leap year ");
    }
    sc.close();

	}
}

