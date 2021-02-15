/**
 * 
 */
package com;

import java.util.*;

/**
 * @author Sanjay
 *
 */
public class PowerOfTwo {
	// Checks if the entered number is a power of two or not
	public static boolean checkNumber(int n) {
		if (n == 0)
			return false;

		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(checkNumber(n));
	}

}
