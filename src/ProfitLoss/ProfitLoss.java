package ProfitLoss;
import java.util.Scanner;
public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the costPrice :");
		int costPrice=sc.nextInt();
		System.out.println("Enter the sellingPrice :");
		int sellingPrice=sc.nextInt();
		int differencePrice=sellingPrice-costPrice;
		System.out.println("The costprice is :"+costPrice);
		System.out.println("The sellingPrice is:"+sellingPrice);
		System.out.println("The differencePrice is :"+differencePrice);
		if(differencePrice>0) {
			System.out.println("The seller got profit :"+differencePrice);
			}
		else
		{
			System.out.println("The seller got loss :" +Math.abs(differencePrice));
			
		}
     sc.close();
	}

}
