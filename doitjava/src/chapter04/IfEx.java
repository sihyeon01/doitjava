package chapter04;

public class IfEx {

	public static void main(String[] args) {
		int score = 80;

		if (score >= 90) {
			System.out.println("������ 90���� ũ�ų� �����ϴ�.");
			System.out.println("����� A�Դϴ�.");
		} else { //else ������ if������ false�� ��� ����Ǵ� ����
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B�Դϴ�.");
		}
		
//		if (score < 90) 
//			System.out.println("������ 90���� �۽��ϴ�.");
//			System.out.println("����� B�Դϴ�.");
		
		System.out.println("������ ���Դϴ�.");
	}

}
