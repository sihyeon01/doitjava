package example;

import java.util.Scanner;

public class Exam13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("�� ���� ����ұ��?: " );
		int line = sc.nextInt();
				
		for (int i = 0; i < line; i++) {
			for(int j = 0; j<=i; j++) {
				if(j == i) {
					System.out.print("@");
				}else {
					System.out.print("$");
					
				}
			}
			System.out.println();

		}
		sc.close();
//		for(int i=9; i>=10; i--) {
//			System.out.println(i);
//		}
		}
}

//	@
//	$@
//	$$@
//	$$$@
//	$$$$@