/* Write a Java program that reads a line of integers and then displays each integer and the sum of all integers. 
 * (Use String Tokenizer class)? */

package lab3;

import java.util.StringTokenizer;
import java.util.Scanner;

public class IntegerSum {
     public static void main(String[] args) {
    	 
    	 int S=0;
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.println("Enter the values: ");
    	 String values = sc.nextLine(); 
    	 
    	 System.out.print("The given values are: ");
    	 StringTokenizer st = new StringTokenizer(values," ");  
         while (st.hasMoreTokens()) { 
        	 String str = (String)st.nextElement();
              System.out.print(str + " ");  
              int A = Integer.parseInt(str);
              S = S + A;
          }
         System.out.println("\nSum: " + S);
         sc.close();
    }
}