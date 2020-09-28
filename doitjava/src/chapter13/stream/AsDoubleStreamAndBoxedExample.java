package chapter13.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };

		IntStream intStream = Arrays.stream(intArray);  //Arrays.stream을 IntStream.of 로 변경하여 사용 가능
		intStream.asDoubleStream()
		.forEach(d -> System.out.println(d));
		System.out.println();

		intStream = Arrays.stream(intArray);
		intStream.boxed()
		.forEach(obj -> System.out.println(obj.intValue()));  //boxed이 있어야 .intValue() 사용 , 자동으로 입력되기 때문에 생략가능
	}
}
