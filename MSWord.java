package M2_OOP_Activity;

public class MSWord implements Executable{
	@Override
	public void run()
	{
		System.out.println("Opening MS Word...");
	}
	@Override
	public void stop()
	{
		System.out.println("Stopping MS Word...");
	}
	
}
