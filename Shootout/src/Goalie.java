
public class Goalie {
	String name;
	int number;
	int glove;
	int agility;
	int stickG;
	int blocker;
	int legs;
	int reflex;
	
	public Goalie(String name, int number, int glove, int agility, int stickG, int blocker, int legs, int reflex) {
		this.name = name;
		this.number = number;
		this.glove = glove;
		this.agility = agility;
		this.stickG = stickG;
		this.blocker = blocker;
		this.legs = legs;
		this.reflex = reflex;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getGlove() {
		return glove;
	}
	
	public void setGlove(int glove) {
		this.glove = glove;
	}
	
	public int getAgility() {
		return agility;
	}
	
	public void setAgility (int agility) {
		this.agility = agility;
	}
	public int getBlocker() {
		return blocker;
	}
	
	public void setBlocker(int power) {
		this.blocker = power;
	}
	
	public int getStickG() {
		return stickG;
	}
	
	public void setStickG (int stickG) {
		this.stickG = stickG;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setLegs (int legs) {
		this.legs = legs;
	}
	
	public int getReflex() {
		return reflex;
	}
	
	public void setReflex (int reflex) {
		this.reflex = reflex;
	}

}
