package chapter04;

public class ForEx {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		
		int i =0;
		int res = 0;
		for (i = 1; i < 11; i++) {
			res += i;
		}
		System.out.println(res);
		
	}

	/*
	 * �������� ���� ���� �����Դϴ�.
	 * i++ -> i += 1 -> i = i +1
	 */
}
