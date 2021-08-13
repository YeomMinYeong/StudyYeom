package y0810;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
	// 구구단 입력 출력 

		Scanner sc = new Scanner(System.in);
		int n = 0;
		int result = 0; 

		System.out.println("출력할 구구단 입력: ");
		n = sc.nextInt();
		for(int i=1; i<10; i++) {
			result = n*i;
			System.out.println(n+"X"+i+"="+result);
			System.out.printf("%d x %d = %d \n", n, i, result);
		}
	}
}