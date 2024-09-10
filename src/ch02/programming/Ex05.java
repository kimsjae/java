package ch02.programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		bw.write("시간간격을 입력하시오(단위: 초): ");
		bw.flush();
		
		int second = Integer.parseInt(br.readLine());
		
		int meter = 340 * second;
		bw.write("번개가 발생한 곳까지의 거리: " + meter + "m");
		bw.flush();
		bw.close();
	}

}
