package Interface;

public abstract class Motorcar implements car {
	
	int size=10;
	public void carBodySize()
	{
		System.out.println("CarSize: "+ size);
	}
	
	public void needEngine()
	{
		System.out.println("MotorEngine Car");
	}
	
	public void start()
	{
		System.out.println("Start the Engine to Drive");
	}
	
	public void stop()
	{
		System.out.println("Stop the car");
	}
	public abstract void Enginerunonngine();
	
}
