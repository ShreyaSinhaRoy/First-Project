/* Create a method to check if a number is an increasing number
Method Name:- 	checkNumber 
Method Description:- 	Check if a number is an increasing number 
Argument:- 	int number 
Return Type:- 	boolean 
Logic:- 	A number is said to be an increasing number if no digit is exceeded by the digit to its left. 
For Example : 134468 is an increasing number   */

package lab1;

import java.util.Scanner;

public class Increasing_Number {
	public static boolean checkNumber(int N)
	{
		int x,F=0;
		int[]  A = new int[10];
		int i=0;
		while (N!=0)
		{
			x = N%10;
			A[i] = x;
			N = N/10;
			i++;
		}
		i--;
		
		/* After extraction the last digit comes first in the array so the number gets reversely stored in the array therefore 
		 * inside the for loop we have to reverse the checking condition also. */
		 
		for(i=0;i<A.length-1;i++)
		{
			if (A[i+1]>A[i])
			{
				F=1;
				break;
			} 
		} 
		if (F==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int N;
		boolean B;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		N = sc.nextInt();
		B = checkNumber(N);
		if (B==true)
			System.out.println("Increasing Number");
		else
			System.out.println("Not Increasing Number");
		sc.close();
      }
}
