
public class Euler24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String answer = "";
		boolean[] dig = new boolean[10];
		int digits = 10;
		int num = 1000000;
		while(digits > 0){
			digits--;
			int digit = num/factorial(digits);
			if(num%factorial(digits) > 0)
				digit++;
			int i = 0;
			int count = 0;
			while(i < 10){
				if(!dig[i])
					count++;
				if(count == digit)
					digit = i;
				i++;
			}
			num = num%factorial(digits);
			dig[digit] = true;
			answer += digit;
		}
		System.out.print(answer);
	}
	
	public static int factorial(int num){
		int result = 1;
		for(int i = 1; i <= num;i++)
			result *= i;
		return result;
	}

}
