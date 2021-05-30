package com.capgemini.BankATMSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

	public static Account ac,ac1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ac = new Account();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		ac = null;
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAccount() {
		ac1 = new Account();
	}

	@Test
	void testGetAccountNumber() {
		ac.setAccountNumber(1001L);
		assertTrue(ac.getAccountNumber() == 1001L);
	}

	@Test
	void testSetAccountNumber() {
		ac.setAccountNumber(1001L);
		assertTrue(ac.getAccountNumber() == 1001L);
	}

	@Test
	void testGetOpenningBalance() {
		ac.setOpenningBalance(6000);
		assertTrue(ac.getOpenningBalance() == 6000);
	}

	@Test
	void testSetOpenningBalance() {
		ac.setOpenningBalance(6000);
		assertTrue(ac.getOpenningBalance() == 6000);
	}

	@Test
	void testGetPin() {
		ac.setPin("1234");
		assertTrue(ac.getPin() == "1234");
	}

	@Test
	void testSetPin() {
		ac.setPin("1234");
		assertTrue(ac.getPin() == "1234");
	}

	@Test
	void testGetFlag() {
		ac.setFlag(1);
		assertTrue(ac.getFlag() == 1);
	}

	@Test
	void testSetFlag() {
		ac.setFlag(1);
		assertTrue(ac.getFlag() == 1);
	}

}
