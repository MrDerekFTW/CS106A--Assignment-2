/*
 * File: FindRange.java
 * Name: Derek Blankenship  
 * -----------------
 * This file uses the console to receive numbers from the user
 * and print back the highest and lowest value received. In this
 * problem, I chose to use the System and Scanner class for input/output rather 
 * than the acm ConsoleProgram, because the text in ConsoleProgram
 * was showing up extremely small on my screen. 
 * 
 * Solution for problem 5 of assignment 2 in 
 * Stanford Engineering Everywhere course CS106A.
 */

//import acm.program.*;
import java.util.*;

public class FindRange {

	/* receives numbers from user in a loop, and prints back the highest and lowest at the end */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // processes user input 
		System.out.println("This program finds the largest and smallest numbers.");
		int num = 1;
		int high = num;
		int low = num;
		while (true) {
			System.out.print(" ? ");
			num = sc.nextInt();
			if (num == 0) {
				break;
			} else if (num > high) {
				high = num;
			} else if (num < low) {
				low = num;
			}
		}
		System.out.println("smallest: " + low);
		System.out.println("largest: " + high);
	}
}
	

