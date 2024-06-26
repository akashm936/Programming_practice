// run status  : true

//26-06-2024


import java.util.Scanner;

//FactorialProgram.

class FindFactorial{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int result  = 1;
		System.out.println("Enter a Number");
        int num = input.nextInt();
        for(int i=2;i<=num;i++)
        {
        	result *=i;
        }
        
        System.out.println("Factorial of "+num+" is "+result); 
	}
}
