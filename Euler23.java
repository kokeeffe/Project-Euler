
public class Euler23 {
	public static void main(String[] args) {
		boolean[] abundant = new boolean[30000];
		boolean[] abundantSum = new boolean[30000];
		int sum = 0;
		for (int i = 10; i < 30000; i++) {
			if (i < divisorSum2(i))
				abundant[i] = true;
		}
		for (int i = 0; i < 30000; i++) {
			if (abundant[i]) {
				for (int j = i; j < 30000; j++) {
					if (i + j < 30000) {
						if (abundant[j])
							abundantSum[i + j] = true;
					}
				}
			}
		}
		for (int i = 0; i < 30000; i++)
			if (!abundantSum[i])
				sum += i;
		System.out.print(sum);
	}

	public static int divisorSum2(int num) {
		int sum = 1;
		boolean[] factors = new boolean[num / 2 + 1];
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				factors[i] = true;
		}
		for (int i = 0; i <= num / 2; i++) {
			if (factors[i])
				sum += i;
		}

		return sum;
	}
}
