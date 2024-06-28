import java.util.Scanner;

class ConvertString
{
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);

		System.out.println("Enter a String");
		int sa = input.nextLine().LowerCase();

		for(int i=0;i<sa.length();i++)
		{
			if(i%2==0)
			{
				sa= sa.charAt(0).upperCase();
			}
		}
	}
}