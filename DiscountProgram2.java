import java.util.Scanner;

class DiscountProgram2
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int price = input.nextInt();
		double discount = 0;

		if(price > 500)
		{
			discount = price-(price*0.10);
		}
		else if(price >= 250 && price <=500)
		{
			discount = price -(price*0.05);
		}
        System.out.println("original price : ");
		System.out.println("Discount Price : "+discount);
	}
}