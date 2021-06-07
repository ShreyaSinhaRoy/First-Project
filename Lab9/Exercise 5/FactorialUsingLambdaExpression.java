/*
 * Exercise 5: Write a method to calculate factorial of a number. 
 * Test this method using method reference feature. 
 */

package com.capgemini.lab9.exercise5;

@FunctionalInterface
public interface FactorialUsingLambdaExpression {

	// function to calculate factorial of a number
	int factorial(int number);
}
