/**
 * 
 */
package com;

import java.util.Scanner;

/**
 * @author Sanjay
 *
 */
public class StringMirror {

	public static String getImage(String a) {
		// Generate the mirror image of a String and add it to the existing string. 
		StringBuffer sb = new StringBuffer(a);
		sb.reverse();
		String str = sb.toString();
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = a;

		System.out.println(b + "|" + getImage(a));
		sc.close();
	}

}
