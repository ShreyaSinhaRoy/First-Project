/*
 *  Exercise 2: Write a method that uses lambda expression to format a given string, 
 *  where a space is inserted between each character of string.  For ex., if input is �CG�, then expected output is �C G�.
 */

package com.capgemini.lab9.exercise2;

@FunctionalInterface
public interface StringFormatUsingLambdaExpression {
	
	// method to insert a space between each characters of a given string
	String returnExpression(String string);
}
