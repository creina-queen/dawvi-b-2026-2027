package llistes;

import java.util.ArrayList;
import java.util.List;

public class RecorrerIBuscar {

	public static void main(String[] args) {
		List<String> alumnes = new ArrayList<>(List.of("Anna", "Biel", "Carla", "Biel", "Dani"));

		///////////////////////////////
		//   for amb i               //
		///////////////////////////////

		/*
		 * Com amb els arrays, però:
		 *   array.length   -> llista.size()
		 *   array[i]       -> llista.get(i)
		 * Fem servir aquest for quan necessitem la posició.
		 */
		for (int i = 0; i < alumnes.size(); i++) {
			System.out.println(i + ": " + alumnes.get(i));
		}

		///////////////////////////////
		//   for-each                //
		///////////////////////////////

		/*
		 * Quan només hem de llegir tots els elements.
		 */
		int lletres = 0;
		for (String nom : alumnes) {
			lletres = lletres + nom.length();
		}
		System.out.println("\nTotal de lletres: " + lletres);

		/*
		 * També es pot printar directament: crida el toString de la llista.
		 */
		System.out.println("La llista sencera: " + alumnes + "\n");

		///////////////////////////////
		//   Buscar                  //
		///////////////////////////////

		/*
		 * contains: hi és o no? (true / false)
		 * indexOf: posició de la PRIMERA vegada que hi és, o -1 si no hi és.
		 * lastIndexOf: posició de l'ÚLTIMA vegada que hi és, o -1.
		 * Comparen amb equals, no amb ==.
		 */
		System.out.println("Hi ha la Carla? " + alumnes.contains("Carla"));
		System.out.println("indexOf(\"Biel\"): " + alumnes.indexOf("Biel"));
		System.out.println("lastIndexOf(\"Biel\"): " + alumnes.lastIndexOf("Biel"));
		System.out.println("indexOf(\"Ernest\"): " + alumnes.indexOf("Ernest"));

		/*
		 * Patró típic: buscar i, si hi és, fer-hi alguna cosa.
		 */
		int pos = alumnes.indexOf("Dani");
		if (pos != -1) {
			alumnes.set(pos, "Daniel");
		}
		System.out.println("Després de canviar el Dani: " + alumnes);

		/*
		 * subList(desde, fins): de la posició desde (inclosa) fins a la posició fins (NO inclosa).
		 */
		System.out.println("subList(1, 3): " + alumnes.subList(1, 3));
	}

}
