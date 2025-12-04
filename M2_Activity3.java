
package M2_OOP_Activity;
import java.util.Scanner;
public class M2_Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Car carName1= new Car(); //Parameter Value was already set
		Car carName2 = new Car("Toyota", "Vios"); //Manually get the define the parameter value details on Main Class
		
		//get value from carName1
		System.out.println("Car Details 1: ");
		System.out.println(carName1.getCarNameInfo());
		
		System.out.println();
		
		//get value from carName2
		System.out.println("Car Details 2: ");
		System.out.println(carName2.getCarNameInfo());
		
		System.out.println("Car Details 2: ");
		System.out.println(carName2.getCarNameInfo());

		System.out.println("\nAdd another Car Details");
		
		System.out.print("Car Name: ");
		String carName=sc.nextLine();
		
		System.out.print("Car Model: ");
		String carModel=sc.nextLine();
		
		Car carName3=new Car(carName, carModel); // Manually get the details on input
		
		System.out.println("\nCar Details 3: ");
		System.out.println(carName3.getCarNameInfo());
	}

}
