package example;

import java.util.Scanner;

/*
 * ���� ���� ���� ������ �Է� �޾Ƽ� 
 * ����� ����� �� 
 * 100 ~ 91 A���
 * 90 ~ 81 B���
 * 80 ~ 71 C���
 * �������� F���
 * 
 * ��� ������ ����� ����ϼ���.
 */


public class Score {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int kor =0, eng=0, mat =0;
		System.out.println("���� ���� �Է�: ");
		kor = sc.nextInt();
		System.out.println("���� ���� �Է�: ");
		eng = sc.nextInt();
		System.out.println("���� ���� �Է�: ");
		mat = sc.nextInt();
		char grade;
		
		int sum = kor+eng+mat;
		double avg = sum/ 3.0;
		
//		if (avg >= 90) {
//			System.out.println("A��� �Դϴ�.");
//		}else if (avg >=80) {
//			System.out.println("B��� �Դϴ�.");
//		}else if (avg >= 70) {
//			System.out.println("C��� �Դϴ�.");
//		} else {
//			System.out.println("F��� �Դϴ�.");
//		}
		switch((int)avg / 10 ) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			default:
				grade = 'F';
				
		}
		System.out.println("����� ��� ������ " + avg + "���̰� " + grade + 
				"����Դϴ�.");
	}

}
