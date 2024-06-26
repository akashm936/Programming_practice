// run status  : true
//26-06-2024

import java.util.Scanner;

class FindFactor

{
	public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");		
		int num = input.nextInt();
		int count = 2; 
        //int result = 0;
        for(int i=1;i<=num/2;i++)
        {
        	if(num%i==0)
        	{
        		 System.out.print(i + " , ");
        		 count++;
        	}
        	
        }
        System.out.println(num);
        System.out.println("number of Factor : "+ count);
       
	}
}