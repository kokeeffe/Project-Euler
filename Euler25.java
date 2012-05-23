import java.math.BigDecimal;


public class Euler25 {
	public static void main(String[] args) {
		BigDecimal first = BigDecimal.valueOf(1);
		BigDecimal second = BigDecimal.valueOf(1);
		for(int i = 3;i < 5000;i++){
			BigDecimal temp = second;
			second = second.add(first);
			first = temp;
			if(second.toString().length() == 1000)
				System.out.println(i + ": " + second.toString());
		}
	}

}
