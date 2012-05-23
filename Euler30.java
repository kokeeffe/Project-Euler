import java.util.ArrayList;


public class Euler30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList();
		int result = 0;
		for(int i = 2;i < 1000000;i++){
			String number = i + "";
			int sum = 0;
			char[] chars = number.toCharArray();
			for(char c:chars){
				sum += Math.pow(Integer.parseInt(c + ""),5);
			}
			if(i == sum)
				nums.add(i);
		}
		for(Integer n:nums){
			result += n;
		}
		System.out.print(result);
	}

}
