package com.capgemini.BankATMSystem;

import java.util.ArrayList;

public class SavingsAccount extends Account {
	
	ArrayList<SavingsAccount> savingsList = new ArrayList<SavingsAccount>();
	static int i = 0;
	private static SavingsAccount single_instance = null;
	protected SavingsAccount(){
		
	}

	public static SavingsAccount getInstance() {
		if(single_instance == null)
		{
			single_instance = new SavingsAccount();
		}
		return single_instance;
	}
	
	//create
	protected void createSavingsAccount(CustomerImpl sa)
	{
		savingsList.add((SavingsAccount) sa);
		System.out.println("Mr. "+savingsList.get(i).getName()+", your savings account is created.");
		i = i+1;
	}
	
	//delete
	protected void deleteSavingsAccount(long accNo, String pin)
	{
		int check = 1;
		for(int i=0; i<savingsList.size(); i++)
		{
			if(savingsList.get(i).getAccountNumber() == accNo && savingsList.get(i).getPin().equals(pin))
			{
				savingsList.get(i).setFlag(0);
				System.out.println("Mr. "+savingsList.get(i).getName()+", your account is closed.");
			}
			else
			{
				check = 0;
			}
		}
		if(check == 0)
		{
			System.out.println("Account Not found.");
		}
	}
	
	//display
	protected void diplayAccount(long accNo)
	{
		int check = 1;
		for(int i=0; i<savingsList.size(); i++)
		{
			if(savingsList.get(i).getAccountNumber() == accNo && savingsList.get(i).getFlag() == 1)
			{
				System.out.println("Name: "+savingsList.get(i).getName()+", Age: "+savingsList.get(i).getAge()+",\nEmail: "+savingsList.get(i).getEmail()+", Mobile Number: "+savingsList.get(i).getMobileNo()+"\nAccount Number: "+savingsList.get(i).getAccountNumber()+", Balance: "+savingsList.get(i).getOpenningBalance());
			}
			else
			{
				check = 0;
			}
		}
		if(check == 0)
		{
			System.out.println("Account Not found.");
		}

	}


}
