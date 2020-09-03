package chapter07;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int sum1 = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum1 += arr1[i];

		}
		System.out.println(sum1);

		int[] arr2 = new int[5];
		int sum2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println();
		int[] arr3 = new int[] { 1, 2, 3, 4, 5 };		//{ } 사이에 값을 넣을 때는 [ ] 입력하지 않는다.
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
//		arr1= {1,2,3,4,5}		기존에 한 번 0으로 초기화 시킨 것은 다시 입력이 안 된다.
		
		arr1 = new int [] {1,2,3,4,5}; // new로 새로 만들 게 되면 적용 가능 → 프로그램 중에서 자바만 가능함.
	}
}
