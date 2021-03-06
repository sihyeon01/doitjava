package chapter05;

public class Student {
	/*필드 - 멤버 변수*/
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/* 생성자 - 객체를 생성할 때 실행하는 블록*/
	Student(int num1, long num2) {  //이름은 같아도 매개변수 타입은 다르게 사용
		System.out.println("Student 객체를 생성합니다.");
	} 
	Student(int num1, int num2) {
		System.out.println("Student 객체를 생성합니다.");
	}
	Student(long num5, int num6) {
		System.out.println("Student 객체를 생성합니다.");
	}
	Student(int num) { 
		System.out.println("Student 객체를 생성합니다." + num);
	}
	Student(long num) { 
		System.out.println("Student 객체를 생성합니다." + num);
	} 
	Student() { //매개변수가 없는 생성자
		System.out.println("디폴트 생성자로 Student 객체를 생성합니다.");
	}
	
	
//디폴트 생성자는 매개변수가 없고 실행 코드가 없는 생서자
//	Student(){} //디폴트 생성자 : 생성자를 명시하지 않으면 자동으로 생성
	
	
	
	/* 메소드 (메서드) - 멤버 함수 */
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
		
	}
}

