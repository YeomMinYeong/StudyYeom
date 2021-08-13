package y0813;

public class star2 {

	public static void main(String[] args) {
/*
    *
   **
  ***
 ****
*****
 */

	int n=5; // n은 5이다 
	for(int a=1; a<=n; a++) { // a은 1이면서 5보다 작거나 같고 증가
		for(int i=n; i>0; i--) { // i는 1~5로 점차 감소
			if(i>a) { // i가 a보다 클 때는 공백 1칸을  
				System.out.print(" ");
			}else {		// i가 a보다 작을 때는 * 1개를 추가
				System.out.print("*");
			}

		}System.out.println();
	}
	}
} 