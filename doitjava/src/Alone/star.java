package Alone;

import java.util.Scanner;

public class star {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("정수를 입력하세요.");
		int line = sc.nextInt();
		
		for (int i = 0; i < line; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		sc.close();
		}
	
}
