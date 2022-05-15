package week1.day1;

public class PrimeNumber {

		
		public static void main(String[] args) {
			
			int input = 23;
			
			boolean isPrime = true;
				
			int range = input/2;
			
			if (range == 0 || range == 1)
			{
				System.out.println("It's  not Prime Number");
			}
			else 
				
				for (int i=2; i<=range; i++)
					
					if (input%i==0)
					{
						isPrime=false;
						
						break;
					}					
		if (isPrime)
		{
			System.out.println("It's prime Number");
		}
		else
		{
			System.out.println("It's  not Prime Number");
		}
}
		
}





