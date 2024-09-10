package ch02.programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		bw.write("x: ");
		bw.flush();
		int x = Integer.parseInt(br.readLine());
		
		bw.write("y: ");
		bw.flush();
		int y = Integer.parseInt(br.readLine());
		
		bw.write("두 수의 합: " + (x + y) + "\n");
		
		bw.write("두 수의 차: " + (x - y) + "\n");
		
		bw.write("두 수의 곱: " + (x * y) + "\n");
		
		double avg = (x + y) / 2;
		bw.write("두 수의 평균: " + avg + "\n");
		
		if (x < y) {
			bw.write("큰 수: " + y + "\n");
			bw.write("작은 수: " + x + "\n");
		} else if (x > y){
			bw.write("큰 수: " + x + "\n");
			bw.write("작은 수: " + y + "\n");
		} else {
			bw.write("두 수는 같습니다.\n");
		}
		
		bw.flush();
		bw.close();
	}

}
