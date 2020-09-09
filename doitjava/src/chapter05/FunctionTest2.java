package chapter05;

import java.util.Scanner;

public class FunctionTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student kim = new Student();
		Student seo = new Student();

		System.out.println(kim == seo);

		/* method 호출 */
		kim.showStudentInfo();  //객체는 초기값이 null이고, int는 0이고, boolean은 false이다.

		/* 객체의 멤버는 도트연산자(.)를 이용하여 접근할 수 있습니다. */
		kim.studentID = 2020010001;
		kim.studentName = "김유신";
		kim.grade = 3;
		kim.address = "경주";
		kim.showStudentInfo();

		seo.studentID = 202001002;
		seo.studentName = "서유진";
		seo.grade = 1;
		seo.address = "서울";
		seo.showStudentInfo();
		
		Student jo = new Student();
		jo.studentID = 202010003;
	}
}
