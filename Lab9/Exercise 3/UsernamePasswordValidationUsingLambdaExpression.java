/*
 * Exercise 3: Write a method that uses lambda expression to accept username and password and 
 * return true or false. 
 * (Hint: Use any custom values for username and password for authentication)
 */
package com.capgemini.lab9.exercise3;

@FunctionalInterface
public interface UsernamePasswordValidationUsingLambdaExpression {

	//boolean method to validate username & password
	boolean validateusername_password(String username,String password);
}
