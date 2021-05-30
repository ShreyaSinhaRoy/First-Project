package com.capgemini.BankATMSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

	public static User user;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		user = new User();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCheckName() {
		assertTrue(User.CheckName("Bikramjit") == "Bikramjit");
	}

	@Test
	void testCheckAge() {
		assertTrue(User.CheckAge(24) == 24);
	}

	@Test
	void testCheckEmail() {
		assertTrue(User.CheckEmail("bkb97@gmail.com") == "bkb97@gmail.com");
	}

	@Test
	void testCheckMobile() {
		assertTrue(User.CheckMobile("8902232902") == "8902232902");
	}

	@Test
	void testCheckPin() {
		assertTrue(User.checkPin("1234") == "1234");
	}

	@Test
	void testCheckAccountNumber() {
		assertTrue(User.checkAccountNumber(1001) == 1001);
	}

	@Test
	void testCheckBalance() {
		assertTrue(User.checkBalance(6000) == 6000);
	}

}
