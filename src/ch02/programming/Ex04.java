package ch02.programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		bw.write("P\tQ\tAND\tOR\tXOR\n");
		bw.write("true\ttrue\ttrue\ttrue\tfalse\n");
		bw.write("true\tfalse\tfalse\ttrue\ttrue\n");
		bw.write("false\ttrue\tfalse\ttrue\ttrue\n");
		bw.write("false\tfalse\tfalse\tfalse\tfalse\n");
		bw.flush();
		bw.close();
	}

}
