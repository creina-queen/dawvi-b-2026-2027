package matrius;

import java.util.Scanner;

public class MatriusFuncions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// PAS 1 · Una funció és un tros de codi amb nom que es pot cridar.
		// Ja n'heu fet servir: sc.nextInt(), Collections.sort(llista)...
		// Ara en fem una de nostra: mostrarVides (està a sota del main).
		mostrarVides("Mario", 3);
		mostrarVides("Luigi", 1);
		System.out.println();

		// PAS 2 · Una matriu és una taula de files i columnes.
		// Tauler d'un joc: cada casella té els punts que guanyes si hi passes.
		// 3 files i 4 columnes.
		int[][] tauler = {
				{ 10, 0, 5, 20 },
				{ 0, 15, 0, 5 },
				{ 30, 0, 10, 0 }
		};
		
		// OMPLIR MATRIU AMB SCANNER
		for(int i=0; i<tauler.length; i++) {
			for(int j=0; j<tauler[0].length; j++) {
				tauler[i][j] = sc.nextInt();
			}
		}

		// tauler[fila][columna]. Es compta des de 0.
		System.out.println("Casella [1][1]: " + tauler[1][1]); // 15
		System.out.println("Casella [2][0]: " + tauler[2][0]); // 30

		// Canviar una casella
		tauler[2][3] = 50;
		System.out.println("Ara la casella [2][3] val: " + tauler[2][3]);

		// Quantes files i quantes columnes?
		System.out.println("Files: " + tauler.length); // 3
		System.out.println("Columnes: " + tauler[0].length); // 4
		System.out.println();

		// System.out.println(tauler[3][0]); // ERROR: ArrayIndexOutOfBoundsException (la fila 3 no existeix)

		// PAS 3 · Recórrer = un for dins d'un altre for.
		// El de fora mou la fila, el de dins mou la columna.
		for (int f = 0; f < tauler.length; f++) {
			for (int c = 0; c < tauler[0].length; c++) {
				System.out.print(tauler[f][c] + " ");
			}
			System.out.println(); // salt de línia en acabar cada fila
		}
		System.out.println();

		// PAS 4 · Això ho farem moltes vegades: ho posem en una funció.
		printarMatriu(tauler);
		System.out.println();

		// La mateixa funció serveix per a una matriu de qualsevol mida
		int[][] taulerBuit = new int[2][5]; // tot a 0
		printarMatriu(taulerBuit);
	}

	// Funció void: fa una cosa i no retorna res.
	// Es declara FORA del main, però DINS de la classe.
	// Entre parèntesis, els paràmetres: les dades que necessita.
	private static void mostrarVides(String jugador, int vides) {
		System.out.println(jugador + " té " + vides + " vides");
	}

	// Mostra la matriu en forma de taula.
	// Fem servir mat.length i mat[0].length, mai 3 o 4 a mà.
	private static void printarMatriu(int[][] mat) {
		for (int f = 0; f < mat.length; f++) {
			System.out.print("| ");
			for (int c = 0; c < mat[0].length; c++) {
				System.out.printf("%4d", mat[f][c]); // %4d: cada número ocupa 4 espais
			}
			System.out.println(" |");
		}
	}
}
