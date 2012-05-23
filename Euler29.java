import java.util.HashSet;


public class Euler29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet nums = new HashSet();
		int count = 0;
		for(int i = 2;i <= 100;i++){
			for(int j = 2;j <= 100;j++)
				if(nums.add(Math.pow(i, j)))
					count++;
		}
		System.out.println(nums.size());

	}

}
