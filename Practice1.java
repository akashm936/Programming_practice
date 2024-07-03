import java.util.Scanner;

class Practice1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a String");
		String name = sc.nextLine();
        int op=0;
		for(int i=0; i<name.length();i++)
		{
			op=name.charAt(i);
			System.out.println(op);
		}
		
	}
}