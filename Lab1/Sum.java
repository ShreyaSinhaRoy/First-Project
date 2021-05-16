/*  Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.

Method Name: 	calculateSum 
Method Description: 	Calculate Sum 
Argument: 	int n 
Return Type: 	int-sum 
Logic: 	Calculate the sum of first n natural numbers which are divisible by 3 or 5.  */

package lab1;

import java.util.Scanner;

public class Sum {
	public static int calculatesum(int n)
	{
		int S=0,i;
		for (i=1;i<=n;i++)
		{
			if (i%3==0 || i%5==0)
				S = S + i;
		}
		return S;
	}

	public static void main(String[] args) {
		int n,Sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n = sc.nextInt();
		Sum=calculatesum(n);
		System.out.println("Result: " + Sum);
        sc.close();
	}
}
