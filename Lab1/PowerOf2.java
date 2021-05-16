/* Create a method to check if a number is a power of two or not

Method Name:- checkNumber 
Method Description:- Checks if the entered number is a power of two or not 
Argument:- int n 
Return Type:- boolean 
Logic:- 	Check if the input is a power of two. 
            Ex: 8 is a power of 2  */

package lab1;

import java.util.Scanner;

public class PowerOf2 {
	public static boolean checkNumber(int n)
	{
		while (n%2==0)
		{
			n = n/2;
		}
		if (n==1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
	      int n;
	      boolean F;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number: ");
	      n = sc.nextInt();
	      F=checkNumber(n);
	      if (F==true)
	    	  System.out.println("Power Of 2");
	      else
	    	  System.out.println("Not Power Of 2");
           sc.close();
	}

}
