import java.math.BigInteger;


public class Euler16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String num = BigInteger.valueOf(2).pow(1000).toString();
		int sum = 0;
		for(int i = 0;i < num.length();i++)
			sum = sum + Integer.parseInt(num.charAt(i) + "");
		System.out.println(sum);
	}

}
