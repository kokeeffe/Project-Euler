
public class Euler10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long prime = primeNumberSum2();
		System.out.print(prime);
	}
	
	public static long primeNumberSum2(){
		boolean[] numbers = new boolean[2000000];
		long sum = 0;
		for(int i = 0;i < numbers.length;i++)
			numbers[i] = true;
		for(long i = 2;i < numbers.length;i++){
			if(numbers[(int)i]){
				long j = i*i;
				while(j < numbers.length){
						numbers[(int)j] = false;
						j += i;
				}
			}
		}
		for(int i = 2;i < numbers.length;i++){
			if(numbers[i])
					sum += i;
			}
		return sum;
		}	
}
