
public class Skater {
	String name;
	int number;
	int speed;
	int acceleration;
	int power;
	int stick;
	
	public Skater(String name, int number, int speed, int acceleration, int power, int stick) {
		this.name = name;
		this.number = number;
		this.speed = speed;
		this.acceleration = acceleration;
		this.power = power;
		this.stick = stick;
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
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getAccelertion() {
		return acceleration;
	}
	
	public void setAcceleration (int acceleration) {
		this.acceleration = acceleration;
	}
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	public int getStick() {
		return stick;
	}
	
	public void setStick (int stick) {
		this.stick = stick;
	}

}
