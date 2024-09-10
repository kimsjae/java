package ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class MiniProject {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		int randomNum = random.nextInt(100) + 1;
		//int randomNum = (int) (Math.random() * 100) + 1;
		int tryCount = 1;
		int guessNum;
		while (true) {
			bw.write("정답을 추측하여 보시오: ");
			bw.flush();
			guessNum = Integer.parseInt(br.readLine());
			
			if (guessNum > randomNum) {
				bw.write("제시한 정수가 높습니다.\n");
				bw.flush();
				tryCount++;
			} else if (guessNum < randomNum) {
				bw.write("제시한 정수가 낮습니다.\n");
				bw.flush();
				tryCount++;
			} else {
				bw.write("축하합니다. 시도횟수=" + tryCount);
				bw.flush();
				break;
			}
		}
		
		bw.close();
	}

}
