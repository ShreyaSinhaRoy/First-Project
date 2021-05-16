// Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?

package lab1;

import java.util.Scanner;

public class Primes {
	public static int check(int P)
	{
		int i,C=0;
		for(i=1;i<=P;i++)
		{
			if (P%i==0)
				C++;
		}
		if (C==2)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		int n,F=0,i;
		System.out.println("Enter an integer: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("The prime numbers are: ");
	    for (i=1;i<=n;i++)
	     {
	        F = check(i);
	        if (F==1)
	        	System.out.print(i + " " );
	      }
		sc.close();
	}
}
