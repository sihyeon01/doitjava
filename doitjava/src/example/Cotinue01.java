package example;

public class Cotinue01 {
public static void main(String[] args) {
	for(int i=0; i<10; i++) {
		if(i%2 != 1) {
//			System.out.print("나머지가 없음: ");
//			break;
			continue;
		}
			System.out.println(i);
		
	}
}
}
