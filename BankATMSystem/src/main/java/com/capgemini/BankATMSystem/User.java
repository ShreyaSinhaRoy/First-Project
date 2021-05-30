package com.capgemini.BankATMSystem;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	
	public static String CheckName(String name)
	{
		String regex = "^[a-zA-Z]\\D{3,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);
		if(matcher.matches() && name != null)
			return name;
		else
			return null;
	}
	
	public static int CheckAge(int age)
	{
		if(age>=18)
			return age;
		else
			return 0;
	}
	
	public static String CheckEmail(String email)
	{
		String regex = "^[A-Za-z0-9+_.-]+@(.+)\\.(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches())
			return email;
		else
			return null;
	}
	
	public static String CheckMobile(String mobile)
	{	
		String regex = "[0-9]{10}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobile);
		if(matcher.matches())
			return mobile;
		else
			return null;
	}
	
	public static String checkPin(String pin)
	{
		String regex = "[0-9]{4,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pin);
		if(matcher.matches())
			return pin;
		else
			return null;
	}
	public static long checkAccountNumber(long accNO)
	{
		String regex = "\\d{4,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(String.valueOf(accNO));
		if(matcher.matches())
			return accNO;
		else
			return 0;
	}
	public static double checkBalance(double bal)
	{
		if(bal > 5000)
			return bal;
		else 
			return 0;
	}
	public static void takeAccountNumber()
	{
		SavingsAccount sa = SavingsAccount.getInstance();
		Scanner sc = new Scanner(System.in);
		long accNo = checkAccountNumber(sc.nextLong());
		if(accNo != 0)
			sa.setAccountNumber(accNo);
		else {
			System.out.println("Enter a valid account number.");
			System.out.print("Account Number: ");
			takeAccountNumber();
		}
	}
	public static void takeBalance()
	{
		SavingsAccount sa = SavingsAccount.getInstance();
		Scanner sc = new Scanner(System.in);
		
		double bal = checkBalance(sc.nextDouble());
		if(bal != 0)
			sa.setOpenningBalance(bal);
		else {
			System.out.println("Enter a valid amount");
			System.out.println("Account Openning Balance: ");
			takeBalance();
		}
	}
	public static void takePin()
	{
		SavingsAccount sa = SavingsAccount.getInstance();
		Scanner sc = new Scanner(System.in);
		String pin = checkPin(sc.nextLine());
		if(pin != null)
			sa.setPin(pin);
		else
		{
			System.out.println("Enter a valid pin number.");
			System.out.println("Pin Number: ");
			takePin();
		}
	}
	public static void takeName()
	{
		SavingsAccount sa = SavingsAccount.getInstance();
		Scanner sc = new Scanner(System.in);
		String name = CheckName(sc.nextLine());
		if(name != null)
			sa.setName(name);
		else
		{
			System.out.println("Enter a valid name.");
			System.out.print("Name: ");
			takeName();
		}
	}
	public static void takeAge()
	{
		SavingsAccount sa = SavingsAccount.getInstance();
		Scanner sc = new Scanner(System.in);
		int age =  CheckAge(sc.nextInt());
		if(age > 0)
		{
			sa.setAge(age);
		}
		else {
			System.out.println("Enter a valid age.");
			System.out.print("Age: ");
			takeAge();
		}
	}
	public static void takeEmail()
	{
		SavingsAccount sa = SavingsAccount.getInstance();
		Scanner sc = new Scanner(System.in);
		String email = CheckEmail(sc.nextLine());
		if(email != null)
			sa.setEmail(email);
		else
		{
			System.out.println("Enter a valid email.");
			System.out.print("Email: ");
			takeEmail();
		}
	}
	public static void takeMobile()
	{
		SavingsAccount sa = SavingsAccount.getInstance();
		Scanner sc = new Scanner(System.in);
		String mobile = CheckMobile(sc.nextLine());
		if(mobile != null)
			sa.setMobileNo(mobile);
		else {
			System.out.println("Enter a valid mobile number");
			System.out.print("Mobile number: ");
			takeMobile();
		}
	}
	public static void takeUserInput() throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SavingsAccount sa = SavingsAccount.getInstance();
		sa.setFlag(1);
		System.out.println("Customer's Personal Details: ");
		System.out.println("-----------------------------------------------------------");
		
		//NAME
		System.out.print("Name: ");
		takeName();
	
		//AGE
		System.out.print("Age: ");
		takeAge();
		
		//DOB
		System.out.print("Date of birth: ");
		String dt = sc.nextLine();
		Date date = sdf.parse(dt);
		sa.setDob(date);
		
		//EMAIL
		System.out.print("Email: ");
		takeEmail();
	
		//MOBILE NUMBER
		System.out.print("Mobile Number: ");
		takeMobile();
	
		System.out.println("-----------------------------------------------------------");
		System.out.println("Customer's Savings Account Details: ");
		System.out.println("-----------------------------------------------------------");
		
		//ACCOUNT NUMBER
		System.out.print("Account Number: ");
		takeAccountNumber();
		
		//PIN
		System.out.print("Pin: ");
		takePin();
	
		//BALANCE
		System.out.print("Openning Balance: ");
		takeBalance();
		
		System.out.println("-----------------------------------------------------------");
		sa.createSavingsAccount(sa);
	}
	
	public static void displayUser()
	{
		Scanner sc = new Scanner(System.in);
		SavingsAccount sa = SavingsAccount.getInstance();
		System.out.print("Enter Account Number: ");
		int accNo = sc.nextInt();
		System.out.println("Diplaying Account Details: ");
		System.out.println("-----------------------------------------------------------");
		sa.diplayAccount(accNo);
		System.out.println("-----------------------------------------------------------");
	}
	
	public static void closeAccount()
	{
		Scanner sc = new Scanner(System.in);
		SavingsAccount sa = SavingsAccount.getInstance();
		System.out.println("-----------------------------------------------------------");
		System.out.print("Enter Account Number: ");
		int accNo = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Account PIN: ");
		String pin = sc.nextLine();
		System.out.println("-----------------------------------------------------------");
		sa.deleteSavingsAccount(accNo, pin);
		System.out.println("-----------------------------------------------------------");
	}

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ATM atm = ATM.getAtminstance();
		
		char ch,atm_ch; 
		
		do
		{
			System.out.println("Eneter 1 : Create Account"+"\t\t"+"Enter 2: View Account\n");
			System.out.println("Eneter 3 : Close Account"+"\t\t"+"Enter 4: ATM");
			System.out.println("\nEnter your choice: ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1: 
				takeUserInput();
				break;
			case 2:
				displayUser();
				break;
			case 3:
				closeAccount();
				break;
			case 4:	 
			
				do
				{	
					System.out.println("Eneter 1 : Deposite"+"\t\t\t"+"Enter 2 : Withdraw\n");
					System.out.println("Eneter 3 : Check Balance"+"\t\t"+"Enter 4 : Change Pin");
					System.out.println("Enter your choice: ");
					int atm_choice =  sc.nextInt();
					switch(atm_choice)
					{
					case 1:
						System.out.println("-----------------------------------------------------------");
						System.out.println("Enter Account Number : ");
						int accNo = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter Account Pin Number : ");
						String pin = sc.nextLine();
						System.out.println("Enter Deposite Amount");
						double amount = sc.nextDouble();
						atm.setDepositeAmount(amount);
						System.out.println("-----------------------------------------------------------");
						atm.DepositeAmount(accNo, pin);
						
						System.out.println("-----------------------------------------------------------");
						break;
					case 2:
						System.out.println("-----------------------------------------------------------");
						System.out.println("Enter Account Number : ");
						int accNo_w = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter Account Pin Number : ");
						String pin_w = sc.nextLine();
						System.out.println("Enter Withdrawal Amount");
						double amount_w = sc.nextDouble();
						atm.setWithdrawAmount(amount_w);
						System.out.println("-----------------------------------------------------------");
						atm.WithdrawAnount(accNo_w, pin_w);
						System.out.println("-----------------------------------------------------------");
						break;
					case 3:
						System.out.println("-----------------------------------------------------------");
						System.out.println("Enter Account Number : ");
						int accNo_s = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter Account Pin Number : ");
						String pin_s = sc.nextLine();
						System.out.println("-----------------------------------------------------------");
						atm.CheckBalance(accNo_s, pin_s);
						System.out.println("-----------------------------------------------------------");
						break;
					case 4:
						System.out.println("-----------------------------------------------------------");
						System.out.println("Enter Account Number : ");
						int accNo_c = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter Old Pin Number : ");
						String pin_c = sc.nextLine();
						System.out.println("Enter New Pin Number : ");
						String pin_n_c = sc.nextLine();
						atm.setPin(pin_n_c);
						atm.ChangePin(accNo_c, pin_c);
						System.out.println("-----------------------------------------------------------");
						break;
					default:
						System.out.println("-----------------------------------------------------------");
						System.out.println("Sorry, wrong choice.");
						System.out.println("-----------------------------------------------------------");
					}
					System.out.println("Enter y to continue.");
					atm_ch = sc.next().trim().charAt(0);
				}while(atm_ch == 'y');
				break;
			default:
				System.out.println("Sorry, wrong choice.");
			}
		System.out.println("Enter y to continue.");
		ch = sc.next().trim().charAt(0);
		}while(ch =='y');
		
		sc.close();	
	}

}
