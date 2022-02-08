package grosssalary;
import java.util.Scanner;
public class grosssalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the basic salary :");
     int basicSalary=scanner.nextInt();
     int hra;
     int da;
     int grosssalary;
     System.out.println("The basiicSalary is :"+ basicSalary);
     if(basicSalary<1500) {
    	 hra=(basicSalary*10)/100;
    	 da=(basicSalary*90)/100;
    	 System.out.println("The hra is :"+hra);
    	 System.out.println("The a is :"+da);
    	 grosssalary=basicSalary+hra+da;
    	 System.out.println("The grosssalary is :"+grosssalary);
     }
     else {
    	 hra=500;
    	 da=(basicSalary*98)/100;
    	 System.out.println("The hra is :"+hra);
    	 System.out.println("The a is :"+da);
    	 grosssalary=basicSalary+hra+da;
    	 System.out.println("The grosssalary is :"+grosssalary);
     }
     scanner.close();
	}

}
