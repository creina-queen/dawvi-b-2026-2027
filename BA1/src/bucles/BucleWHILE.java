package bucles;

import java.util.Scanner;

public class BucleWHILE {

	public static void main(String[] args) {

		// =====================================================
		// 1. WHILE: "un IF que es repeteix"
		// =====================================================
		// Amb un IF, si la condició és certa, el codi s'executa UNA vegada.
		// Amb un WHILE, MENTRE la condició sigui certa, el codi es va repetint.
		//
		//   if (condició)    { ... }  -> s'executa 0 o 1 vegades
		//   while (condició) { ... }  -> s'executa 0, 1 o moltes vegades
		//
		// Cada repetició s'anomena VOLTA (o iteració).

		int i = 0;                      // 1) Inicialitzem la variable

		while (i < 5) {                 // 2) Comprovem la condició
			System.out.println(i);
			i++;                        // 3) Canviem la variable (i++ és el mateix que i = i + 1)
		}
		System.out.println("Hem sortit del bucle. Ara i val " + i);

		// Taula de seguiment (feu-la a mà a la llibreta!):
		//
		//   i | i<5 ? | què passa
		//  ---+-------+---------------------------
		//   0 | true  | escriu 0, i passa a valer 1
		//   1 | true  | escriu 1, i passa a valer 2
		//   2 | true  | escriu 2, i passa a valer 3
		//   3 | true  | escriu 3, i passa a valer 4
		//   4 | true  | escriu 4, i passa a valer 5
		//   5 | false | SURT del bucle

		// ULL AMB ELS BUCLES INFINITS!!!
		// Si oblidem el pas 3 (i++), la i val sempre 0, la condició i<5
		// sempre és certa i el programa NO S'ATURA MAI.
		// (Per aturar-lo a Eclipse: botó vermell quadrat de la consola)
		//
		//   int k = 0;
		//   while (k < 5) {
		//       System.out.println(k);   // escriu 0 0 0 0 0 0 0 ... per sempre
		//   }
		//
		// REGLA: dins del bucle, alguna cosa ha de fer canviar la condició.


		// =====================================================
		// 2. WHILE vs DO-WHILE
		// =====================================================
		// while    -> PRIMER pregunta, DESPRÉS fa.   Pot fer 0 voltes.
		// do-while -> PRIMER fa, DESPRÉS pregunta.   Fa com a mínim 1 volta.
		//
		// Ho veiem amb una condició que ja és FALSA des del principi (10 < 5 és false):

		int n = 10;

		while (n < 5) {
			System.out.println("while: aquesta línia NO s'escriu mai");
		}

		do {
			System.out.println("do-while: aquesta línia s'escriu UNA vegada");
		} while (n < 5);    // <-- ULL! El do-while acaba amb punt i coma


		// =====================================================
		// 3. Per a què serveix el do-while? Un exemple real
		// =====================================================
		// Quan necessitem fer l'acció ALMENYS UNA VEGADA abans de poder
		// comprovar res. Cas típic: demanar una dada fins que sigui correcta.
		// Primer l'hem de demanar per poder saber si és vàlida!

		Scanner sc = new Scanner(System.in);
		int edat;

		do {
			System.out.print("Introdueix la teva edat (0-120): ");
			edat = sc.nextInt();

			if (edat < 0 || edat > 120) {           // Un IF dins del bucle
				System.out.println("Edat incorrecta, torna-ho a provar.");
			}
		} while (edat < 0 || edat > 120);       // Es repeteix MENTRE sigui incorrecta

		System.out.println("Perfecte! Tens " + edat + " anys.");
		sc.close();
	}

}