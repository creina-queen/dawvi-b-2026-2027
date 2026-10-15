package bucles;

import java.util.Scanner;

public class Ambulancia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int distancia = sc.nextInt();
		int sirena = sc.nextInt();
		
		int minuts = 0;
		int acumulador = 0;
		
		while(acumulador<distancia) {
			minuts++;
			if(minuts%sirena==0) {
				acumulador += minuts*2;
			} else {
				acumulador += minuts;
			}
		}
		
		System.out.println(minuts);

	}

}
