package ch02.programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		bw.write("오렌지의 개수를 입력하시오: ");
		bw.flush();
		int orangeCount = Integer.parseInt(br.readLine());
		int neededBoxes = orangeCount / 10;
		int remainingItems = orangeCount % 10;
		bw.write(neededBoxes + "박스가 필요하고 " + remainingItems + "개가 남습니다.");
		bw.flush();
		bw.close();
	}

}
