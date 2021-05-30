package com.capgemini.BankATMSystem;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SavingsAccountTest {

	public static SavingsAccount sa;
	ArrayList<SavingsAccount> savingsList = new ArrayList<SavingsAccount>();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		sa=null;
	}

	@BeforeEach
	void setUp() throws Exception {
		
		sa = new SavingsAccount();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCreateSavingsAccount() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sa.setAccountNumber(1001);
		sa.setPin("1234");
		sa.setFlag(1);
		sa.setOpenningBalance(6000);
		sa.setAge(24);
		sa.setName("Bikramjit");
		sa.setEmail("bikramjit97@gmail.com");
		sa.setMobileNo("8902232902");
		Date date = sdf.parse("13/05/1997");
		sa.setDob(date);
		assertTrue(savingsList.add(sa));
		
	}

	@Test
	void testDeleteSavingsAccount() {
		String pin = "1234";
		long accNo = 1001;
		for(int i=0; i<savingsList.size(); i++)
		{
			if(savingsList.get(i).getAccountNumber() == accNo && savingsList.get(i).getPin().equals(pin))
			{
				savingsList.get(i).setFlag(0);
				assertTrue(savingsList.get(i).getFlag() == 0);
			}
		}
		
	}

	@Test
	void testDiplayAccount() {
		String pin = "1234";
		long accNo = 1001;
		for(int i=0; i<savingsList.size(); i++)
		{
			if(savingsList.get(i).getAccountNumber() == accNo && savingsList.get(i).getPin().equals(pin))
			{
				assertTrue(savingsList.get(i).getFlag() == 1);
				assertTrue(savingsList.get(i).getName() == "Bikramjit");
				assertTrue(savingsList.get(i).getAge() == 24);
				assertTrue(savingsList.get(i).getMobileNo() == "8902232902");
				assertTrue(savingsList.get(i).getOpenningBalance() == 6000);
				assertTrue(savingsList.get(i).getAccountNumber() == 1001);
				assertTrue(savingsList.get(i).getPin() == "1234");
			}
		}
	}

}
