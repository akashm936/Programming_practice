// run status  :

//28-07-2024
import java.util.Scanner;

class LcmMethod
{

	public void lcmMe(int num1,int num2){

		for(int i=0; ; i++)
		{
			if(i%num1==0&&i%num2==0)
			{
				System.out.println("The LCM is :"+i);

				break;
			}
			//return 0;
		}

	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Number");
		int num1 = input.nextInt();
		System.out.println("Enter a second number : ");
		int num2 = input.nextInt();
         
        LcmMethod o = new LcmMethod();
		o.lcmMe(num1,num2);
	}
}