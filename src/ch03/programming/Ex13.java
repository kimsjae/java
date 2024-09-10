package ch03.programming;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex13 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		
		for (int i = 0; i < 5; i++) {
			int randomSuit = (int) (Math.random() * 4);
			int randomRank = (int) (Math.random() * 13);
			bw.write(suit[randomSuit] + "의 " + rank[randomRank] + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
