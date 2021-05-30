package com.capgemini.BankATMSystem;

import java.util.Scanner;

public class ATM extends SavingsAccount{

	private double withdrawAmount;
	private double depositeAmount;
	private SavingsAccount sa = SavingsAccount.getInstance();
	private static ATM single_instance_atm = null;
	Scanner sc = new Scanner(System.in);
	
	private ATM(){
		
	}
	
	public static ATM getAtminstance()
	{
		if(single_instance_atm == null)
		{
			single_instance_atm = new ATM();
		}
		
		return single_instance_atm;
	}
	
	//getters and setters
	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public double getDepositeAmount() {
		return depositeAmount;
	}

	public void setDepositeAmount(double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}
	public SavingsAccount getSa() {
		return sa;
	}

	public void setSa(SavingsAccount sa) {
		this.sa = sa;
	}
	
	protected void DepositeAmount(long accNo, String pin)
	{
		for(int i=0; i<sa.savingsList.size(); i++)
		{
			if(sa.savingsList.get(i).getAccountNumber() == accNo && sa.savingsList.get(i).getPin().equals(pin) && sa.savingsList.get(i).getFlag() == 1)
			{
				sa.savingsList.get(i).setOpenningBalance(sa.savingsList.get(i).getOpenningBalance()+getDepositeAmount());
				System.out.println("Amount Deposited");
			}
			else
			{
				System.out.println("Chceck your Account No. or Pin");
			}
		}
	}

	protected void WithdrawAnount(long accNo, String pin)
	{
		for(int i=0; i<sa.savingsList.size(); i++)
		{
			if(sa.savingsList.get(i).getAccountNumber() == accNo && sa.savingsList.get(i).getPin().equals(pin) && sa.savingsList.get(i).getFlag()==1)
			{
				if(sa.savingsList.get(i).getOpenningBalance() - getWithdrawAmount() > 5000)
				{
					sa.savingsList.get(i).setOpenningBalance(sa.savingsList.get(i).getOpenningBalance()-getWithdrawAmount());
					System.out.println("Amount Withdrawn");
				}
				else
				{
					System.out.println("Mr. "+sa.savingsList.get(i).getName()+", you do not have sufficient amount to withdraw.");
				}
			}
			else
			{
				System.out.println("Chceck your Account No. or Pin");
			}
		}
	}
	
	protected void CheckBalance(long accNo, String pin)
	{
		
		for(int i=0; i<sa.savingsList.size(); i++)
		{
			if(sa.savingsList.get(i).getAccountNumber() == accNo && sa.savingsList.get(i).getPin().equals(pin) && sa.savingsList.get(i).getFlag()==1)
			{
				System.out.println("-----------------------------------------------------------");
				System.out.println("Name: "+sa.getName());
				System.out.println("Account No.: "+sa.getAccountNumber());
				System.out.println("-----------------------------------------------------------");
				System.out.println("");
				System.out.println("Current Balance "+"                                   "+sa.getOpenningBalance() );
				System.out.println("");
				System.out.println("-----------------------------------------------------------");
			}
			else
			{
				System.out.println("Chceck Account No. or Pin");
			}
		}
	}
	
	protected void ChangePin(long accNo, String pin)
	{
		System.out.println("Enter new 4 digit pin: ");
		for(int i=0; i<sa.savingsList.size(); i++)
		{
			if(sa.savingsList.get(i).getAccountNumber() == accNo && sa.savingsList.get(i).getPin().equals(pin) && sa.savingsList.get(i).getFlag()==1)
			{
				sa.savingsList.get(i).setPin(sc.nextLine());
				System.out.println(sa.getPin());
			}
			else
			{
				System.out.println("Chceck Account No. or Pin");
			}
		}
		
	}
	
}
