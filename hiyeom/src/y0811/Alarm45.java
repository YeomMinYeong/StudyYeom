package y0811;

import java.util.Scanner;

public class Alarm45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = 10;
		int M = 10;
		//0 ≤ H ≤ 23, 0 ≤ M ≤ 59

		if(M>=45) 
			M-=45;
		else {
			if(H==0)
				H=24;
				H--;
				M= 60-(45-M);
		}
		System.out.println(H+"시"+M+"분");
		sc.close();
	}

}