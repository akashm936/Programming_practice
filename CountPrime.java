// run status : false

//27-06-2024
// remaning

import java.util.Scanner;

class CountPrime
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int m = input.nextInt();
		int n = input.nextInt();

		int count =0;

		for(int i=m;i<=n;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(m%2==0)
				{
					count++;
					System.out.println(count);
				}
			}
		}
	}
}