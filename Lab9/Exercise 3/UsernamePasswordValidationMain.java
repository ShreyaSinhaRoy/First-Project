package com.capgemini.lab9.exercise3;

import java.util.Scanner;

/**
 * Main program using Lambda Expression for validating username and password for authentication
 * @author Shreya Sinha Roy
 *
 */

public class UsernamePasswordValidationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sm=new Scanner(System.in);// Scanner object creation 
		UsernamePasswordValidationUsingLambdaExpression upv = (username,password)->{
			return (username.equals("SSR22S") && password.equals("SSR1997"));
		};
		
		System.out.print("Enter the username : ");
		String username=sm.next();
		
		System.out.print("Enter the password : ");
		String password=sm.next();
		
		System.out.println("\nAuthentication Status : "+upv.validateusername_password(username, password));
		sm.close();
	}

}
