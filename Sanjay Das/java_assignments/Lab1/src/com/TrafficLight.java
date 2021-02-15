/**
 * 
 */
package com;

import java.util.Scanner;

/**
 * @author Sanjay
 *
 */
public class TrafficLight {

	/**
	 * On entering the choice, an appropriate message with “stop” or “ready” or “go”
	 * should appear in the console
	 */
	public static void main(String[] args) {
		System.out.println("Enter the light number\n 1.Red\n 2.Yellow\n 3.Green");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("Stop!");
		} else if (n == 2) {
			System.out.println("Ready!");
		} else {
			System.out.println("Go!");
		}
		sc.close();

	}

}
