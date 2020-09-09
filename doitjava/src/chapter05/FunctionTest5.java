package chapter05;

public class FunctionTest5 {
	public static void main(String[] args) {
		Obj obj = new Obj();
		int res = obj.add(1, 2);
		System.out.println(res);
	}
}

class Obj {
	int c = 10;  //위치 상관없이 섞여 있어도 대입 받을 수 있다. (객체지향 언어의 장점)

	int add(int a, int b) {
		return a + b + c;
	}
}