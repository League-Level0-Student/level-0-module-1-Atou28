package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "when is your birthday?");
		if (input.equals("4/27")) {
			JOptionPane.showMessageDialog(null, "We wish you a Happy Birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "We wish you a Happy Unbirthday!");

		}
	}
}
