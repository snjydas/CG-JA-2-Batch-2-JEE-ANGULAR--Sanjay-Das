/**
 * 
 */
package com;

import java.util.Scanner;

/**
 * @author Sanjay
 *
 */
public class StringAlteration {
	// Replace consonants
	public static char[] alterString(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] != 'a') && (ch[i] != 'e') && (ch[i] != 'i') 
					&& (ch[i] != 'o') && (ch[i] != 'u') && (ch[i] != 'A')
					&& (ch[i] != 'E') && (ch[i] != 'I') && (ch[i] != 'O')
					&& (ch[i] != 'U')) {
				ch[i] = (char) (ch[i] + 1);
			}
		}
		return ch;
	}
	public static void main(String[] args) {

		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		System.out.println(alterString(input.toCharArray()));

	}

}
