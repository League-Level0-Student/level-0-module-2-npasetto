//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		for (int i = 0; i < 10; i++) {
			
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
        if (randomNumber == 0) {
        	JOptionPane.showMessageDialog(null, "I like that you put a semicolon at the end of all the Java sentences.");
        }else if(randomNumber == 1) {
        	JOptionPane.showMessageDialog(null, "I like that you capitalized everything correctly.");
        }else if(randomNumber == 2) {
        	JOptionPane.showMessageDialog(null, "I like that you used control space a lot.");
        }else if(randomNumber == 3) {
        	JOptionPane.showMessageDialog(null, "I like that you hit control z instead of rewriting everything.");
        }else {
        	JOptionPane.showMessageDialog(null, "I like that you like to program.");
        }
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
