package M2_OOP_Activity;

public class MSExcel extends Program{
	
	public MSExcel(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		String message = "Opening MS Excel...";
		setRun(true);
		System.out.println(message);
	}
	
	@Override
	public void stop() {
		String message = "Stopping MS Excel...";
		setRun(false);
		System.out.println(message);
	}

}
