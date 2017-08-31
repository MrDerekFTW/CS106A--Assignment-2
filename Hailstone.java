/*
 * File: Hailstone.java
 * Name: Derek Blankenship  
 * -----------------
 * This file runs a console program that simulates operation
 * of the hailstone sequence upon a number provided by the user.
 * 
 * Solution for problem 6 of assignment 2 in 
 * Stanford Engineering Everywhere course CS106A.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	
	/* asks the user for a number and performs the hailstone sequence upon it,
	 * printing the results to the console */
	public void run() {
		setFont("TimesNewRoman-20");
		
		int num = readInt("Enter a number: ");
		int steps = printHailstoneSequence(num);
		println("The process took " + steps + " steps to reach 1.");
	}
	
	/* prints out steps of the hailstone sequence and returns the number of steps taken */
	private int printHailstoneSequence(int num) {
		int steps = 0;
		while (num > 1) {
			num = hailStep(num);
			steps++;
		}
		return steps;
	}
	
	/* operates one step of the hailstone sequence, depending on whether num
	 * is odd or even, and returns the next number in the sequence */
	private int hailStep(int num) {
		int temp = num;
		if (num % 2 == 0) {
			num = hailEven(num);
			println(temp + " is even, so I take half:     " + num);
		} else {
			num = hailOdd(num);
			println(temp + " is odd, so I make 3n + 1:    " + num);
		}
		return num;
	}
	
	/* returns half of num */
	private int hailEven(int num) {
		return num / 2;
	}
	
	/* returns 3(num) + 1 */
	private int hailOdd(int num) {
		return num * 3 + 1;
	}
}

