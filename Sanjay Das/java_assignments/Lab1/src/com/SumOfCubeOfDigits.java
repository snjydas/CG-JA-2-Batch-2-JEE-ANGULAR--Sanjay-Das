package com;

import java.util.*;

/**
 * @author Sanjay
 *
 */
public class SumOfCubeOfDigits {
	public static int Cubes(int x) {
		// Calculate Sum
		int number = x;
		int sum = 0;
		while (number > 0) {
			int digit = number % 10;
			sum += digit * digit * digit;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		System.out.println(Cubes(x));
	}

}
