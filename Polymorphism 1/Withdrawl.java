package case_sudy;

import java.util.Scanner;

public class Withdrawl extends Transaction {
	public void execute() {
		double amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw: ");
		amount = sc.nextDouble();
		System.out.println("Withdrawl amount: " + amount);
		sc.close();
	}
}