package arrays;

import java.util.Scanner;

public class Rally_Dakar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		sc.nextLine();
		
		for (int i = 0; i < casos; i++) {
			String[] rally = sc.nextLine().split(" ");
			
			int[] vels = new int[rally.length];
			
			int total = 0;
			
			for (int j = 0; j < rally.length; j++) {
				vels[j] = Integer.parseInt(rally[j]);
			}
			
			int velMax = vels[0];
			
			for (int j = 1; j < vels.length; j++) {
				if (vels[j] == 1) {
					total += velMax;
				}
				if (vels[j] == 2) {
					total += (velMax /2);
				}
				if (vels[j] == 3) {
					total += (velMax / 4);
				}
			}
			int resultado = total / (vels.length - 1);
			System.out.println(resultado);
		}
	}

}
