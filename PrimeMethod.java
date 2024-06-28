import java.util.Scanner;

// design a method if number is prime return true
// 
class PrimeMethod
{

	public static boolean primeMethod(int num){
		int count = 2;
		for(int i=2;i<=num/2;i++)
		{
			if(num%2==0)
			{
				count++;
			}
		}
		return count == 2;
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		if(primeMethod(num))
		System.out.println("it is prime");
		else
		System.out.println("it is not a prime");
	
	
		// for(int i=10;i<=20;i++)
		// {
		// 	if(primeMethod(i))
		// 	{
		// 		System.out.println(i);
		// 	}
		// }	
	}

}