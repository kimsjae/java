package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MiniProject {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("====================\n");
		bw.write("1. 화씨 -> 섭씨\n");
		bw.write("2. 섭씨 -> 화씨\n");
		bw.write("====================\n");
		bw.write("번호를 선택하시오: \n");
		bw.flush();
		
		int num = Integer.parseInt(br.readLine());
		
		while(num != 1 || num != 2) {
			if (num == 1 || num == 2) {
				break;
			}
			bw.write("1번과 2번 중 선택하시오.\n");
			bw.flush();
			num = Integer.parseInt(br.readLine());
		}
		
		if (num == 1) {
			bw.write("화씨온도를 입력하시오: \n");
			bw.flush();
			double tempF = Double.parseDouble(br.readLine());
			double tempC = 5 * (tempF - 32) / 9;
			bw.write("섭씨온도는 " + + tempC + "\n");
		} 
		if (num == 2) {
			bw.write("섭씨온도를 입력하시오: \n");
			bw.flush();
			double tempC = Double.parseDouble(br.readLine());
			double tempF = 9 * tempC / 5 + 32;
			bw.write("화씨온도는 " + + tempF + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
