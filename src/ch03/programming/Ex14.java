package ch03.programming;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex14 {

	public static void main(String[] args) throws IOException {
		int[][] a = {{1, 2, 3}, {1, 2}, {1}, {1, 2, 3}};
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(a[0][0] + " " + a[0][1] + " " + a[0][2] + "\n");
		bw.write(a[1][0] + " " + a[1][1] + "\n");
		bw.write(a[2][0] + "\n");
		bw.write(a[3][0] + " " + a[3][1] + " " + a[3][2] + "\n");
		
		bw.flush();
		bw.close();
	}

}
