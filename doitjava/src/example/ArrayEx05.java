package example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx05 {
	public static void main(String[] args) {
		// 실행시마다 값이 달라지는 랜덤함수(1~45)를 사용하여
		// 6개의 요소를 가진 배열을 만든 후 출력
		int[] arr = new int[6];
		int game = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("로또생성기입니다. 몇 게임을 생성하시겠습니까?: ");
		game = sc.nextInt();
		for (int z = 0; z < game; z++) {
			System.out.println(z+1 +"회차: ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						i--;
						break;
					}
				}
			}

			Arrays.sort(arr); // 오름차순으로 정렬

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}