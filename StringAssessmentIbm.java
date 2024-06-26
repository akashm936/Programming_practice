// run status : true
//27-06-2024

import java.util.Scanner;
import java.util.*;

class StringAssessmentIbm
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a String :");
		String str=input.nextLine();

		String []words = str.split(" ");
		String op= "";
		System.out.println(Arrays.toString(words));

		int max =0;
		for(String i : words)
		{
			int len=i.length();
			if(max<len&&len%2==0)
			{
				max=len;
				op=i;
			}
		}
		System.out.println(str+" : "+ op);
	}
}