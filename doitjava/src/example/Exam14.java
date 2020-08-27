package example;

import java.util.Scanner;

public class Exam14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line;
		do {
		System.out.println("몇 줄을 출력하시겠습니까?(홀수만 입력): ");
		line = sc.nextInt();
	}while (line % 2 == 0);
		int upLine = line / 2;
		int downLine = line - upLine;
		
		for(int i=0; i<upLine; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		for(int i=downLine-1; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		sc.close();
//		Scanner sc = new Scanner (System.in);
//		System.out.print("몇 줄을 출력할까요?: " );
//		int line = sc.nextInt();
//				
//		for (int i = 0; i < line; i++) {
//			for(int j = 0; j<=i; j++) {
//				System.out.print("$");
//			}
//			System.out.println();
//		}
//		for (int i =line-1; i >=0; i-- ) {
//			for(int j=0; j<i; j++) {
//				System.out.print("$");
//			}
//			System.out.println();
//				
//			}
//		sc.close();
		}
		
		}
// $
// $$
// $$$
// $$$$
// $$$
// $$
// $