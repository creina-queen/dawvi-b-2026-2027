package bucles;

public class BucleFOR {

	public static void main(String[] args) {

		// =====================================================
		// 1. El FOR és un WHILE "compactat"
		// =====================================================
		// Els tres passos del while (inicialitzar, comprovar, canviar)
		// s'escriuen junts en una sola línia:
		//
		//      for ( inici ; condició ; canvi ) { ... }
		//            (1)       (2)       (3)
		//
		// Ordre d'execució:
		//   1 -> 2 -> cos -> 3 -> 2 -> cos -> 3 -> 2 ... fins que (2) és false
		//   (l'inici (1) només es fa UNA vegada, al principi)

		// Aquests dos bucles fan EXACTAMENT el mateix:
		int i = 0;                       // (1)
		while (i < 5) {                  // (2)
			System.out.print(i + " ");
			i++;                         // (3)
		}
		System.out.println();

		for (int j = 0; j < 5; j++) {    // (1) (2) (3) tot junt
			System.out.print(j + " ");
		}
		System.out.println();

		// Quin faig servir?
		//   for   -> quan SÉ quantes voltes farà (5 vegades, de l'1 al 10...)
		//   while -> quan NO ho sé (fins que l'usuari encerti, fins que escrigui 0...)


		// =====================================================
		// 2. On comença i on acaba?
		// =====================================================

		// Del 0 al 9 (10 voltes)
		for (int k = 0; k < 10; k++) {
			System.out.print(k + " ");
		}
		System.out.println();

		// ULL!! Si volem de l'1 al 10, canvia l'inici I la condició (< passa a <=)
		for (int k = 1; k <= 10; k++) {
			System.out.print(k + " ");
		}
		System.out.println();

		// Cap enrere: del 5 al 0 (k-- és el mateix que k = k - 1)
		for (int k = 5; k >= 0; k--) {
			System.out.print(k + " ");
		}
		System.out.println();

		// De 2 en 2: del 0 al 10 (k += 2 és el mateix que k = k + 2)
		for (int k = 0; k <= 10; k += 2) {
			System.out.print(k + " ");
		}
		System.out.println();


		// =====================================================
		// 3. FOR + IF: el que ja sabeu, dins d'un bucle
		// =====================================================
		// Números parells de l'1 al 20.
		// Recordeu: % és el residu de la divisió. Si k % 2 == 0, k és parell.

		for (int k = 1; k <= 20; k++) {
			if (k % 2 == 0) {
				System.out.print(k + " ");
			}
		}
		System.out.println();


		// =====================================================
		// 4. Errors típics (comproveu-los si el programa fa coses rares)
		// =====================================================
		//
		// a) Punt i coma després del for -> el bucle no fa res
		//      for (int k = 0; k < 5; k++);      <-- aquest ; sobra!
		//      {
		//          System.out.println("Hola");   // només s'escriu 1 vegada
		//      }
		//
		// b) La variable del for només existeix DINS del for
		//      for (int k = 0; k < 5; k++) { ... }
		//      System.out.println(k);            // ERROR: k no existeix aquí
		//
		// c) La condició mai és certa -> 0 voltes
		//      for (int k = 0; k > 10; k++)      // 0 > 10 és false des del principi
		//
		// d) La variable va en sentit contrari -> bucle infinit
		//      for (int k = 0; k < 10; k--)      // k val 0, -1, -2... mai arriba a 10
	}

}