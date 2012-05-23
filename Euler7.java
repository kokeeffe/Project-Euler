import java.util.ArrayList;


public class Euler7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int prime = primeNumber();
		System.out.print(prime);
	}
	
	public static int primeNumber(){
		int prime = 2;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(prime);
		prime++;
		for(int i = 1; i <= 10000; i++){
			boolean foundPrime = false;
			for(int j = prime;!foundPrime;j+=2){
				boolean isPrime = true;
				for(Integer pri:primes){
					if(j%pri == 0){
						isPrime = false;
						break;						
					}						
				}
				if(isPrime){
					for(int k = 2;k<j;k++)
					{
						if(j%k == 0){
							isPrime = false;
							break;
						}
					}
				}
				if(isPrime){
					primes.add(j);
					prime = j;
					foundPrime = true;
				}
			}
		}
		return prime;
	}

}
