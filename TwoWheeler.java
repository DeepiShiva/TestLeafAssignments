package week1.day1;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 1234532;
	boolean isPunctured = true;
	String bikeName = "Honda Activa 5G";
	double runningKM = 1500;

	public static void main(String[] args) {

		TwoWheeler Activa = new TwoWheeler();
		System.out.println("No Of Wheels: " + Activa.noOfWheels);
		System.out.println("No Of Mirrors: " + Activa.noOfMirrors);
		System.out.println("Chassis Number is : " + Activa.chassisNumber);
		System.out.println("Is Bike Punctured : " + Activa.isPunctured);
		System.out.println("My Bike Name is  : " + Activa.bikeName);
		System.out.println("Total KM's ran so far is :" + Activa.runningKM + " KM");

	}

}
