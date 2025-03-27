
public class Car extends Vehicle {
	private String type;
	private boolean isManual;
	private int gears;
	private int wheels;
	private int doors;
	
	private int currentGear;
	
	public Car(String name, String type, boolean isManual, int gears, int wheels, int doors) {
		super(name);
		this.setType(type);
		this.setManual(isManual);
		this.setGears(gears);
		this.setWheels(wheels);
		this.setDoors(doors);
	}
	
	public void changeGear(int newGear) {
		setCurrentGear(newGear);
		System.out.println("Changed to gear " + newGear);
	}
	
	public void changeSpeed(int newSpeed, int newDirection) {
		move(newSpeed, newDirection);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}
}
