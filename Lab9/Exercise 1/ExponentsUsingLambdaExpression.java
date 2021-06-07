// Exercise 1: Write a lambda expression which accepts x and y numbers and return x^y

package com.capgemini.lab9.exercise1;

@FunctionalInterface
public interface ExponentsUsingLambdaExpression {

	// method to calculate the value of x raised to the power of y
	int power(int x,int y);
	
}
