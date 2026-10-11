package bucles;

import java.util.Scanner;

public class TresPerCinc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int repeticions = sc.nextInt();
		
		// Aquí com sabem les repeticions val la pena FOR
		for(int i=0; i<repeticions; i++) {
			System.out.print(num);
		}

	}

}
