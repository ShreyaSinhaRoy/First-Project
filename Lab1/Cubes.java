package lab1;
//  Create a method to find the sum of the cubes of the digits of an n digit number

import java.util.Scanner;

public class Cubes {
	public static int sum(int N) {
		int x,S=0;
		while(N!=0) {
			x = N%10;
			S = S + (x*x*x);
			N = N/10;
		}
		return S;
	}
    public static void main(String[] args) {
		int n,Result;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Result = sum(n);
        System.out.println("Answer: " + Result);
        sc.close();
	}
}
