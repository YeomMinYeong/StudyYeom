package y0809;

import java.util.Scanner;

public class compare {

	public static void main(String[] args) {
		//21.08.09 복습 	
		// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		int A = 10;
		int B = 10;

		if(A<B) {
			System.out.println("<");
		}else if(A>B) {
			System.out.println(">");
		}else if(A==B) {
			System.out.println("==");
		}

		/*
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}else if(A<B){
			System.out.println("<");
		}else if(A==B) {
			System.out.println("=");
		}
		*/
		}
	}