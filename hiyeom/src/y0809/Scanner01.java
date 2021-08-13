package y0809;
	import java.util.Scanner;

	public class Scanner01 {

		public static void main(String[] args) {

			// 472 X 385 식 단계별 배열 추출 

						Scanner sc = new Scanner(System.in);
						int a = sc.nextInt();
						int b = sc.nextInt();
						System.out.println(a*(b%10));
						System.out.println(a*(b%100/10));
						System.out.println(a*(b/100));		
						System.out.println(a*b);
						/*
						System.out.println(472*(385%10));
						System.out.println(472*(385%100/10));
						System.out.println(472*(385/100));		
						System.out.println(472*385);
						*/
				}
			}