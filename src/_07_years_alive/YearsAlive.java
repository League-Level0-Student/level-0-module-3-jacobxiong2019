package _07_years_alive;

import javax.swing.JOptionPane;

public class YearsAlive {
	public static void main(String[] args) {
		int Age = 2007;
		for(int i = 0; i < 13; i++)
		{
			JOptionPane.showMessageDialog(null, Age);
			Age++;
		}
	}
}
