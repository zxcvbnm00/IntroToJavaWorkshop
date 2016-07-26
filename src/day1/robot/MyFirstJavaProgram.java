package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Yashwin = new Robot();

Yashwin.setSpeed(1000);
Yashwin.penDown();
Yashwin.setPenWidth(100);
Yashwin.setPenColor(0, 153, 34);
Yashwin.hide();	
for (int i = 0; ; i++) {
	Yashwin.turn(105);
	Yashwin.move(100);
	Yashwin.turn(100);
	Yashwin.move(100);
	Yashwin.turn(100);
	Yashwin.move(100);
	Yashwin.turn(100);
}
	
	
	
	
	
	
	}
}
