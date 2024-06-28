class LcmMethod
{

	public static int lcmMe(int num1,int num2)
	{

		for(; ; i++)
		{
			if(i%num1==0&&i%num2==0)
			{
				System.out.println("The LCM is :"+i);
			}
		}

	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Number");
		int num1 = input.nextInt();
		System.out.println("Enter a second number : ");
		int num2 = input.nextInt();
         
        LcmMethod obj = new LcmMethod();
		obj.lcmMe();
	}
}