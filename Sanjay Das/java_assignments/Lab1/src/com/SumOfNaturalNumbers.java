/**
 * 
 */
package com;

import java.util.*;

/**
 * @author Sanjay
 *
 */
public class SumOfNaturalNumbers {
	public int calculateSum(int n) {
		// Calculate Sum
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfNaturalNumbers sf = new SumOfNaturalNumbers();
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(sf.calculateSum(n));

	}

}
