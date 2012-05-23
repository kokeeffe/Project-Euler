import java.util.HashMap;


public class Euler19 {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashMap month = new HashMap();
		month.put(1,1);
		month.put(2,4);
		month.put(3,4);
		month.put(4,0);
		month.put(5,2);
		month.put(6,5);
		month.put(7,0);
		month.put(8,3);
		month.put(9,6);
		month.put(10,1);
		month.put(11,4);
		month.put(12,6);
		int count = 0;
		boolean leapYear = false;
		for(int i = 1901;i <= 2000;i++){
			for(int j = 1;j <= 12;j++){
				int sum = i % 100;
				if(sum % 4 == 0)
					leapYear = true;
				sum /= 4;
				sum++;
				sum += (int)month.get(j);
				if(leapYear && (j == 1 || j == 2))
					sum--;
				if(i == 2000)
					sum += 6;
				sum += i % 100;
				sum %= 7;
				if(sum == 1)
					count++;
			}
		}
		System.out.print(count);
	}

}
