// run status :true
// 27-06-2024

// find even number between the two number 


import java.util.Scanner;

class EvenNumber
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("enter first Number : ");
		int num1 = input.nextInt();

		System.out.println("enter second Number : ");
		int num2 = input.nextInt();

		for(int i=num1;i<=num2;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+ " ");
			}
		}

	}
}