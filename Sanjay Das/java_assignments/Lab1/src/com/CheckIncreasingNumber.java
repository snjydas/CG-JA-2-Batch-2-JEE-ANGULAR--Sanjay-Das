/**
 * 
 */
package com;

import java.util.*;

/**
 * @author Sanjay
 *
 */
public class CheckIncreasingNumber {
	// Check if a number is an increasing number
	public static boolean checkNumber(int number) {
		boolean flag = false;
		int currentDigit = number % 10;
		number = number / 10;
		while (number > 0) {

			if (currentDigit <= number % 10) {
				flag = true;
				break;
			}

			currentDigit = number % 10;
			number = number / 10;
		}
		if (flag) {
			return false;
		} else {
			return true;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		sc.close();

		System.out.println(checkNumber(number));
	}

}
