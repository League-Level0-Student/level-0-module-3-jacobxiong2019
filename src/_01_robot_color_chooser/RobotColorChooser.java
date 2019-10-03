//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot R2D2 = new Robot();
		R2D2.setSpeed(10000);
		R2D2.penDown();
		for(int i = 0; i < 5; i++) {
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("what color would you want the robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("red"))
		{
			R2D2.setPenColor(Color.red);
		}
		else if(color.equalsIgnoreCase("orange"))
		{
			R2D2.setPenColor(Color.orange);
		}
		else if(color.equalsIgnoreCase("yellow"))
		{
			R2D2.setPenColor(Color.yellow);
		}
		else if(color.equalsIgnoreCase("green"))
		{
			R2D2.setPenColor(Color.green);
		}
		else if(color.equalsIgnoreCase("blue"))
		{
			R2D2.setPenColor(Color.blue);
		}
		else if (color.equalsIgnoreCase("purple") || color.equalsIgnoreCase("magenta"))
		{
			R2D2.setPenColor(Color.magenta);
		}
		else
		{
			R2D2.setRandomPenColor();
		}
	    //6. If the user doesn't enter anything, choose a random color
		
	    //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		R2D2.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
			for(int i1 = 0; i1 < 4; i1++) {
			R2D2.move(200);
			R2D2.turn(90);
			}
		}
	}
}
