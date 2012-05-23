
public class Euler4 {	 
	public static void main(String[] args) { 		
		String result; 		
		for (int i = 900; i <= 999; i++) { 
			for (int j = 900; j <= 999; j++) { 
				int ans = i * j; 
				result = Integer.toString(ans); 
				if(isPalindrome(result)) { 
					System.out.println(result + " " + i + " " + j); 
				} 
			} 
		} 		 
	} 
	
	public static boolean isPalindrome(String number) { 		
		StringBuilder sb1 = new StringBuilder(number); 		
		if (sb1.toString().equals(sb1.reverse().toString()))  
			return true; 
		else 
			return false; 
	}
}