package matrius;

public class MatriusSumes {

	public static void main(String[] args) {
		// Punts de 3 jugadors (files) en 4 nivells (columnes).
		// Fila 0 = Mario, fila 1 = Luigi, fila 2 = Peach.
		String[] jugadors = { "Mario", "Luigi", "Peach" };

		int[][] dissabte = {
				{ 10, 20, 5, 15 },
				{ 0, 30, 10, 5 },
				{ 25, 0, 15, 20 }
		};
		int[][] diumenge = {
				{ 5, 10, 0, 20 },
				{ 15, 0, 5, 10 },
				{ 10, 20, 5, 0 }
		};

		// PAS 1 · Sumar dues matrius = sumar casella a casella.
		// Han de tenir la mateixa mida. Aquí SÍ que cal recórrer-les senceres.
		int[][] total = sumarMatrius(dissabte, diumenge);
		System.out.println("Punts del cap de setmana:");
		printarMatriu(total);
		System.out.println();

		// PAS 2 · Sumar UNA fila: la fila queda fixa, només es mou la columna.
		// Un sol for. No cal tocar les altres files.
		int fila = 1; // Luigi
		System.out.println("Total de " + jugadors[fila] + ": " + sumarFila(total, fila)); // 75

		// PAS 3 · Sumar UNA columna: la columna queda fixa, només es mou la fila.
		// Un sol for. No cal tocar les altres columnes.
		int col = 2; // nivell 2
		System.out.println("Total del nivell " + col + ": " + sumarColumna(total, col)); // 40
		System.out.println();

		// PAS 4 · Totes les files: un for que crida sumarFila per a cada fila.
		System.out.println("Total de cada jugador:");
		for (int f = 0; f < total.length; f++) {
			System.out.println(jugadors[f] + ": " + sumarFila(total, f));
		}
		System.out.println();

		// PAS 5 · Totes les columnes: un for que crida sumarColumna per a cada columna.
		System.out.println("Total de cada nivell:");
		for (int c = 0; c < total[0].length; c++) {
			System.out.println("Nivell " + c + ": " + sumarColumna(total, c));
		}
	}

	// Retorna una matriu nova: cada casella és la suma de les dues.
	public static int[][] sumarMatrius(int[][] a, int[][] b) {
		int[][] res = new int[a.length][a[0].length];
		for (int f = 0; f < a.length; f++) {
			for (int c = 0; c < a[0].length; c++) {
				res[f][c] = a[f][c] + b[f][c];
			}
		}
		return res;
	}

	// Suma només la fila que li diem. f no canvia: només recorrem les columnes.
	public static int sumarFila(int[][] mat, int f) {
		int suma = 0;
		for (int c = 0; c < mat[0].length; c++) {
			suma = suma + mat[f][c];
		}
		return suma;
	}

	// Suma només la columna que li diem. c no canvia: només recorrem les files.
	// Ara el límit és mat.length (quantes files hi ha).
	public static int sumarColumna(int[][] mat, int c) {
		int suma = 0;
		for (int f = 0; f < mat.length; f++) {
			suma = suma + mat[f][c];
		}
		return suma;
	}

	public static void printarMatriu(int[][] mat) {
		for (int f = 0; f < mat.length; f++) {
			System.out.print("| ");
			for (int c = 0; c < mat[0].length; c++) {
				System.out.printf("%4d", mat[f][c]);
			}
			System.out.println(" |");
		}
	}
}
