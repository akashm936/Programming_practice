import java.util.Scanner;

class Program4
{
    public static void main(String[] args) {
        
        int ramu, raghu, raju;
        Scanner input = new Scanner(System.in);

        ramu = input.nextInt();
        raghu = input.nextInt();
        raju = input.nextInt();
    
        if(ramu<0 || raghu <0 || raju <0)
        {
            System.out.println("age is invalid");
        }
        else if(ramu < raghu && ramu < raju )
    }
}