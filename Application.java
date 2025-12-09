package M2_OOP_Activity;

public class Application {
	public static void main(String[] args) {
		
		car car = new car("Toyota", 1);
		Truck truck = new Truck("HINO", 1);
		
		car.startEngine();
		car.refuel();
		
		truck.startEngine();
		truck.refuel();
		
		destroyVehicle(car);
	}
	
	public static void destroyVehicle(Vehicle vehicle)
	{
		vehicle.destroy();
	}
}
