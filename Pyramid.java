/*
 * File: Pyramid.java
 * Name: Derek Blankenship
 * ------------------
 * This file animates the drawing of a pyramid of bricks, based on a 
 * set of constants that determine the brick width, brick height, 
 * and the number of bricks at the base of the pyramid.
 * 
 * Solution for problem 1 of assignment 2 in 
 * Stanford Engineering Everywhere course CS106A.
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 20;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 25;
	
/** Number of bricks in the base of the pyramid */
	private static final int ANIMATION_SPEED = 100;
	
	/* draws a pyramid of bricks, by drawing many rows of less and less
	 * bricks, starting from the bottom with the largest row and moving up
	 */
	public void run() {
		for (int i = BRICKS_IN_BASE; i > 0; i--) {
			drawBrickRow(getBrickRowXPosition(i), getBrickRowYPosition(i), i);
			pause(ANIMATION_SPEED);
		}
	}
	
	/* provides x value for the leftmost side of a brick row, such that
	 * the row will be centered when drawn with drawBrickRow,
	 * based on the number of bricks in the row */
	private int getBrickRowXPosition(int bricksInRow) {
		int xPos = (getWidth()/2) - ((bricksInRow * BRICK_WIDTH)/2);
		return xPos;
	}
	
	/* provides y value for the topmost side of a brick row, such that
	 * the row will be drawn an the appropriate height to create a pyramid,
	 * based on the number of bricks in the row */
	private int getBrickRowYPosition(int bricksInRow) {
		int yPos = getHeight() - ((BRICKS_IN_BASE - bricksInRow) * BRICK_HEIGHT) - BRICK_HEIGHT;
		return yPos;
	}
	
	/* draws a row of bricks of length numBricks,
	 * starting at (xPosition,yPosition) */
	private void drawBrickRow(int xPosition, int yPosition, int numBricks)
	{
		for (int i = numBricks; i > 0; i--) {
			drawBrick(xPosition, yPosition);
			xPosition += BRICK_WIDTH;
		}
	}
	
	/* draws a single brick at position (x,y) */ 
	private void drawBrick(int x, int y) {
		GRect brick = new GRect (x, y, BRICK_WIDTH, BRICK_HEIGHT);
		brick.setFilled(true);
		brick.setColor(Color.BLACK);
		brick.setFillColor(Color.YELLOW);
		add(brick);
	}
}

