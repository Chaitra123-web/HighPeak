package javaPack;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HighPeakCoding 
{
	static int minimum(int [] cost, int n, int k)
	{
		int output = Integer.MAX_VALUE;
		Arrays.sort(cost);
		for(int i=0; i<=n-k; i++)
			output = Math.min(output,  cost[i+k-1] - cost[i]);
		return output;
	}
	
	static int getting(int res, int cost[], int n, int k)
	{
		int output = Integer.MAX_VALUE;
		for(int i=0; i<=n; i++)
		{
			output= Math.min(output, cost[i+k-1] - cost[i]);
			if(res==output)
				return 1;
		}
		return 0;
	}
	public static void main(String[] args) throws IOException
	{
		int cost[] = 
			{
					7980,22349,999,2799,229900,11101,9999,2195,9800,4999
			};
		String items[] = 
			{
					"Fitbit Plus: 7980",
					"IPods: 22349",
					"MI Band: 999",
					"Cult Pass: 2799",
					"Macbook Pro: 229900",
					"Digital Camera: 11101",
					"Alexa: 9999",
					"Sandwich Toaster: 2195",
					"Microwave Oven: 9800",
					"Scale: 4999"
			};
		int n= cost.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Employees: ");
		int k = sc.nextInt();
		int result = minimum(cost, n, k);
		System.out.println("Number of Employees: " +k);
		int start = getting(result, cost, n, k);
		System.out.println("Here the input items that are selected for distribution are: ");
		for(int i =start; i<start+k; i++)
			System.out.println(items[i]);
		System.out.println("And the difference between the choosen goodie with highest price and the lowest price is : " +result);
	}

}
