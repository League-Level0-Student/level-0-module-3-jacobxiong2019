package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String starSign = JOptionPane.showInputDialog("What is your star sign?");
		if(starSign.equalsIgnoreCase("Aries"))
		{
			JOptionPane.showMessageDialog(null, "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		}
		else if(starSign.equalsIgnoreCase("Taurus"))
		{
			JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature");
		}
		else if(starSign.equalsIgnoreCase("Gemini"))
		{
			JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");
		}
	}
}
