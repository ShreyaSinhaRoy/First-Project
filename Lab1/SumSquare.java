/*  Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.

Method Name:- 	calculateDifference 
Method Description:- 	Calculate the difference 
Argument:- 	int n 
Return Type:- 	int - Sum 
Logic:- 	Find the difference between the sum of the squares of the first n natural numbers and the square of their sum. 
For Example if n is 10,you have to find  (1^2+2^2+3^2+….9^2+10^2) - (1+2+3+4+5…+9+10)^2    */

package lab1;

import java.lang.Math;
import java.util.Scanner;

public class SumSquare {
	public static double calculateDifference(int N)
	{
		double S1=0,S2=0,S=0,i;
		for(i=1;i<=N;i++)
		{
			S1 = S1 + Math.sqrt(i);
		}
		for(i=1;i<=N;i++)
		{
			S2 = S2 + i;
		}
		S =Math.sqrt(S2);
		return (S1-S);
	}

	public static void main(String[] args) {
	        int n;
	        double D;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter n: ");
	        n = sc.nextInt();
	        D = calculateDifference(n);
	        System.out.println("Difference: " + D);
            sc.close();
	}
}
