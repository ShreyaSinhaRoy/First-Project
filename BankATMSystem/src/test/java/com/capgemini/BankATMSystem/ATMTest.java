package com.capgemini.BankATMSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ATMTest {

	private static ATM atm;
	
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		atm = ATM.getAtminstance();
		System.out.println(atm);
		atm.savingsList.get(0).setOpenningBalance(7000);
		atm.savingsList.get(0).setPin("1234");
	}
	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		atm = null;
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	void testGetWithdrawAmount() {
		atm.setWithdrawAmount(3000);
		assertTrue(atm.getWithdrawAmount() == 3000);
	}

	@Test
	void testSetWithdrawAmount() {
		atm.setWithdrawAmount(3000);
		assertTrue(atm.getWithdrawAmount() == 3000);
	}

	@Test
	void testGetDepositeAmount() {
		atm.setDepositeAmount(3000);
		assertTrue(atm.getDepositeAmount() == 3000);
	}

	@Test
	void testSetDepositeAmount() {
		atm.setDepositeAmount(3000);
		assertTrue(atm.getDepositeAmount() == 3000);
	}

	@Test
	void testDepositeAmount() {
		atm.setDepositeAmount(3000);
		atm.savingsList.get(0).setOpenningBalance(atm.savingsList.get(0).getOpenningBalance() + atm.getDepositeAmount());
		assertTrue(atm.savingsList.get(0).getOpenningBalance() == 10000);
	}

	@Test
	void testWithdrawAnount() {
		atm.setWithdrawAmount(1000);
		atm.savingsList.get(0).setOpenningBalance(atm.savingsList.get(0).getOpenningBalance() - atm.getWithdrawAmount());
		assertTrue(atm.savingsList.get(0).getOpenningBalance() == 6000);
	}

	@Test
	void testCheckBalance() {
		assertTrue(atm.savingsList.get(0).getOpenningBalance() == 7000);
	}

	@Test
	void testChangePin() {
		atm.savingsList.get(0).setPin("4321");
		assertTrue(atm.savingsList.get(0).getPin().equals("4321"));
	}
	
	

}
