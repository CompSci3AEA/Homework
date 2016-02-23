package Dirigible;

import javax.swing.JOptionPane;

public class combat {

	public static void battle(int enemyHealth, int health, int cantFlee) {
		// TODO Auto-generated method stub
		
		do{
			
			do{
				
				boolean endTurn = false;
				
				String [] combatChoices = {"Shoot", "Take cover", "Flee"};
				String battleSequence = (String) JOptionPane.showInputDialog(null, "Combat!", null, JOptionPane.QUESTION_MESSAGE, null, combatChoices, combatChoices[0]);
			
				if (battleSequence == "Shoot"){
				
					int damage = (int)(Math.random()*10);
					
					enemyHealth = enemyHealth - damage;
					
				}
			
				if (battleSequence == "Take cover"){
					
					boolean cover = true;
					enemyMove(cover);
					
				}
					
				
					
			
				if (battleSequence == "Flee"){
					if (cantFlee == 0) {
					
						endTurn = false;
						
					}
					
					else {
						
					}
				
				}while(endTurn = false);
				
			}while (enemyHealth > 0 && health > 0);
			
		
		}
		
		public static void enemyMove(boolean cover, int health) {
			
			int enemyPlan = (int)(Math.random()*20);
			
			if (enemyPlan >= 0 && enemyPlan <= 9) {
				
				System.out.println("The enemy takes cover");
				
				return;
				
			}
			
			if (enemyPlan > 9) {
				
				int enemyDamage = (int) (Math.random()*5);
				
				health = health - enemyDamage;
				
				System.out.println("Your health is now " + health);
				
				return;
			}
				
			}
			
		}
}
