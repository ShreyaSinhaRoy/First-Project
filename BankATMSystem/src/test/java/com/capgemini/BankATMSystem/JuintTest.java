package com.capgemini.BankATMSystem;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({AccountTest.class,CustomerTest.class,SavingsAccountTest.class,ATMTest.class,UserTest.class })
public class JuintTest {

}
