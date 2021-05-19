package case_sudy;

public class Banking {

	public static void main(String[] args) {
	   Transaction T = new Transaction();
	   Withdrawl W = new Withdrawl();
	   Deposit D = new Deposit();
	   BalanceInquiry B = new BalanceInquiry();
	   
	   T.getAccountNumber();
	   T.execute();
       W.execute();
       D.execute();
       B.execute();
	}

}
