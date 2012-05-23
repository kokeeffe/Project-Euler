import java.util.Hashtable;


public class Euler17 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Hashtable num = new Hashtable();
		num.put(0,0);
		num.put(1,3);
		num.put(2,3);
		num.put(3,5);
		num.put(4,4);
		num.put(5,4);
		num.put(6,3);
		num.put(7,5);
		num.put(8,5);
		num.put(9,4);
		num.put(10,3);
		num.put(11,6);
		num.put(12,6);
		num.put(13,8);
		num.put(14,8);
		num.put(15,7);
		num.put(16,7);
		num.put(17,9);
		num.put(18,8);
		num.put(19,8);
		num.put(20,6);
		num.put(30,6);
		num.put(40,5);
		num.put(50,5);
		num.put(60,5);
		num.put(70,7);
		num.put(80,6);
		num.put(90,6);
		num.put(100,7);
		int sum = 11;
		for(int i = 1;i < 1000;i++){
			int tempSum = 0;
			int j = i;
			if(j >= 100){
				tempSum += (int)num.get(j/100) + (int)num.get(100);
				j = j % 100;
				if(j != 0)
					tempSum += 3;
			}
			if(j >= 20){
				tempSum += (int)num.get((j/10)*10);
				j = j % 10;
			}
			if(j >= 1)
				tempSum += (int)num.get(j);
			sum += tempSum;
		}
		System.out.print(sum);
	}
}
