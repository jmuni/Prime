import java.util.Scanner;

public class isPrime {
	
	public static void main(String args[]) {
	
	boolean isPrime = true;
	
	System.out.println("Enter a number greater than 2. This program will check if it is prime");
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	
	input.close();
	
	int divisible = 0;
	
		for(int j = n - 1; j > 1; j--) {
	
			
			if( n % j == 0) {
				isPrime = false;
				divisible = j;
				break;
			}
		}
	
		if(isPrime == true) 
			System.out.println(n + " is prime");
		else
			System.out.println(n + " is NOT prime. It is divisible by " + divisible);
		
	}
	

	
}


