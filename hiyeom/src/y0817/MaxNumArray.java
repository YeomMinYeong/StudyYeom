package y0817;

import java.util.Scanner;

public class MaxNumArray {

	public static void main(String[] args) {
//	9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int max = 0;
		
		int[]num = new int[9];
		for(int i=0; i<9; i++) {
			
			num[i] = sc.nextInt();
			if(num[i]>max) {
				max=num[i];
				cnt=i+1;
			}
			sc.close();
			System.out.println(max);
			System.out.println(cnt);
		}
	}
}
