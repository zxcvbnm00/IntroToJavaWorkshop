package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		Robot robot = new Robot();
		
robot.penDown();
		
robot.setSpeed(10);
		
for (int i = 0; i < 75; i++) {

	
	
	
	robot.setRandomPenColor();
	
robot.move(5);
	
robot.turn(360/50);
	

	// 9. Set the pen width to i
	robot.setPenWidth(i);
	



	
	
}
		

	}
}
