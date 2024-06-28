import java.util.Scanner;

class ConvertString
{
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);

		System.out.println("Enter a String");
		String sa = input.nextLine().toLowerCase();

        String newString ="";

		for(int i=0;i<sa.length();i++)
		{
			if(i%2==0)
			{
				newString = newString+sa.substring(i,i+1).toUpperCase();
			}
			else
			{
				newString = newString+sa.substring(i,i+1);
			}
		}
		System.out.println("Before converting : "+sa );
		System.out.println("After converting : "+newString);
	}
}


//wajp to remove the repeated character in given String

