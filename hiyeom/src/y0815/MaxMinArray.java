package y0815;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int []array = new int[input];
		int max, min;
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		max = array[0];
		min = array[0];
		
		for(int i=0; i<array.length; i++) {
			if(max <= array[i])
				max = array[i];
			if(min <= array[i])
				min = array[i];
			}
		System.out.println(min + "  " + max);
	}

}
