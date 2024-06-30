// run status : 

//30-06-2024


// ths program is check the range of temperature
import java.util.Scanner;
class Program7
{
	public static void main(String[] args) {
		
		double max_temp = 80.0 , min_temp = 70;
	    Scanner sc = new Scanner(System.in);

	    double cur_temp = sc.nextDouble(); 
	     cur_temp = cur_temp*(9.0/5)+32;

	     System.out.println(cur_temp);
         
         if(cur_temp >= min_temp && cur_temp <= max_temp)
         {
         	System.out.println("temperature is within the range");
         }
	}
}