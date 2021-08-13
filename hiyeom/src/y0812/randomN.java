package y0812;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class randomN {
	// 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
	/*	BufferedReader/BufferedWriter: 버퍼를 이용하여 읽고 쓰는 함수: data를 String으로 고정>parseint 필요
	 * 	(https://jhnyang.tistory.com/92)
	 * 
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine(); // 1부터 N까지 입력할 변수 선언 
		int length = Integer.parseInt(N);	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// i부터 N까지 bw에 입력 
		for(int i=1; i<=length; i++) {
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}