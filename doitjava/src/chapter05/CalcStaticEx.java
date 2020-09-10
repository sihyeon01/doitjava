package chapter05;

public class CalcStaticEx {
	public static void main(String[] args) {
		CalcStatic calc = new CalcStatic();
		int res1 = CalcStatic.plus(10, 20);
		System.out.println(res1);
		CalcStatic calcs = new CalcStatic();
		int res2 = CalcStatic.plus(10, 20);
		System.out.println(res2);
		CalcStatic calc3 = new CalcStatic();
		int res3 = CalcStatic.plus(10, 20);
		System.out.println(res3);
		int res4 = calc.multiply(10, 20);

		CalcStatic calc2 = new CalcStatic();

		System.out.println(calc.num1);
		System.out.println(calc2.num1);

		calc.num1 = 20;
		calc2.num1 = 200;
		System.out.println(calc.num1);
		System.out.println(calc2.num1);

		System.out.println(calc.num2);
		System.out.println(calc2.num2);

		calc.num2 = 30;
		System.out.println(calc.num2);

		calc2.num2 = 300;
		System.out.println(calc2.num2);

		System.out.println(calc.num2);

	}
}
