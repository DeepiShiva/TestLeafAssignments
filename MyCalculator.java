package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		CalculatorAssignment myCalc = new CalculatorAssignment();
		
		int sum = myCalc.addFunction(10, 5, 15);
		{
		 System.out.println("Sum of Three Numbers is " +sum);
		}
		
		int difference = myCalc.subtractFunction (25, 15);
		{
			System.out.println("Difference of two Numbers is " +difference);
		}
		
		double product = myCalc.multiplyFunction(24.5, 36.5);
		{
			System.out.println("Product of two Numbers is " +product);
		}
		
		float Quotient = myCalc.divideFunction(36f, 4f);
		{
			System.out.println("Quotient of two Numbers is " +Quotient);
		}
		
	}

}
