package chapter05;

public class FunctionTest5 {
	public static void main(String[] args) {
		Obj obj = new Obj();
		int res = obj.add(1, 2);
		System.out.println(res);
	}
}

class Obj {
	int c = 10;  //��ġ ������� ���� �־ ���� ���� �� �ִ�. (��ü���� ����� ����)

	int add(int a, int b) {
		return a + b + c;
	}
}