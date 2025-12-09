package M2_OOP_Activity;

public abstract class Vehicle implements Refuelable {
	
	private String brand;
	private int numberOfWheels;
	
	public Vehicle(String brand, int numberOfWheels)
	{
		this.setBrand(brand);
		this.numberOfWheels=numberOfWheels;
	}
	
	abstract void destroy();

	public void startEngine()
	{
		System.out.println("Engine starting on "+brand);
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
