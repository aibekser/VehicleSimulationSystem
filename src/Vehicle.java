
public class Vehicle {
	private String name;
	private int currentSpeed;
	private int currentDirection;
	
	public Vehicle(String name) {
		this.setName(name);
		this.currentSpeed = 0;
		this.currentDirection = 0;
	}
	
	public void move(int speed, int direction) {
		this.currentSpeed = speed;
		this.currentDirection = direction;
		System.out.println("Moving at " + this.currentSpeed + " in direction " + this.currentDirection + "\n");
	}
	
	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("Moving at " + this.currentSpeed + " in direction " + this.currentDirection);
	}
	
	public void stop() {
		this.currentSpeed = 0;
		System.out.println("Vehicle is stopped");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	public int getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}
	
	
}
