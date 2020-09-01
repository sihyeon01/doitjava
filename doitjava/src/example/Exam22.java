package example;

import java.util.Scanner;

public class Exam22 {

	public static void main(String[] args) {
		int com = (int)(Math.random() * 100) ;
		int user = 0;
		int count = 0;
		
		Scanner sc= new Scanner (System.in);
		
		while(true) {
			count++;
			System.out.println("1부터 100사이의 숫자를 입력하세요.");
			user = sc.nextInt();
		
		System.out.println("생성된 숫자는 무엇인가요?");
		
		if(user == com) {
			System.out.println("정답입니다.");
			System.out.printf("시도횟수는 %d번입니다.\n", count);
		}else if (user > com) {
			System.out.println("더 작은 수를 입력하세요.");
		}else if(user < com) {
			System.err.println("더 큰 수를 입력하세요.");
		}
		}
		
	}

}
