package com.capgemini.lab9.exercise1;

import java.util.Scanner;

/**
 * Main program using Lambda Expression for computing power of a number
 * @author Shreya Sinha Roy
 *
 */

public class ExponentsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sm=new Scanner(System.in); // Scanner object creation 
		ExponentsUsingLambdaExpression e = (x,y)->{ 
			int product=1;
			for(int i=1;i<=y;i++)
				product*=x;
			return product; // returning the result
		};

		System.out.print("Enter the base number : ");
		int x=sm.nextInt();
		int y;
		do {
			System.out.print("Enter the power : ");
			y=sm.nextInt();
			if(y<0) {
				System.out.println("Enter a positive number only...Try Again...");
			}
		}while(y<0);

		System.out.printf("\nThe value is %d^%d = %d.",x,y,e.power(x, y));
		
		sm.close();
	}

}
