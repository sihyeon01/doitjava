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
		
		System.out.println("가위바위보 게임입니다.");
		System.out.println("0:가위, 1:바위, 2:보");
		
		System.out.println(">");
		user = sc.nextInt();   //0,1,2 이외의 입력을 재입력할 수 있도록 합니다.
		
		/* 결과값 출력*/
		System.out.println("컴퓨터 : " + (com == 0? "가위" : (com == 1?"바위" : "보")));
		System.out.println("유저 : " + (user == 0? "가위" : (user == 1?"바위" : "보")));

		if ((com==GA && user == BA) || (com==BA && user == BO) || (com==BO && user == GA)) {
			System.out.println("user 승리"); 
			score += 100;
		} else if (com == user) {
			System.out.println("무승부");
			
			score += 10;
			
		}	else {
			System.out.println(" com 승리");
			life--;
		}
		
		}
	}

}

	

