package chapter14;

import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;

public class ArrayException {
	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[3] = 100;
			System.out.println("��������߽��ϴ�."); // 7������ ������ �߻��߱� ������ catch�� { } ����
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {// catch�� �ʿ��Ѹ�ŭ ���� �� ��� ����
//			e.printStackTrace();  <- ������ ����
			System.out.println(e.getMessage());
			System.out.println("�迭�� ������ ������ϴ�.");
			e.printStackTrace();
		} finally {
			System.out.println("���̳θ��� ������ �����ϴ� �����Դϴ�.");
		}

	}
}
