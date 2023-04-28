package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Batman = "strong";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String input = JOptionPane.showInputDialog("Can you enter a name of anything in here?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if(input.equals("Batman")) {
	JOptionPane.showMessageDialog(null,Batman);
}
	}
}

