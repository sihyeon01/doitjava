package chapter04;

public class IfEx2 {

	public static void main(String[] args) {
		int score = 75;

		if (score >= 90) {
			System.out.println("������ 90���� ũ�ų� �����ϴ�.");
			System.out.println("����� A�Դϴ�.");
		} else if(score >= 80){ //else ������ if������ false�� ��� ����Ǵ� ����
			System.out.println("������ 80���� ũ�ų� �۽��ϴ�.");
			System.out.println("����� B�Դϴ�.");
		} else if(score >= 70){ //else ������ if������ false�� ��� ����Ǵ� ����
			if(score >= 75) {
				System.out.println("������ 75���� ũ�ų� �����ϴ�.");
				System.out.println("����� C+�Դϴ�.");
			}else {
				System.out.println("������ 70���� ũ�ų� �����ϴ�.");
				System.out.println("����� C�Դϴ�.");
			}
		
		}	else {
			System.out.println("����� F�Դϴ�.");
		}
		
//		if (score < 90) 
//			System.out.println("������ 90���� �۽��ϴ�.");
//			System.out.println("����� B�Դϴ�.");
		
		System.out.println("������ ���Դϴ�.");
	}

}
