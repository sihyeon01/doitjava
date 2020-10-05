package chapter14;

import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;

public class ArrayException {
	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[3] = 100;
			System.out.println("정상실행했습니다."); // 7번에서 오류가 발생했기 때문에 catch의 { } 실행
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {// catch는 필요한만큼 여러 개 사용 가능
//			e.printStackTrace();  <- 오류를 실행
			System.out.println(e.getMessage());
			System.out.println("배열의 범위를 벗어낫습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("파이널리는 무조건 실행하는 구간입니다.");
		}

	}
}
