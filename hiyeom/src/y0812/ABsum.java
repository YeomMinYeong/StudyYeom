package y0812;

import java.util.Scanner;

public class ABsum {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		Scanner s = new Scanner(System.in);

		double A = s.nextInt();
		double B = s.nextInt();

		for(int i=1; i<=5; i++) {
			System.out.println(A+B);
		}
		s.close();
	}

	/* 인터넷 추가 풀이
	Scanner in = new Scanner(System.in);
	double A = in.nextDouble();
	double B = in.nextDouble();
	System.out.println(A/B);
	*/
}
