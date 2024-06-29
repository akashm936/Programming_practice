// run status  : true

// 29-06-2024


import java.util.Scanner;

public class Program5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
      
        if(num1 > num2 && num1 >num3 && num1 > num4)
        {
            System.out.println(num1);
        }
        else if(num2 > num3 && num2 > num4)
        {
            System.out.println(num2);
        }
        else if(num3 > num4)
        {
            System.out.println(num3);
        }
        else{
            System.out.println(num4);
        }
    }
}
