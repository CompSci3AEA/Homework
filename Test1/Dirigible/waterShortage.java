package Dirigible;

import javax.swing.JOptionPane;

public class waterShortage {

public static void water(String[] args) throws InterruptedException{
	
	int waterShortageBegin = JOptionPane.showConfirmDialog(null, "Captain, we are low on water. Do you want to go landside and find some?");
	
	if (waterShortageBegin == JOptionPane.YES_OPTION) {
		int locationNumber = (int)(Math.random()*20);
		
		String [] locationNames = {"Meridian Bay", "Gale Crater", "Windsrow", "Tharsis Bulge", "Valles Marineris",
				"Cerberus Province", "Olympus Mons", "Schiaparelli Crater", "Kaiser Sea", "Lockyer Land", "Dominus Canyon", 
				"Bellator", "Crash Site-7", "Baurus Delta", "Carnega", "Lucifen Range", "Tharsis Highway", "Haliturn Quarry", 
				"The Burntside", "The old shipyard"};
		
		String questZone = locationNames[locationNumber];
		//System.out.println(locationNumber);
		//System.out.println(questZone);
		
		System.out.println("Great captain, we found water in " + questZone + ". Your transport is awaiting your order to leave.");
		
		Thread.sleep(1000);
		System.out.println();
		System.out.println(questZone + ":0400 hours");
		System.out.println();
		
		Thread.sleep(1000);
		System.out.println("You arrive at a small farm, and notice the area is full of NMA troops");
		Thread.sleep(1000);
		System.out.println("You recognize Colonel Howards, and evidentially so does he, because he approaches you.");
		Thread.sleep(2000);
		System.out.println("Colonel Howards: Captain, what do you need?");
		Thread.sleep(1000);
		
		String[] choices = { "We need water.", "We want to trade.", "None of your business."};
	    String Purpose = (String) JOptionPane.showInputDialog(null, "Purpose?", null, JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
	    
	    if (Purpose == "We need water.") {
	    	System.out.println("Colonel Howards: Well, we need water as well.");
	    	Thread.sleep(1000);
	    	System.out.println("Danton: Surely we can reach a compromise.");
	    	Thread.sleep(1000);
	    	System.out.println("Colonel Howards: There is water under raider control down a bit. We can't spare the forces, but if you wish to help...");
	    	Thread.sleep(2000);
	    	
	    	String[] howardsResponse = {"We'll help with those raiders", "Sorry, not today", "I know someone else I can fight..."};
	    	String water = (String) JOptionPane.showInputDialog(null, "Help?", null, JOptionPane.QUESTION_MESSAGE,null, howardsResponse, howardsResponse[0]);
	    	
	    	if (water == "We'll help with those raiders"){
	    		System.out.println("Colonel Howards: Glad to hear that.");
	    		
	    	}
	    	
	    	if (water == "Sorry, not today"){
	    		System.out.println("Colonel Howards: Well, you better be on your way then.");
	    		Thread.sleep(1000);
	    	}
	    	
	    	if (water == "I know someone else I can fight...") {
	    		System.out.println("Colonel Howards: Then a fight you shall have.");
	    		
	    	}
	    		
	    }
	    
	    if (Purpose == "We want to trade.") {
	    	
	    	System.out.println("Colonel Howards: We have some water for trade.");
    		Thread.sleep(1000);
    		System.out.println("Colonel Howards: We can sell you water for 100 credits. No other prices. Is that good?");
    		String [] trade = {"Yes", "No", "I know a way to get it for free..."};
    		String tradechoice = (String) JOptionPane.showInputDialog(null, "Purchase?", null, JOptionPane.QUESTION_MESSAGE, null, trade, trade[0]);
    		
    		if (tradechoice == "Yes") {
    			System.out.println("Colonel Howards; Pleasure doing business");
    			System.out.println("Water rations have increased");
    		}
	    	
    		if (tradechoice == "No") {
    			System.out.println("Colonel Howard: Well, sorry but we can't afford to part with water for anything less.");
    			
    		}
    		if (tradechoice == "I know a way to get it for free...") {
    			
    		}
	    }
	    
	    if (Purpose == "None of your business.")
	    	System.out.println("Colonel Howards: Then you have no business to be here. Be on your way.");
    		Thread.sleep(1000);
		
	}
		
	if (waterShortageBegin == JOptionPane.NO_OPTION) {
		System.out.println("I'm sure we have enough water to last us a while longer.");
		Thread.sleep(1000);

	}
		
	if (waterShortageBegin == JOptionPane.CANCEL_OPTION) {
		System.out.println("I'm sure we have enough water to last us a while longer.");
		Thread.sleep(1000);
	}
	}

}