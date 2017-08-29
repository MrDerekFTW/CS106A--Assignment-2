/*
 * File: ProgramHierarchy.java
 * Name: Derek Blankenship  
 * -----------------
 * This file draws a diagram to represent the inheritance of acm.graphics.Program.
 * The diagram is centered in the middle of the window, and it's proportions are 
 * determined by the width and height of the boxes.
 * 
 * Solution for problem 3 of assignment 2 in 
 * Stanford Engineering Everywhere course CS106A.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	/** class box width in pixels */
	private static final int BOX_WIDTH = 200;
	
	/** class box height in pixels */
	private static final int BOX_HEIGHT = 75;
	
	/* draws a diagram to represent the inheritance of acm.graphics.Program,
	 * centered in the graphics window */
	public void run() {
		drawDiagram(getWindowCenterX(), getWindowCenterY());
	}
	
	/* draws the entire diagram, starting from the center point provided */
	private void drawDiagram(int centerX, int centerY) {
		drawProgramBox(centerX, centerY);
		drawBottomBoxes(centerX, centerY);
		drawConnectingLines(centerX, centerY);
	}
	
	/* draws the box at the top of the hierarchy */
	private void drawProgramBox(int centerX, int centerY) {
		int boxCornerX = centerX - (BOX_WIDTH / 2);
		int boxCornerY = centerY - (BOX_HEIGHT / 2) - BOX_HEIGHT;
		drawBoxWithLabel(boxCornerX, boxCornerY, "Program");
	}
	
	/* draws the boxes at the bottom of the hierarchy */
	private void drawBottomBoxes(int centerX, int centerY) {
		drawBoxWithLabel(centerX - (BOX_WIDTH/2) - BOX_WIDTH - (BOX_WIDTH/4), 
				centerY - (BOX_HEIGHT / 2) + BOX_HEIGHT, "GraphicsProgram");
		drawBoxWithLabel(centerX - (BOX_WIDTH /2), 
				centerY - (BOX_HEIGHT / 2) + BOX_HEIGHT, "ConsoleProgram");
		drawBoxWithLabel(centerX - (BOX_WIDTH/2) + BOX_WIDTH + (BOX_WIDTH/4), 
				centerY - (BOX_HEIGHT / 2) + BOX_HEIGHT, "DialogProgram");
	}
	
	/* draws a box with a label in program window */
	private void drawBoxWithLabel(int x, int y, String name) {
		GRect rect = new GRect(x, y, BOX_WIDTH, BOX_HEIGHT);
		rect.setFilled(false);
		GLabel label = new GLabel(name, x, y);
		label.setFont("SansSerif-18");
		label.move((BOX_WIDTH/2) - (label.getWidth()/2), 
				(BOX_HEIGHT/2) + (label.getAscent()/2));
		add(rect);
		add(label);
	}
	
	/* draws lines to connect the top box to the bottom boxes */
	private void drawConnectingLines(int centerX, int centerY) {
		drawLine(centerX, centerY - (BOX_HEIGHT/2), 
				centerX, centerY + (BOX_HEIGHT/2));
		drawLine(centerX, centerY - (BOX_HEIGHT/2), 
				centerX - (BOX_WIDTH) - (BOX_WIDTH/4), centerY + (BOX_HEIGHT/2));
		drawLine(centerX, centerY - (BOX_HEIGHT/2), 
				centerX + (BOX_WIDTH) + (BOX_WIDTH/4), centerY + (BOX_HEIGHT/2));
	}
	
	/* draws a line in the program window */
	private void drawLine(int x1, int y1, int x2, int y2) {
		GLine line = new GLine(x1, y1, x2, y2);
		add(line);
	}
	
	/* finds the center of the window for position x */ 
	private int getWindowCenterX() {
		return (getWidth() / 2);
	}
	
	/* finds the center of the window for position y */
	private int getWindowCenterY() {
		return (getHeight() / 2);
	}
}

