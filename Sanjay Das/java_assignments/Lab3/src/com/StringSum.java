package com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		String str=sc.nextLine();

		StringTokenizer strt=new StringTokenizer(str," ");
		
		while(strt.hasMoreElements())
		{
			String next=strt.nextToken();
			n=Integer.parseInt(next);
			sum+=n;
		}
		System.out.println("Sum: "+sum);
		sc.close();
	}
}