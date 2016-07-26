package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
Robot shoe = new Robot();
	
	void go() {
		shoe.penDown();
shoe.hide();
		// 6. Make the robot go as fast as possible
shoe.setSpeed(100);
		// 4. make a variable to hold the length of the triangle and set it to 50
int length = 50;
		int cooler = 1;
// 7. Do the following (up to step 10) 60 times
for (int i = 0; i < 60; i++) {
	length = length + 10;
cooler = cooler + 5;
			// 9. Change the color of the pen to a random color
	shoe.setPenColor(cooler, cooler, cooler);
			// 8. Increase the length of the side by 10 pixels
	
			// 5. call your drawTriangle() method using your length variable
	drawTriangle(length);
			// 10. Turn the tortoise 6 degrees to the right
shoe.turn(1);


}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		for (int i = 0; i < 3; i++) {
			shoe.turn(120);
			shoe.move(length);
		}
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
