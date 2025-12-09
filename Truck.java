package M2_OOP_Activity;

public class Truck extends Vehicle{
	
	public Truck(String brand, int numberOfWheels)
	{
		super(brand, numberOfWheels);
	}

	@Override
	public void refuel()
	{
		System.out.println("Truck Refueled");
	}
	
	@Override
	public void destroy()
	{
		System.out.println(getBrand() +" Truck destroyed");
	}

}
