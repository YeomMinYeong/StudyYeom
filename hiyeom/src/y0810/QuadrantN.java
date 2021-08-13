package y0810;

import java.util.Scanner;

public class QuadrantN {

	public static void main(String[] args) {
/*
 * 흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 
 * 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. 
 */
		Scanner sc = new Scanner(System.in);
		int x,y; 
		x = sc.nextInt();
		y = sc.nextInt();

		if(x>0) { // x가 + 일 때 
			if(y>0) System.out.println("1"); // y도 +
			else System.out.println("4"); // x=+ , y=-

		}else { // x가 -일 때 
			if(y>0) System.out.println("2"); // y도 -
			else System.out.println("3"); // y는 + 
		}
		sc.close();
	}

}