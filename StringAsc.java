import java.uti.Scanner;

class StringAsc
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a String");
		String name = input.nextLine();

        System.out.println(codePointAt(input));
	}
}