package com.capgemini.BankATMSystem;

import static org.junit.Assert.assertTrue;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CustomerTest {

	public static CustomerImpl customer;
	
	@BeforeAll
	public static void setUp()
	{
		customer = new CustomerImpl();
	}
	@Test
	public void testSetName()
	{
		customer.setName("Bikramjit");
		assertTrue(customer.getName() == "Bikramjit");
	}
	@Test
	public void testSetAge()
	{
		customer.setAge(24);
		assertTrue(customer.getAge() == 24);
	}
	@Test
	public void testSetEmail()
	{
		customer.setEmail("bikramjitbhuiya97@gmail.com");
		assertTrue(customer.getEmail() == "bikramjitbhuiya97@gmail.com");
	}
	@Test
	public void testSetMobile()
	{
		customer.setMobileNo("8902232902");
		assertTrue(customer.getMobileNo() == "8902232902");
	}
	
	@Test
	public void testSetDOB() throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse("13/05/1997");
		customer.setDob(date);
		assertTrue(customer.getDob() == date);
	}
	
	@AfterAll
	public static void stopAll() {
	
		customer = null;
	}
}
