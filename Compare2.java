import java.util.Scanner;

class Compare2
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        char char1,char2;
		System.out.println("Enter a char : ");
		char1= sc.next().charAt(0);

		System.out.println("Enter a char2 : ");
		char2 = sc.next().charAt(0);

		if(char1<char2)
		{
			System.out.println("the smallest : " +char1);
		}
		else{
			System.out.println("the smallest : "+char2);
		}

	}
}