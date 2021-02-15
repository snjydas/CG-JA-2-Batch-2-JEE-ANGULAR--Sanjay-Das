package com.cg.exception;
import java.util.Scanner;

class SalException extends Exception {
	 
	 public SalException(String s) {
	  System.out.println(s);
	 }
	}

public class SalExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		System.out.println("Enter Employee name:");
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		
		double sal;
		System.out.println("Enter Employee salary:");
		sal=sc.nextDouble();
		
		try {
			if(sal<3000)
				throw new SalException("Salary less than 3000");
			else
				System.out.println("Salary greater than 3000");
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		

	}

}