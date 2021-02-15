/**
 * 
 */
package com;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sanjay
 *
 */
public class StringArraySorting {
// accept an array of String objects and sort in Alphabetical order.

	public static String[] sortStrings(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i].toLowerCase();
		}
		Arrays.sort(arr);
		if (arr.length % 2 == 0) {
			for (int i = 0; i < ((arr.length / 2) - 1); i++) {
				arr[i].toUpperCase();
			}
			for (int i = arr.length - 1; i > (arr.length / 2); i--) {
				arr[i].toLowerCase();
			}
		}
		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no. of Strings:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		System.out.println("Enter all the strings:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		sc.close();
		String a[] = sortStrings(arr);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}

	}

}
