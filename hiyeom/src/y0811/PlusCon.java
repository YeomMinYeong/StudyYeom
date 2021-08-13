package y0811;

import java.util.Scanner;

public class PlusCon {

/*
 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)	
 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/* 첫 번째
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		System.out.println(A/B);
		*/
		int A = 10;
		int B = 10;
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println(A+B);
	}

}