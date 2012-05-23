
public class Euler28 {
	public static void main(String[] args) {
		int one = 1;
		double two = .5;
		int three = 2;
		double four = 1.5;
		int oneN = 1, twoN = 1, threeN = 1, fourN = 1;
		int sum = 1;
		for(int i = 1;i <= 500;i++){
			oneN += (one * 4);
			twoN += (two * 4);
			threeN += (three * 4);
			fourN += (four * 4);
			sum += oneN + twoN + threeN + fourN;
			one += 2;
			two += 2;
			three += 2;
			four += 2;
		}
		System.out.print(sum);
	}

}
