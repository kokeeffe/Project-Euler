import java.math.BigInteger;


public class Euler20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String num = fact(BigInteger.valueOf(100)).toString();
		int sum = 0;
		for(int i = 0;i < num.length();i++)
			sum += Integer.parseInt(num.charAt(i) + "");
		System.out.print(sum);
	}
	
	public static BigInteger fact(BigInteger n){
		if(n.compareTo(BigInteger.ZERO) == 0)
			return BigInteger.ONE;
		else
			return n.multiply(fact(n.subtract(BigInteger.ONE)));
	}

}
