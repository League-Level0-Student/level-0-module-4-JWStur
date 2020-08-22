package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		String strPen = JOptionPane.showInputDialog("How many pennies do you have?");
		String strNic = JOptionPane.showInputDialog("How many nickels do you have?");
		String strDim = JOptionPane.showInputDialog("How many dimes do you have?");
		String strQua = JOptionPane.showInputDialog("How many quarters do you have?");
		
		int pennies = Integer.parseInt(strPen);
		int nickels = Integer.parseInt(strNic);
		int dimes = Integer.parseInt(strDim);
		int quarters = Integer.parseInt(strQua);
		
		double penCent = 1*pennies;
		double nicCent = 5*nickels;
		double dimCent = 10*dimes;
		double quaCent = 25*quarters;
		
		double total = penCent + nicCent + dimCent + quaCent;
		double output = total/100;
		
				
		JOptionPane.showMessageDialog(null, output);
		
		
		
		// Ask the user how many nickels they have

		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer	

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

