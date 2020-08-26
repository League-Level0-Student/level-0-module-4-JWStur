package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        String day = JOptionPane.showInputDialog("What day is it?");
		// Set the boolean isWeekend based on the value they enter
		if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
			JOptionPane.showMessageDialog(null, "You should sleep in.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Get out of bed and go to school.");
		}
		
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
		String input = JOptionPane.showInputDialog("What score did you get?");
		double score = Double.parseDouble(input);
		if (score >= 70) {
			JOptionPane.showMessageDialog(null, "You passed");
		}
		else {
			JOptionPane.showMessageDialog(null, "Better luck next time");
		}
		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String red = JOptionPane.showInputDialog("What color do you want the shape to be?");
		
		if (red.equalsIgnoreCase("red")) {
			isRed = true;
		}
		else {
			isRed = false;
			JOptionPane.showMessageDialog(null, "I dont know that color");
		}
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String square = JOptionPane.showInputDialog("What shape should I draw?");
		
		if (square.equalsIgnoreCase("square")) {
			isSquare = true;
		}
		else {
			isSquare = false;
			JOptionPane.showMessageDialog(null, "I dont know that shape.");
		}
		
		if (isSquare && isRed) {
			drawRedSquare();
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
		rob.moveTo(100, 100);
		rob.setPenColor(255,0,0);
		rob.penDown();
		
		for (int i = 1;i <= 4;i++) {
			rob.move(100);
			rob.turn(90);
		
		}
	}	
}
