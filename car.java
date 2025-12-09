package M2_OOP_Activity;

public class car extends Vehicle {

	public car(String brand, int numberOfWheels)
	{
		super(brand, numberOfWheels);
		
	}

	@Override
	public void refuel()
	{
		System.out.println("Car Refueled");
	}
	
	@Override
	public void destroy()
	{
		System.out.println(getBrand()+" Car destroyed");
	}

}
