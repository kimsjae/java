package ch03.programming;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex15 {

	public static void main(String[] args) throws IOException {
		int[][] arr = new int[3][5];
		
		for (int i = 0; i < 5; i++) {
			int a = (int) (Math.random() * 3);
			int b = (int) (Math.random() * 5);
			
			if (arr[a][b] == 0) {
				arr[a][b] += 1;
			} else {
				i--;
				continue;
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				bw.write(arr[i][j] + " ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}

}
