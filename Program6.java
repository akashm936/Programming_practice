import java.util.Scanner;


public class Program6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int hour = input.nextInt();
        if(hour >= 5 && hour <=11)
        {
            System.out.println("Good Morning");
        }
        else if(hour >=17 && hour <= 20)
        {
           System.out.println("Good Afternoon")
        }
        else if(hour >= 17 && hour <= 20)
        {
            System.out.println("Good Evening");
        }
        else if(hour >= 21 && hour < 24 || hour >=0 && hour <=4)
        {
            System.out.println("Good Night");
        }

        else{
            System.out.println("Invalid Hour");
        }

    }
}
