package chapter05;

public class Student {
	/*�ʵ� - ��� ����*/
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/* ������ - ��ü�� ������ �� �����ϴ� ���*/
	Student(int num1, long num2) {  //�̸��� ���Ƶ� �Ű����� Ÿ���� �ٸ��� ���
		System.out.println("Student ��ü�� �����մϴ�.");
	} 
	Student(int num1, int num2) {
		System.out.println("Student ��ü�� �����մϴ�.");
	}
	Student(long num5, int num6) {
		System.out.println("Student ��ü�� �����մϴ�.");
	}
	Student(int num) { 
		System.out.println("Student ��ü�� �����մϴ�." + num);
	}
	Student(long num) { 
		System.out.println("Student ��ü�� �����մϴ�." + num);
	} 
	Student() { //�Ű������� ���� ������
		System.out.println("����Ʈ �����ڷ� Student ��ü�� �����մϴ�.");
	}
	
	
//����Ʈ �����ڴ� �Ű������� ���� ���� �ڵ尡 ���� ������
//	Student(){} //����Ʈ ������ : �����ڸ� ������� ������ �ڵ����� ����
	
	
	
	/* �޼ҵ� (�޼���) - ��� �Լ� */
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
		
	}
}

