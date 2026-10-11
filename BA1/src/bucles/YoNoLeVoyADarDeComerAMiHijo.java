package bucles;

import java.util.Scanner;

public class YoNoLeVoyADarDeComerAMiHijo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Per resoldre aquest problema ens hem de desar informació
		// La manera es desar-ho a un string que recorrerem amb un scanner especial
		int numFills = sc.nextInt();
		sc.nextLine();
		
		String memoriaFills = sc.nextLine();
		
		int edatMinima = sc.nextInt();
		int fillsQueNoMengen = 0;
		
		// Creem l'scanner a partir de la línia llegida
		Scanner fills = new Scanner(memoriaFills);
		
		// Com sabem quants fills hi ha a memòria fem un for
		for(int i=0; i<numFills; i++) {
			if(fills.nextInt()<edatMinima) {
				fillsQueNoMengen++;
			}
		}
		System.out.println(fillsQueNoMengen);
	}

}
