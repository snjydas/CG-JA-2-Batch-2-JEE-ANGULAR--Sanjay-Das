package com.cg.exception;

import java.util.Scanner;

class NameException extends Exception {
	 
	 public NameException(String s) {
	  System.out.println(s);
	 }
	}

public class NameValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName =new String();
		String lastName =new String();
		Scanner sc=new Scanner(System.in);
		firstName =sc.nextLine();
		lastName =sc.nextLine();
		sc.close();
		
		try {
			if(firstName.isBlank())
				throw new NameException("First Name cannot be blank");
			else
				System.out.println("Valid First name");
			
			if(lastName.isBlank())
				throw new NameException("Last Name cannot be blank");
			else
				System.out.println("Valid Last name");
		}
		
		catch(NameException e)
		{
			System.out.println(e);
		}
	}
	}
