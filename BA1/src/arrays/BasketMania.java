package arrays;

import java.util.Scanner;

public class BasketMania {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			int casosB = sc.nextInt();
			
			int Vis = 0;
			int Loc = 0;
			
			sc.nextLine();
			
			for (int j = 0; j < casosB; j++) {
				String VL = sc.nextLine();
				String[] arrayS = VL.split(" ");
				
				if (arrayS[0].equals("V")) {
					Vis += Integer.parseInt(arrayS[1]);
				} else if (arrayS[0].equals("L")) {
					Loc += Integer.parseInt(arrayS[1]);
				}
			}
			
			if (Vis > Loc) {
				System.out.println("V " + Loc + " " + Vis);
			} else if (Loc > Vis) {
				System.out.println("L " + Loc + " " + Vis);
			} else {
				System.out.println("E " + Loc + " " + Vis);
			}
				
		}

	}

}
