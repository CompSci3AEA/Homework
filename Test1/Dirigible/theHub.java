package Dirigible;

import javax.swing.JOptionPane;

public class theHub {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("The year is 2341, and you have lived your life on an airship, New Domain.");
		Thread.sleep(1000);
		System.out.println("You recently became captain of the ship, and now you must ensure your survival.");
		Thread.sleep(1000);
		System.out.println("It has been centuries since you have arrived back on the surface.");
		Thread.sleep(1000);
		System.out.println("But, resources now run low, and you must return to the surface. Good luck, Captain");
		Thread.sleep(2000);
		
		for (int i = 0; i < 5; i++) {
			int random = (int)(Math.random()*20);
			partOne(random);
		}
		
	}
		
		
		/**public static void tutorial() throws InterruptedException{
			String[] opChoices = {"Run an operation", "Stats"};
			String opDecision = (String) JOptionPane.showInputDialog(null, "Operation?", null, JOptionPane.QUESTION_MESSAGE, null, opChoices, opChoices[0]);
		
			if (opDecision == "Run an operation"){
				meetDanton.main(opChoices);
			}
			
			
			if (opDecision == "Stats") { 
			}
		}*/
		
		
		
		
		
		public static void partOne(int random) throws InterruptedException{
			
			
		String[] opChoices = {"Run an operation", "Stats"};
				String opDecision = (String) JOptionPane.showInputDialog(null, "Operation?", null, JOptionPane.QUESTION_MESSAGE, null, opChoices, opChoices[0]);
			
				if (opDecision == "Run an operation"){
					
					//if (random == 0) {
					waterShortage.water(opChoices);
					//}
					

				}
				if (opDecision == "Stats") { 
					
					
				}
			
			
	}
		public static void statListing() {

			
		}

}
