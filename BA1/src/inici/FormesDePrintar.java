package inici;

public class FormesDePrintar {

	public static void main(String[] args) {
		// Fins ara hem vist el syso normal, que afegeix un salt de línia
		System.out.println("hola");
		System.out.println("que tal");
		
		// També podem printar a la mateixa línia en expressions diferents
		System.out.print("hola");
		System.out.print("que tal");
		
		// Si ho fem així hem de tenir en compte els espais!!
		System.out.print("hola ");
		System.out.print("que tal");
		System.out.println(); // syso buit: només fa el salt de línia
		
		// CONCATENACIÓ amb +
		String nom = "Anna";
		int edat = 17;
		System.out.println("Em dic " + nom + " i tinc " + edat + " anys");

		// Compte! El + suma o concatena segons l'ordre
		System.out.println("Resultat: " + 2 + 3);   // Resultat: 23
		System.out.println("Resultat: " + (2 + 3)); // Resultat: 5
		System.out.println(2 + 3 + " és el resultat"); // 5 és el resultat

		// CARÀCTERS D'ESCAPAMENT
		System.out.println("Línia 1\nLínia 2");      // \n salt de línia
		System.out.println("Nom:\tAnna");            // \t tabulador
		System.out.println("Ha dit \"hola\"");       // \" cometes
		System.out.println("C:\\Usuaris\\anna");     // \\ contrabarra

		// PRINTF: text amb format (no fa salt de línia sol!)
		double preu = 3.14159;
		System.out.printf("Em dic %s i tinc %d anys%n", nom, edat);
		System.out.printf("Preu: %.2f €%n", preu);   // 2 decimals → 3,14
		System.out.printf("[%5d]%n", 42);            // amplada 5 → [   42]
		System.out.printf("[%-10s]%n", nom);         // alineat a l'esquerra

		// String.format: igual que printf però guarda el resultat
		String missatge = String.format("%s té %d anys", nom, edat);
		System.out.println(missatge);

		// BLOCS DE TEXT (Java 15+): text de diverses línies
		System.out.println("""
				+-------+
				| MENÚ  |
				+-------+
				1. Jugar
				2. Sortir
				""");

		// SORTIDA D'ERROR (surt en vermell a Eclipse)
		System.err.println("Això és un missatge d'error");

	}

}
