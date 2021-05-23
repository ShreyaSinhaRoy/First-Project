/*  Create a class containing a method to create the mirror image of a String. The method should return the two Strings
 *  separated with a pipe(|) symbol .
 
 Method Name:- 	getImage 
Method Description:- 	Generate the mirror image of a String and add it to the existing string. 
Argument:- 	String 
Return Type:- 	String 
Logic:- 	Accepts One String 

Find the mirror image of the String 
Add the two Strings together separated by a pipe(|) symbol. 
For Example 
Input : EARTH 
Output : EARTH|HTRAE 
Hint: Use StringBuffer API (Ex: For this problem reverse method in Stringbuffer can be used) 
Note: Learn the other APIs in StringBuffer  */

package lab3;

import java.util.Scanner;

public class MirrorImage {
	public static String getImage (String S) {
		StringBuffer  S1 = new StringBuffer(S);
		S1.reverse();
		String A = S1.toString();
		return A;
	}

	public static void main(String[] args) {
		String S1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		S1 = getImage(str);
		System.out.println(str + "|" + S1);
        sc.close();
	}
}
