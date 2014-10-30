package APCS;

import javax.swing.JOptionPane;

public class CountByN {
	public static void main(String [] args){
		
		while(true){
		String userInput = JOptionPane.showInputDialog("Input a number 1-10.");
		int userInputInt = Integer.parseInt(userInput);
		int userInputOutput = 0;
		
		if(userInputInt > 0 && userInputInt <= 10){
			for(int i = 1; i <= userInputInt; i++){
				userInputOutput = userInputOutput + 5;
			}
			JOptionPane.showMessageDialog(null, "Your final number is " + userInputOutput);
		} else {
			JOptionPane.showMessageDialog(null, "Error: Number not between 1-10");
		}
		}
	}
}
