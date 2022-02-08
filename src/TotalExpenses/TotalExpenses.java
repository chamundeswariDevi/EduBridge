package TotalExpenses;
public class TotalExpenses 
{
	public static void main(String[] args) {
		int q=9;
		float p=1000;
		double t=0;
		t=q*p;
		System.out.println("the total expenditure is :"+t);
		if(t>5000) {
			double discount=t/10;
			System.out.println("the  discount is eligible :"+discount);
			System.out.println("the  amount  is payable :"+(t-discount));
		}
		else
		{
			System.out.println("not eligible for discount");
			System.out.println("the  amount  is payable :"+t);
		}
		
	}
}

