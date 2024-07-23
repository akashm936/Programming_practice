import java.util.Scanner;
import java.util.Arrays;

// this program is used to find the gretest element from array

class ArrayAssignment1
{
	public static void main(String[] args) {
		
		int[]a={16,17,4,3,5,2};
		System.out.println(Arrays.toString(a));
	int max = Integer.MIN_VALUE;
	int idx = 0;

	for(int i=0;i<a.length;i++)
	{
		if(max<a[i])
		{
			idx =i;
			max =a[i];
		}
	}

	System.out.println(max);
	}
}