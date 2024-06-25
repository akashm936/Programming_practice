import java.util.Scanner;
class compare
{
	public static void main(String[] args) {
		
		int num1 ,num2;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num1 : ");
        num1 = sc.nextInt();

        System.out.println("enter num2 : ");
        num2 = sc.nextInt();

		if(num1>num2)
		{
			System.out.println("the largest element is : "+num1);
		}
		else{
			System.out.println("the largest number is  : "+num2 );
		}
	}
}