package example;

import java.util.Scanner;

public class Exam21 {
	public static void main(String[] args) {
		final int GA = 0;
		final int BA = 1;
		final int BO = 2;
		
		int user, com;
		int score = 0;
		int life = 3;
		Scanner sc= new Scanner (System.in);
		
	
		while(true) {
		com = (int) (Math.random() * 3) ;
		
		System.out.println("���������� �����Դϴ�.");
		System.out.println("0:����, 1:����, 2:��");
		
		System.out.println(">");
		user = sc.nextInt();   //0,1,2 �̿��� �Է��� ���Է��� �� �ֵ��� �մϴ�.
		
		/* ����� ���*/
		System.out.println("��ǻ�� : " + (com == 0? "����" : (com == 1?"����" : "��")));
		System.out.println("���� : " + (user == 0? "����" : (user == 1?"����" : "��")));

		if ((com==GA && user == BA) || (com==BA && user == BO) || (com==BO && user == GA)) {
			System.out.println("user �¸�"); 
			score += 100;
		} else if (com == user) {
			System.out.println("���º�");
			
			score += 10;
			
		}	else {
			System.out.println(" com �¸�");
			life--;
		}
		
		}
	}

}

	
