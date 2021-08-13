package y0808;

import java.util.Scanner;

public class testScore {

	public static void main(String[] args) {
/*	0810 시험 성적 구분 
 	90 ~ 100점은 A
	80 ~ 89점은 B
	70 ~ 79점은 C
	60 ~ 69점은 D
	나머지 점수는 F
*/

		int x;
		String y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();

		if(x >= 90)
            y = "A";
        else if(x >= 80)
            y = "B";
        else if(x >= 70)
            y = "C";
        else if(x >= 60)
            y = "D";
        else
            y = "F";
		System.out.println(y);
	}
}