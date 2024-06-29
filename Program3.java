
import java.util.Scanner;

class Program3
{
    public static void main(String[] args) {
        // step 1 create 2 char input
        char ch1 , ch2;
        
        Scanner input = new Scanner(System.in);
        
        ch1 = input.next().charAt(0);

        ch2 = input.next().charAt(0);
        if(ch1 < ch2)
        {
            System.out.println(ch1);
        }
        else{
            System.out.println(ch2);
        }
    }
}