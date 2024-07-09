import java.util.Scanner;

class PrintFExample
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("==========================");
        for(int i=0;i<3;i++)
        {
        	String input1 = scanner.next();
        	int input2 = scanner.nextInt();
        	System.out.printf(" %-14s , %03d\n",input1,input2);
        }
    }     

}