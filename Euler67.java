import java.io.*;

public class Euler67 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] pyr = new int[100][100];
		try {
			FileInputStream fis;
			fis = new FileInputStream("files/triangle.txt");
			DataInputStream dis = new DataInputStream(fis);
			BufferedReader br = new BufferedReader(new InputStreamReader(dis));
			String txtLine;
			int index = 0;
			while((txtLine = br.readLine()) != null){
				String[] tempStringArray = txtLine.split(" ");
				for(int i = 0;i < tempStringArray.length; i++)
					pyr[index][i] = Integer.parseInt(tempStringArray[i]);
				index++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i = 98;i >= 0;i--){
			for(int j = 0;j < i+1;j++){
				pyr[i][j] = pyr[i][j] + Math.max(pyr[i+1][j], pyr[i+1][j+1]);
			}
		}
		System.out.print(pyr[0][0]);
	}

}
