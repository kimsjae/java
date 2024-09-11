package ch04;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

import javax.swing.JFrame;

public class LabWindowRace {
	
	public static void main(String[] args) {
		JFrame frame1 = new JFrame("Frame 1");
		frame1.setSize(300, 200);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLocation(0, 100);
		frame1.setVisible(true);

		JFrame frame2 = new JFrame("Frame 2");
		frame2.setSize(300, 200);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setLocation(0, 500);
		frame2.setVisible(true);

		Thread race1 = new Thread(new WindowMover(frame1, 100, "Frame 1"));
		Thread race2 = new Thread(new WindowMover(frame2, 500, "Frame 2"));

		race1.start();
		race2.start();
	}
}

class WindowMover implements Runnable {
	private JFrame window;
	private int yPosition;
	private Random random;
	private String windowName;

	public WindowMover(JFrame window, int yPosition, String windowName) {
		this.window = window;
		this.yPosition = yPosition;
		this.random = new Random();
		this.windowName = windowName;
	}

	@Override
	public void run() {
		int xPosition = 0;

		while (xPosition < 1620) {
			try {
				int moveDistance = random.nextInt(20) + 1;
				xPosition += moveDistance;

				window.setLocation(xPosition, yPosition);

				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			bw.write(windowName + " finished the race!");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}



