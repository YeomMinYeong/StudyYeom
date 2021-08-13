package y0813;

import java.util.Scanner;

public class star1 {

	public static void main(String[] args) {
/*
*
**
***
****
*****
*/	 
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();

		int a =5;
		for(int i=1; i<=a; i++) {
			//System.out.println(i);		
			for(int x=1; x<=i; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}