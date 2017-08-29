/*
 * File: Target.java
 * Name: Derek Blankenship  
 * -----------------
 * This file draws a simple target with a red bullseye in the center 
 * of the window.
 * 
 * Solution for problem 2 of assignment 2 in 
 * Stanford Engineering Everywhere course CS106A.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	
	/** radius of the outer red circle of target */
	public static final int OUTER_RADIUS = inchesToPixels(1);
	
	/** radius of the inner white circle of target */
	public static final int INNER_RADIUS_WHITE = inchesToPixels(0.65);
	
	/** radius of the inner red circle of target */
	public static final int INNER_RADIUS_RED = inchesToPixels(0.3);
	
	/* draws a target with a red bullseye, white inner ring, and red outer ring */
	public void run() {
		drawTarget();
	}
	
	/* draws a target at the center of the window */
	private void drawTarget() {
		int x = getWindowCenterX();
		int y = getWindowCenterY();
		drawCircle(x, y, OUTER_RADIUS, Color.RED);
		drawCircle(x, y, INNER_RADIUS_WHITE, Color.WHITE);
		drawCircle(x, y, INNER_RADIUS_RED, Color.RED);
	}
	
	/* finds the center of the window for position x */ 
	private int getWindowCenterX() {
		return (getWidth() / 2);
	}
	
	/* finds the center of the window for position y */
	private int getWindowCenterY() {
		return (getHeight() / 2);
	}

	/* draws a circle with the color, radius, and -center- point provided */
	private void drawCircle(int x, int y, int r, Color color) {
		GOval circle = new GOval(x-r, y-r, r*2, r*2);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle);
	}

	/* converts inches to pixels */
	private static int inchesToPixels(double inches) {
		double pixels = inches * 72;
		return (int) pixels;
	}
}


