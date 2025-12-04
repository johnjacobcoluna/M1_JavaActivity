package M2_OOP_Activity;

public class Car {

	public String carName;
	public String carModel;
	
//set value
	public Car()
	{
		this.carName = "Toyota";
		this.carModel = "Raize";
	}
	
	public String getcarName() 
	{
		return carName;
	}
	
	public String getcarModel()
	{
		return carModel;
	}
	
//get value
	public Car(String carName, String carModel) 
	{
		this.carName = carName;
		this.carModel = carModel;
	}
	public void setcarName(String carName) 
	{ 
		this.carName = carName; 
	}
	public void setcarModel(String carModel) 
	{ 
		this.carModel = carModel; 
	}
	
	public String getCarNameInfo()
	{
		return "Car Name: " + carName + "\nModel: " +carModel;
	}
}
