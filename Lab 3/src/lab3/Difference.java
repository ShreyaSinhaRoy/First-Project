package lab3;
import java.util.*;
public class Difference {
	public static int modifyNumber(int number1)
	{
		String s = String.valueOf(number1);
		StringBuffer sb = new StringBuffer();
		char ch[] = new char[s.length()];
		for(int i=0; i<s.length(); i++)
		{
			ch[i] = s.charAt(i);
		}
		for(int i=0; i<s.length()-1; i++)
		{
				int n = Math.abs(Integer.parseInt(String.valueOf(s.charAt(i))) - Integer.parseInt(String.valueOf(s.charAt(i+1))));
				sb.append(n);
		}
		return Integer.valueOf(sb.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int num = modifyNumber(n);
		System.out.println("Difference between two consecutive digits: "+num);
		sc.close();
	}

}
