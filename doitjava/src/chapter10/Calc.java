package chapter10;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999_999_999;

	int add(int num1, int num2);

	int substract(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int nim2);
//	void show();

	default void desscription() {
		System.out.println("정수 계산기를 구현합니다");
	}
}
