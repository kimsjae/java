package ch13.programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<String, String> m = new HashMap<>();
		m.put("USA", "Washington");
		m.put("Japan", "Tokyo");
		m.put("China", "Beiging");
		m.put("UK", "London");
		m.put("Korea", "Seoul");
		
		bw.write("국가 이름을 입력하시오: ");
		bw.flush();
		
		String key = br.readLine();
		
		bw.write(key + "의 수도: " + m.get(key));
		bw.flush();
		bw.close();
	}

}
