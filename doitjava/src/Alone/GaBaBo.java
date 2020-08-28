package example;

 

import java.util.Scanner;

 

public class GaBaBo {

 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for(int i =0; i<3; i++) {

			int com = (int)(Math.random()*10) % 3 + 1;

		int input;

		while(true) {

			System.out.println("입력[1:가위, 2:바위,3:보]>>");

			input = sc.nextInt();

			if(input>=1&&input<=3) break;

			System.out.println("가위,바위,보 중 하나만 선택해주세요.");

		}

		System.out.println();

		if(com==1) System.out.println("컴퓨터 : 가위");

		else if(com==2) System.out.println("컴퓨터 : 바위");

		else System.out.println("컴퓨터 : 보");

		

		if(input==1) System.out.println("사람 : 가위");

		else if(input==2) System.out.println("사람 : 바위");

		else System.out.println("사람 : 보");

		System.out.println("<<결과>>");

		if(com==input) {

			System.out.println("비김");

		}else if(com==1&&input==2 || com==2&&input==3 || com==3&&input==1) {

			System.out.println("사람 win");

		}else {

			System.out.println("컴퓨터 win");

		}

		System.out.println("====================");
		}
	}
}
		