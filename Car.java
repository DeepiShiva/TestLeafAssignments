package week1.day1;

public class Car {

	public void applyBrake()
	{
		System.out.println("Please Apply Brake");
	}
	
	public void applyGear()
	{
		System.out.println("Please Apply Gear");
	}
	
	public void switchonAc()
	{
		System.out.println("Please Switchon AC");
	}
	
	public void applyAccelerate()
	{
		System.out.println("Please Apply Accelerator");
	}
		
	public static void main(String[] args) {
		
		Car KIA = new Car ();
		KIA.switchonAc();
		KIA.applyGear();
		KIA.applyAccelerate();
		KIA.applyBrake();

	}

}
