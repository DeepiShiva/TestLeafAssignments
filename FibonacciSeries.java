package week1.day1;

import java.util.Iterator;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int  sum, firstNumber=0, secondNumber=1; 
		System.out.println("Fibonacci Series is :" + firstNumber);	
		System.out.println("Fibonacci Series is :" + secondNumber);	
		for (int range = 2; range < 8; range++)
		{
			sum = firstNumber + secondNumber;
			System.out.println("Fibonacci Series is :" + sum );
			firstNumber = secondNumber;
			secondNumber = sum;	
			
		}
		
	}
}
