package ch04.MiniProject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Dice {
	private int value;

	public Dice() {
		value = 0;
	}
	
	public void roll() {}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		
		int count = 1;
		while (true) {
			int value1 = (int) (Math.random() * 6) + 1;
			int value2 = (int) (Math.random() * 6) + 1;
			
			dice1.setValue(value1);
			dice2.setValue(value2);
			
			bw.write("주사위1= " + dice1.getValue() + " 주사위2= " + dice2.getValue() + "\n");
			
			if (dice1.value + dice2.value == 2) {
				bw.write("(1, 1)이 나오는데 걸린 횟수= " + count);
				break;
			} else {
				count++;
			}
		}
		
		bw.flush();
		bw.close();
	}

}
