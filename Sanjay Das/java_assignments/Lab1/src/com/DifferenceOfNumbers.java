/**
 * 
 */
package com;

import java.util.*;

/**
 * @author Sanjay
 *
 */
public class DifferenceOfNumbers {
	public int calculateDifference(int n) {
		// Calculate the difference
		int a = 0, b = 0, sum = 0;
		for (int i = 0; i <= n; i++) {
			a += i ^ 2;

		}
		for (int j = 0; j <= n; j++) {
			b += j;
		}
		b = b ^ 2;

		sum = a - b;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		DifferenceOfNumbers df = new DifferenceOfNumbers();
		System.out.println(df.calculateDifference(n));
	}

}
