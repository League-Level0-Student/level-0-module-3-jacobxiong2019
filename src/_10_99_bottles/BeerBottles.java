package _10_99_bottles;

import javax.swing.JOptionPane;

public class BeerBottles {
	public static void main(String[] args) {
	
		for(int i = 98; i > 0; i--)
		{
			System.out.println((i+1) + " bottles of beer on the wall, " + (i+1) + " bottles of beer.\r\n" + 
					"Take one down and pass it around, " + (i) + " bottles of beer on the wall."); 
		}
		System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\r\n" + 
				"Take one down and pass it around, no more bottles of beer on the wall.");
		System.out.println("No more bottles of beer on the wall, no more bottles of beer. \r\n" + 
				" Go to the store and buy some more, 99 bottles of beer on the wall.");
	}
}
