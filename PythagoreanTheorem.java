/*
 * File: PythagoreanTheorem.java
 * Name: Derek Blankenship  
 * -----------------
 * This file runs a console program that allows the user to calculate the 
 * side of a right triangle by using the Pythagorean theorem.
 * 
 * Solution for problem 4 of assignment 2 in 
 * Stanford Engineering Everywhere course CS106A.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	
	/* receives user input for 2 known sides of right triangle and finds the missing side */
	public void run() {
		println("Enter values to compute the Pythagorean theorem");
		int a = readInt("a: ");
		int b = readInt("b: ");
		double ans = usePythagorean(a, b);
		println("c = " + ans);
	}
	
	/* calculates using Pythagorean theorem */
	private double usePythagorean(int a, int b) {
		return Math.sqrt((a * a) + (b * b));
	}
}
