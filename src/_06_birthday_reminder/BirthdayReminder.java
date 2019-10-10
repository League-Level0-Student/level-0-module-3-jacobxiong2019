
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August 16";
		String dadsBirthday = "April 30th";
		String myBirthday = "February 5th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birthday = JOptionPane.showInputDialog("who's birthday do you want to know?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
		if(birthday.equalsIgnoreCase(momsBirthday))
		{
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		else if(birthday.equalsIgnoreCase("dad"))
		{
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		else if(birthday.equalsIgnoreCase("Jacob"))
		{
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
