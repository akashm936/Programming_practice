import java.util.Scanner;

class PrimeNumber1
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();

		int count =2;

		for(int i=2;i<=num/2;i++){
			if(num%i==0)
			{
				count++;
			}
		}
		if(count ==2)
		{
			System.out.println("is prime");
		}
		else{
			System.out.println("it is not prime ");
		}
	}
}