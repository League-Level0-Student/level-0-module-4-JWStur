package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String strNumOne = JOptionPane.showInputDialog("Please enter a number.");
		String strNumTwo = JOptionPane.showInputDialog("Please enter another number.");
		double numOne = Double.parseDouble(strNumOne);
		double numTwo = Double.parseDouble(strNumTwo);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What operation do you want to preform on these numbers?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if (operation == 0) {
			JOptionPane.showMessageDialog(null, numOne + " + " + numTwo + " = " + (numOne + numTwo));
		}
		if (operation == 1) {
			JOptionPane.showMessageDialog(null, numOne + " - " + numTwo + " = " + (numOne - numTwo));
		}
		if (operation == 2) {
			JOptionPane.showMessageDialog(null, numOne + " * " + numTwo + " = " + (numOne * numTwo));
		}
		if (operation == 3) {
			JOptionPane.showMessageDialog(null, numOne + " / " + numTwo + " = " + (numOne / numTwo));
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
}