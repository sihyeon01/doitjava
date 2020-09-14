package chapter08;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1; // static final->상수이기 때문에 한번 정해진 값을 변경할 수 x
	public static final int SUPERSONIC = 2; // 상수는 대문자로 표현

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly(); // 부모클래스의 fly() 메소드 실행
		}
	}

}