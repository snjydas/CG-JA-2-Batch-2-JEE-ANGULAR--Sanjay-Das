package com;

import java.util.Scanner;

public class NumberModification {

	public static int modifyNumber (int number1) {
		
	//Accepts a number and modify it as per the requirement 
		return number1;
	}
		public static void main(String[] args) {
	
			
			int i,n;
			System.out.println("Enter a number:");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			String s=String.valueOf(n);
			sc.close();
			for(i=0;i<s.length()-1;i++)
			{
				char ch=s.charAt(i);
				int d1=Character.getNumericValue(ch);
				char ch1=s.charAt(i+1);
				int d2=Character.getNumericValue(ch1);
				StringBuffer sb=new StringBuffer();
				sb.append(Math.abs(d1-d2));
				System.out.print(sb);
				
			}
			System.out.println(s.charAt(s.length()-1));
			
		}

	}