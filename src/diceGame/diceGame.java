package diceGame;

import javax.swing.JOptionPane;

public class diceGame {

	public static void main(String[] args) {
		int i = 0;
		int winsUser = 0;
		int winsComputer = 0;
		JOptionPane.showMessageDialog(null, "You are going to play a simple dice game with the computer, but you have no control over your wins or losses. ");
		while (i < 10) {
			
			int dieRoll = (int) (Math.random() * 6) + 1;
			//System.out.print(dieRoll);
			int userRoll = (int) (Math.random() * 6) + 1;
			i ++;
			
			if (userRoll > dieRoll) {
				winsUser ++;
				JOptionPane.showMessageDialog(null, "This time, you won! You've won " + winsUser + " time/s.");
			} else if (userRoll < dieRoll) {
				winsComputer ++;
				JOptionPane.showMessageDialog(null, "This time, the computer won! You've lost " + winsComputer + " time/s.");
			} else if (userRoll == dieRoll){
				JOptionPane.showMessageDialog(null, "It was a tie. No winner.");
			}
		}
		
		if (winsUser > winsComputer) {
			JOptionPane.showMessageDialog(null, 
					"After 10 games, you were the overall winner! You won " 
					+ winsUser + " times against the computer.");
		} else if (winsUser < winsComputer) {
			JOptionPane.showMessageDialog(null, 
					"After 10 games, the computer was the overall winner. You lost "
					+ winsComputer + " times against the computer.");
		} else if (winsUser == winsComputer) {
			JOptionPane.showMessageDialog(null, 
					"After 10 games, you and the computer tied. Both of you won 5 times.");}
			
		
	
		
	}
		
	

}
