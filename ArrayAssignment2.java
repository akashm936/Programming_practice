import java.util.Scanner;
import java.util.Arrays;

class ArrayAssignment2
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a element of array ");
        
        int arr[5];
        int idx  = 0;
        int max = Integer.MAX_VALUE;

        for(int i=0;i<arr[].length;i++)
        {
        	if(max<arr[i])
        	{
        		idx = i;
        		max = arr[i];
        	}
        }


        System.out.println(max);
	}
}