package ch9;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "100,200,300,400";
		StringTokenizer at = new StringTokenizer(source, ",");
		
		while(at.hasMoreTokens()) {
			System.out.println(at.nextToken());
		}

	}

}
