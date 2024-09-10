package ch02.programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		bw.write("마일을 입력하시오: ");
		bw.flush();
		
		double mile = Double.parseDouble(br.readLine());
		double km = 1.609 * mile;
		
		bw.write(mile + "마일은 " + km + "킬로미터입니다.");
		bw.flush();
		bw.close();		
	}

}
