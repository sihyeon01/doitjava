package example;

 

import java.util.Scanner;

 

public class GaBaBo {

 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for(int i =0; i<3; i++) {

			int com = (int)(Math.random()*10) % 3 + 1;

		int input;

		while(true) {

			System.out.println("�Է�[1:����, 2:����,3:��]>>");

			input = sc.nextInt();

			if(input>=1&&input<=3) break;

			System.out.println("����,����,�� �� �ϳ��� �������ּ���.");

		}

		System.out.println();

		if(com==1) System.out.println("��ǻ�� : ����");

		else if(com==2) System.out.println("��ǻ�� : ����");

		else System.out.println("��ǻ�� : ��");

		

		if(input==1) System.out.println("��� : ����");

		else if(input==2) System.out.println("��� : ����");

		else System.out.println("��� : ��");

		System.out.println("<<���>>");

		if(com==input) {

			System.out.println("���");

		}else if(com==1&&input==2 || com==2&&input==3 || com==3&&input==1) {

			System.out.println("��� win");

		}else {

			System.out.println("��ǻ�� win");

		}

		System.out.println("====================");
		}
	}
}
		