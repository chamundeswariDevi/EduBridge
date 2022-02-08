package asci;
import java.util.Scanner;
public class Asci {

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		int castascii=(int) ch;
		System.out.println("Enter the Character :"+castascii);
		
		if(castascii>=65 && castascii<=90) 
		{
			System.out.println("The letter is in Uppercase :"+ch);
		}
		else if(castascii>=97 && castascii<=122)
		{
			System.out.println("the letter is in Lowercase :"+ch);
		}
		else if(castascii>=48 && castascii<=57)
		{
			System.out.println("The letter is in numeric :"+ch);
		}
		else
		{
			System.out.println("The given character is special symbol :"+ch);
		}
		
		sc.close();

	}

}
