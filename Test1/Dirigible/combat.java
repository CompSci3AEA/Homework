package Dirigible;

import javax.swing.JOptionPane;

public class combat {

	public static void battle(int health, int enemyHealth, boolean cantFlee) {
		// TODO Auto-generated method stub
		do{
			int cover = 0;
			boolean fleeOption = cantFlee;
			playerTurn(health, enemyHealth, fleeOption);
		}while (health > 0 && enemyHealth > 0);
	}
			
	public static int playerTurn(int health, int enemyHealth, boolean fleeOption){
		

		do{
			String [] combatOptions = {"Attack","Take Cover", "Flee"};
			String playerMove = (String) JOptionPane.showInputDialog(null, "Combat plan", null, JOptionPane.QUESTION_MESSAGE, null, combatOptions, combatOptions[0]);
		
			if (playerMove == "Attack"){
				
				int damage = (int)(Math.random()*10);
				enemyHealth = enemyHealth - damage;
				System.out.println("Enemy has taken " + damage + "! Current health is " + enemyHealth);
				
			}
		
			if (playerMove == "Take Cover"){
			

				
			}
		
			if (playerMove == "Flee"){
			
			}
		}while(fleeOption == false);
		
		return enemyHealth;
		
	}
	
	public static void enemyTurn(int health, int enemyHealth, boolean fleeOption, int cover){
		
	}
}
