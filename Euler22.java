import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Euler22 {
	public static void main(String[] args) {
		String[] names;
		int[] nameValues;
		long total = 0;
		try {
			FileInputStream fis;
			fis = new FileInputStream("files/names.txt");
			DataInputStream dis = new DataInputStream(fis);
			BufferedReader br = new BufferedReader(new InputStreamReader(dis));
			String txtLine = br.readLine();
			names = txtLine.split("\",\"");
			names[0] = names[0].substring(1);
			nameValues = new int[names.length];
			Arrays.sort(names, new CustomComparator());
			for(int i = 0;i < names.length;i++){
				String name = names[i];
				int sum = 0;
				char[] chars = name.toCharArray();
				for(char ch:chars)
					if(ch != '\"')					
						sum += Character.getNumericValue(ch) - 9;
				nameValues[i] = sum * (i + 1);
			}
			for(int i:nameValues)
				total += i;
			System.out.print(total);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class CustomComparator implements Comparator<String> { 
    @Override 
    public int compare(String o1, String o2) { 
        return o1.compareTo(o2); 
    } 
}