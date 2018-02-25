
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "July 20th";
		String dadsBirthday = "January 15th";
		String myBirthday = "July 10th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String answer = JOptionPane
				.showInputDialog("Would you like my Mom's birthday, my Dad's birthday, or Kellen's birthday?");
		// 3. Print out what the user typed
		System.out.println(answer);
		// 4. if user asked for "mom"
		if (answer.equals("Mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
		else if (answer.equals("Dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
		else if (answer.equals("Kellen")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
	}
}
