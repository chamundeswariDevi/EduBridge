package Subject;
import java.util.Scanner;
public class Subject {
	public static void main(String args[]) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the 5 Subjects marks");
		        int maths=sc.nextInt();
		       
		        int english=sc.nextInt();
		       
		        int telugu=sc.nextInt();
		       
		        int hindi=sc.nextInt();
		        
		        int science=sc.nextInt();
		       int percentage=((maths+english+telugu+hindi+science)*100)/500;
		       System.out.println(" The percentage is :"+percentage);
		        if(percentage>=60)
		        {
		            System.out.println("First division");
		        }
		        else if(percentage>=50 &&50<=59)
		        {
		            System. out. println("Second division");
		        }
		       else if(percentage>=40 && 40<=49)
		       {
		           System. out. println("Third division");
		       }
		       else{
		           System. out. println("Fail");
		       }
		        sc.close();
		    }
}
		