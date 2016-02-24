package Dirigible;

import javax.swing.JOptionPane;

public class meetDanton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Danton: Captain sir, I am to show you the ropes of this operation.");
		Thread.sleep(1000);
		System.out.println("Danton: Our target today is in an old resource depot near Tharsis highway.");
		Thread.sleep(1000);
		System.out.println("Danton: Do you have any questions about an operation, sir?");
		
		String opAnswers[] = {"What is an operation?", "What are the results of an operation?", "Nothing."};
		
		boolean answers = false;
		
		do{
		String opResponses = (String) JOptionPane.showInputDialog(null, "Questions?", null, JOptionPane.QUESTION_MESSAGE,null, opAnswers, opAnswers[0]);
		
		if (opResponses == "What is an operation?"){
			
			System.out.println("Danton: An operation is a mission where you head down to the surface of the planet with a specific purpose in mind.");
			answers = false;
			
		}
		
		if (opResponses == "What are the results of an operation?") {
			
			System.out.println("Danton: If you successfully complete the mission, the ship may get water, food, or raw materials. Cool items may also be found planetside");
			System.out.println("Whether you fail or pass an operation, however, your ship's food, water, and fuel supply diminish.");
			answers = false;
			
		}
		
		if (opResponses == "Nothing.")
		
			answers = true;
		
		}while (answers == false);
		
		
		System.out.println("Danton: Very well sir.");
		System.out.println("Danton: Scanners indicate a hostile presence in the area. ");
		System.out.println("Danton: Don't worry about getting shot too much, our med bay should patch you up so long as you aren't dead.");
		System.out.println("I'll head around, you hold guard.");
		System.out.println();
		System.out.println("The ensuing, somber silence is shaken by a sniper shot");
		System.out.println();
		System.out.println("Raider: Let's see what you're made of!");
		
		int enemyhealth = 30;
		int health = 100;
		boolean cantFlee = false;
		
		combat.battle(health, enemyhealth,cantFlee);
	}
}


