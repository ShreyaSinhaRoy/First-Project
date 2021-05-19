package case_sudy;

public class Deposit extends Transaction {
	private double amount;
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
public  void execute() {
		System.out.println("Deposited amount: " + this.amount);
	}
}
