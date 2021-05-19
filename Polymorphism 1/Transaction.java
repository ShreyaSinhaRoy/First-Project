package case_sudy;

public class Transaction {
    int accountNumber;
    
    public int getAccountNumber() {
		return accountNumber;
	}

    public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

    public  void execute () {
         System.out.println("Transaction is performed");
    }
}

