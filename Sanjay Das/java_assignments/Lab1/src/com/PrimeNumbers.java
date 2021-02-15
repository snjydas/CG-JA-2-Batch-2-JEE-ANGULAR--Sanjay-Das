/**
 * 
 */
package com;

import java.util.Scanner;

/**
 * @author Sanjay
 *
 */
public class PrimeNumbers {

	/**
	 * prints out all the prime numbers up to a Integer
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, num = 0;
		// Empty String
		String primeNumbers = "";
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		sc.close();
		for (i = 1; i <= n; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to n are :");
		System.out.println(primeNumbers);
	}

}