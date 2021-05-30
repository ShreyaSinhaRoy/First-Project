package com.capgemini.BankATMSystem;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;
public class Test {

	public static void main(String[] args)
	{
		Result result = JUnitCore.runClasses(JuintTest.class);
		for(Failure fail : result.getFailures())
		{
			System.out.println(fail.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
