package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String Batman = "strong";
		String Superman = "amazing";
		String Aquaman = "intresting";
		String Hulk = "reckless and super-strong";
		String Ironman ="smart";
		String Thor = "mighty";
		
		
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String input = JOptionPane.showInputDialog("Can you enter a name of anything in here?");
		// 3. In a pop-up, tell the user what is remarkable about that person.
		if (input.equals("Batman")) {
			JOptionPane.showMessageDialog(null, Batman);

		}

		else if (input.equals("Superman")) {
			JOptionPane.showMessageDialog(null, Superman);
		}
		else if (input.equals("Aquaman")) {
			JOptionPane.showMessageDialog(null, Aquaman);
		}
		else if (input.equals("Hulk")) {
			JOptionPane.showMessageDialog(null, Hulk);
		}
		else if (input.equals("Ironman")) {
			JOptionPane.showMessageDialog(null, Ironman);
	}

	else if (input.equals("Thor")) {
		
		JOptionPane.showMessageDialog(null, Thor);
	}
	}
}


