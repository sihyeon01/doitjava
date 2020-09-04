
package example;

public class Arsterisk04 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if(4-i > j) {
					System.out.print(" ");
				}else {
				System.out.print("*");
			}
			} 
			for(int j = 0; j<i; j++) {		
			System.out.print("*");
		
			}
			System.out.println(); 
		}
	
	for(int i=4; i>=0; i--) {
		System.out.print(" ");
		for (int j=0; j<4; j++) {
			if(4-i > j) {
				System.out.print(" ");
			}else {
			System.out.print("*");
		}
		}
		for(int j = 0; j<i-1; j++){	
			System.out.print("*");
		
			}
		System.out.println();
	}
}
}
