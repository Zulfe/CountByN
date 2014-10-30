import javax.swing.JOptionPane;


public class CountByN {
	public static void main(String [] args){
		String userInput = JOptionPane.showInputDialog("Input a number 1-10.");
		int userInputInt = Integer.parseInt(userInput);
		while(userInputInt <= 0 || userInputInt >= 10){
			userInput = JOptionPane.showInputDialog("Try again. 1-10.");
			userInputInt = Integer.parseInt(userInput);
		}
	
		int userOutput = 0;
		String x = "Your numbers are ";
		for(int i = 1; i <= 10; i++){
			userOutput = userOutput + userInputInt;
			if(i != 10)
				x = x + (userOutput + ", ");
			else
				x = x + (userOutput);
		}
		
		JOptionPane.showMessageDialog(null, x);
		
		
	}
}
