
import javax.swing.JOptionPane;

public class Dirigible {
	
	public static void main(String[] args){

		String name = JOptionPane.showInputDialog(null, "Enter your name", "Captain");
		
		System.out.println("Welcome aboard The Dirigible, " + name + ".");
		
		System.out.println("You are quite the interesting specimen. Allow us to test your knowledge.");
		
		int number = (int)(Math.random()* 100);
		
		int number2 = number % 60;
		
		String intelligenceTest = JOptionPane.showInputDialog("What is the binary of " + number2 + "?");
		
		int inputAnswer = Integer.parseInt(intelligenceTest);
		
		int answer = remainder(number2);
		
		
		
		if (answer == inputAnswer) {
			int intelligence = 5;
			System.out.println("Good job.");
		}
		else {
			int intelligence = 3;
			System.out.println("Sorry, that is wrong.");
		}
		
		System.out.println(answer);
		System.out.println(inputAnswer);
		
		
		
	}
	public static int remainder(int number2) {
		
		int binary = 0;
		
		while (number2 > 1) {
			
			System.out.print(number2 % 2);
			
		}
		
		remainder(number2 % 2);
		
		remainder(number2 >> 1);
		
		return remainder(number2);
		
	}
}
