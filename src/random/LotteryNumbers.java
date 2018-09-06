package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
  public static void main(String[] args) {
	Random rand = new Random();
	int num0 = rand.nextInt(5)+1;
	int num1 = rand.nextInt(5)+1;
    int num2 = rand.nextInt(5)+1;
	int num3 = rand.nextInt(5)+1;
	int num4 = rand.nextInt(5)+1;
	String guess0 = JOptionPane.showInputDialog("Guess the first number. All numbers must be from 1 to 5.");
	int guessInt0 = Integer.parseInt(guess0);
	String guess1 = JOptionPane.showInputDialog("Guess the second number.");
	int guessInt1 = Integer.parseInt(guess1);
	String guess2 = JOptionPane.showInputDialog("Guess the third number.");
	int guessInt2 = Integer.parseInt(guess2);
	String guess3 = JOptionPane.showInputDialog("Guess the fourth number.");
	int guessInt3 = Integer.parseInt(guess3);
	String guess4 = JOptionPane.showInputDialog("Guess the fifth number.");
	int guessInt4 = Integer.parseInt(guess4);
	int match = 0;
	if (guessInt0 == num0) {
		match++;
	}
	if (guessInt1 == num1) {
		match++;
	}
	if (guessInt2 == num2) {
		match++;
	}
	if (guessInt3 == num3) {
		match++;
	}
	if (guessInt4 == num4) {
		match++;
	}
	if (match == 0) {
		JOptionPane.showMessageDialog(null, "You did really bad! You got -1 dollars! The correct numbers are "+num0+" "+num1+" "+num2+" "+num3+" "+num4);
	}
	if (match == 1) {
		JOptionPane.showMessageDialog(null, "You did badly. You got 1 dollar. The correct numbers are "+num0+" "+num1+" "+num2+" "+num3+" "+num4);
	}
	if (match == 2) {
		JOptionPane.showMessageDialog(null, "You did okay. You got 5 dollars. The correct numbers are "+num0+" "+num1+" "+num2+" "+num3+" "+num4);
	}
	if (match == 3) {
		JOptionPane.showMessageDialog(null, "You did kind of good. You got 50 dollars. The correct numbers are "+num0+" "+num1+" "+num2+" "+num3+" "+num4);
	}
	if (match == 4) {
		JOptionPane.showMessageDialog(null, "You did good. You got 1000 dollars. The correct numbers are "+num0+" "+num1+" "+num2+" "+num3+" "+num4);
	}
	if (match == 5) {
		JOptionPane.showMessageDialog(null, "You won the lottery! You got a million dollars!");
	}
}
}
