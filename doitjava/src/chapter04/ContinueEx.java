package chapter04;

public class ContinueEx {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("hello!" + i);
		if(i == 1) { 
			 continue;
		}
		System.out.println("출력..");
		System.out.println();
		}
		int cnt = 0;
		while(true) {
			System.out.println("while" + cnt++);
			if(cnt == 1) {
				continue;
			}
			System.out.println("출력..");
			if (cnt == 10) {
				break;
			}
		}
	}

}
