package Path;

public class PrimeNumber {

	public static void main(String[] args) {
		
//what is prime number: numbers that can be divided by 1 and the number itself
		//Example: 2, 3, 5,7,11,13,17......n
		
		Boolean isPrime= true;
		int NumbertobeChecked=20;
		int numberofPrime=0;
		
		for(int i=2; i<NumbertobeChecked; i++)
		{
			isPrime=true;
			for(int j=2; j<i/2; j++)
			{
				
				if(i%j==0){
					j=i;
					isPrime=false;
					//System.out.println(i + "is not a prime number ");
				}}
			
				if (isPrime)
				{
					System.out.println(i + "is a prime number ");
					numberofPrime++;
				}
			}
				
		}
	}


