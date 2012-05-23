import java.util.ArrayList;
import java.util.List;

public class Euler12 {
	public static List<Long> primeFactors(long numbers) {
		long n = numbers; 
		List<Long> factors = new ArrayList<Long>();
		for (long i = 2; i <= n / i; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		if (n > 1) {
			factors.add(n);
		}
		return factors;
	}
	
	public static int divisors(List<Long> factors){
		long last = 0;
		int count = 1;
		int product = 1;
		for(Long num:factors){
			if(last == num)
				count++;
			else{
				count++;
				product*=count;
				count = 1;
				last = num;
			}
		}
		return product;
	}

	public static void main(String[] args) {
		long tN = 1;
		long i = 1;
		while(divisors(primeFactors(tN))<500){
			i++;
			tN=(i*(i+1))/2;
		}
		System.out.print(tN);
	}
}

