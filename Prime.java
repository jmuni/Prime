import java.util.Scanner;

public class Prime{
	
	//public int num;
	//public boolean isPrime = true;
	
	public static void main(String args[]) {
	
	boolean isPrime = true;
	
	System.out.println("Enter a number greater than 2. This program will check all the numbers up to and including that number if it is prime");
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	
	input.close();
	System.out.println();
	System.out.println("List of Primes up to your number");
	System.out.println();
	System.out.println("1"); //Base Case since 1 can't be divided by anything other than itself.
	System.out.println("2"); //Base Case since there are no number between 1 and 2 to divide 
	
	for(int i = 3; i <= n; i++) {
		for(int j = i - 1; j > 1; j--) {
			//System.out.println("num is " + i);
			//System.out.println("j is " + j);
			
			if( i % j == 0) {
				//System.out.println("Divisible");
				isPrime = false;
				break;
			}
		}
	
		if(isPrime == true) {
			System.out.println(i);
		
		}
		isPrime = true;
		
	}
	

	}
}
