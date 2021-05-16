package lab1;
import java.util.Scanner;

/*Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green 
 * with radio buttons. On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the 
 * console .Initially there is no message shown. */

public class Traffic {

	public static void main(String[] args) {
		String ch;
		System.out.println("Enter a choice: ");
		Scanner sc = new Scanner(System.in);
		ch = sc.next();
		switch(ch)
		{
		case "Red": System.out.println("Go");      
		              break;
		case "Yellow":System.out.println("Ready");   
		             break;
		case "Green":System.out.println("Stop");   
		             break;
		default: System.out.println("Invalid choice");             
		}
		sc.close();
	}
}
