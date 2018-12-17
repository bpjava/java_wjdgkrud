package ch9;

import java.util.*;

public class RandomEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] num = new int[100];
		int[] counter = new int[10];
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]=rand.nextInt(10));
		}
		System.out.println();
		
		for(int i=0; i<num.length; i++) {
			counter[num[i]]++;
		}
		
		for(int i=0; i<counter.length; i++) {
			System.out.println(i+"ÀÇ °³¼ö : "+printGraph('#',counter[i])+" "+counter[i]);
		}
		

	}
	
	public static String printGraph(char ch, int value){
		char[] bar = new char[value];
		
		for(int i=0; i<bar.length; i++) {
			bar[i]=ch;
		}
		return new String(bar);
	}

}
