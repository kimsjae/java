package ch13.programming;

import java.util.Arrays;
import java.util.HashSet;

public class Ex04 {

	public static void main(String[] args) {
		HashSet<String> s1 = new HashSet<>(Arrays.asList("A", "B", "C"));
		HashSet<String> s2 = new HashSet<>(Arrays.asList("A", "D"));
		
		
		s1.addAll(s2);
		System.out.println("합집합 " + s1);
		
		s1 = new HashSet<>(Arrays.asList("A", "B", "C"));
		
		s1.retainAll(s2);
		System.out.println("교집합 " + s1);
	}

}
