
public class Euler3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long max = 600851475143L;
		long primes = largestPrime(2,max);
		System.out.print(primes);
		
	}	
	
	public static long largestPrime(long startValue,long number){
		long upperBound = (long)Math.sqrt((double)number);
		long result = startValue;
		if(upperBound <= startValue)
			result = number;
		for(long i = startValue;i<=upperBound;i++){
			if(number%i == 0 && isPrime(i)){
				result = largestPrime(i,number/i);
				break;
			}
		}
		return result;
	}
	
	public static boolean isPrime(long number){
		boolean isPrime = true;
		for(long i = 2; i < number ; i++){
			if(number % i ==0){
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
