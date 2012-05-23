import java.util.HashSet;


public class Euler14 {
	@SuppressWarnings("rawtypes")
	public static HashSet visiteds = new HashSet();
	public static int[] nums = new int[1000000];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 1;i<1000000;i++){
			sequenceNumber2((long)i);
		}
		int max = 0;
		int maxNum = 0;
		for(int i = 0;i<1000000;i++){
			if(nums[i]>max){
				max = nums[i];
				maxNum = i;
			}
		}
		System.out.print(maxNum);
	}
	
	public static int sequenceNumber2(long number){
		int count = 1;
		int index = 0;
		if(number < 1000000)
			index = (int)number;
		if(number!= 1 && nums[index] == 0){
				if(number%2==0){
					count = count + sequenceNumber2(number/2);
				}
				else{
					count = count + sequenceNumber2(3*number+1);
				}
				if(number < 1000000)
					nums[index] = count;
		}
		else
			count = nums[index];
		return count;
	}
}
