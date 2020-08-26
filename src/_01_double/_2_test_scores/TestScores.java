package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What did you get on your test?");
		double score = Double.parseDouble(input);
		
		if (score < 80) {
			JOptionPane.showMessageDialog(null, "You failed");
		}
		else if (score == 80) {
			JOptionPane.showMessageDialog(null, "Well, at least thats passing");
		}
		else if (score > 80 && score <= 90) {
			JOptionPane.showMessageDialog(null, "Good Job");
		}
		else if (score > 90 && score < 95) {
			JOptionPane.showMessageDialog(null, "Nice job, you must have studied hard!");
		}
		else {
			JOptionPane.showMessageDialog(null, "AMAZING JOB YOU DID VERY WELL!");
		}
	}
}
