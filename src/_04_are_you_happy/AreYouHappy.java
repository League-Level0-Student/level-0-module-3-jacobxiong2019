package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are you happy?");
		if(happy.equalsIgnoreCase("yes"))
		{
			JOptionPane.showMessageDialog(null, "Keep doing whatever your doing.");
		}
		else if(happy.equalsIgnoreCase("no"))
		{
			String happy1 = JOptionPane.showInputDialog(null, "Do you want to be happy?");
			if(happy1.equalsIgnoreCase("yes"))
			{
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			else if(happy1.equalsIgnoreCase("no"))
			{
				JOptionPane.showMessageDialog(null, "Keep doing whatever your doing.");
			}
		}
	}
}
