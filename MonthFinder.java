// run status : true

// 25-06-2024
                   
// program is used to find name of month using number

import java.util.Scanner;

class MonthFinder
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int month;
		System.out.println("Enter a Number :");
        month = sc.nextInt();

        switch(month)
        {
        case 1 : {
        	System.out.println("janwary");
        	break;
        }
        case 2 :{   
    	    System.out.println("Febwary");
    	    break;
        }
        case 3 : {
        	System.out.println("March");
        	break;
        }
        case 4 :{
    	    System.out.println("April");
    	    break;
        }

        case 5 : {
        	System.out.println("May");
        	break;
        }
        case 6 :{
    	    System.out.println("june");
    	    break;
        }

        case 7 : {
        	System.out.println("July");
        	break;
        }
        case 8 :{
    	    System.out.println("August");
    	    break;
        }
        case 9 : {
        	System.out.println("September");
        	break;
        }
        case 10 :{
    	    System.out.println("October");
    	    break;
        }
        case 11 : {
        	System.out.println("November");
        	break;
        }
        case 12 :{
    	    System.out.println("December");
    	    break;
        }
        default : {
        	System.out.println("invalid Month");
        } 
        }
	}
}