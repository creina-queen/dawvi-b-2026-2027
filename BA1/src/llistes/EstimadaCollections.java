package llistes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstimadaCollections {

	public static void main(String[] args) {
		/*
		 * Collections (amb s final) és una classe amb eines per a llistes,
		 * com Arrays (també amb s) ho és per als arrays.
		 * Cal import java.util.Collections;
		 * Recordatori: Collections.sort, reverse, shuffle i swap MODIFIQUEN la llista.
		 */
		List<Integer> punts = new ArrayList<>(List.of(40, 15, 90, 15, 60));
		System.out.println("Llista original: " + punts + "\n");

		///////////////////////
		//      .sort()      //
		///////////////////////

		/*
		 * Ordena de petit a gran (números) o alfabèticament (Strings).
		 * Fa el mateix que punts.sort(null);
		 */
		Collections.sort(punts);
		System.out.println("sort: " + punts);

		/*
		 * De gran a petit, amb Collections.reverseOrder()
		 * (fa el mateix que punts.sort(Comparator.reverseOrder());)
		 */
		Collections.sort(punts, Collections.reverseOrder());
		System.out.println("sort al revés: " + punts + "\n");

		///////////////////////
		//    .reverse()     //
		///////////////////////

		/*
		 * Gira la llista: el primer passa a ser l'últim. NO ordena.
		 */
		List<String> cua = new ArrayList<>(List.of("Anna", "Biel", "Carla", "Dani"));
		Collections.reverse(cua);
		System.out.println("reverse: " + cua + "\n");

		///////////////////////
		//    .shuffle()     //
		///////////////////////

		/*
		 * Barreja la llista a l'atzar (cada execució dona un ordre diferent).
		 */
		List<Integer> cartes = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
		Collections.shuffle(cartes);
		System.out.println("shuffle: " + cartes + "\n");

		///////////////////////
		//    .swap()        //
		///////////////////////

		/*
		 * Intercanvia dues posicions. Sense variable auxiliar!
		 */
		Collections.swap(cua, 0, 3);
		System.out.println("swap(0, 3): " + cua + "\n");

		///////////////////////
		//  .max() .min()    //
		///////////////////////

		/*
		 * El més gran i el més petit, sense recórrer la llista a mà.
		 * Amb Strings: el primer i l'últim alfabèticament.
		 * Si la llista està buida -> NoSuchElementException.
		 */
		System.out.println("max: " + Collections.max(punts) + "  min: " + Collections.min(punts));
		System.out.println("max de " + cua + ": " + Collections.max(cua) + "\n");

		///////////////////////
		//  .frequency()     //
		///////////////////////

		/*
		 * Quantes vegades hi és un valor.
		 */
		System.out.println("Quants 15 hi ha? " + Collections.frequency(punts, 15) + "\n");

		///////////////////////
		//  .nCopies()       //
		///////////////////////

		/*
		 * Una llista amb el mateix valor repetit n vegades.
		 * La llista que retorna no es pot modificar: la copiem a una ArrayList.
		 */
		List<Integer> zeros = new ArrayList<>(Collections.nCopies(5, 0));
		zeros.set(2, 7);
		System.out.println("nCopies(5, 0) i set(2, 7): " + zeros + "\n");

		///////////////////////
		//  .fill()          //
		///////////////////////

		/*
		 * Posa el mateix valor a TOTES les posicions que ja hi ha (no n'afegeix).
		 */
		Collections.fill(zeros, 1);
		System.out.println("fill(1): " + zeros + "\n");

		///////////////////////
		//  .addAll()        //
		///////////////////////

		/*
		 * Afegeix diversos valors d'una tirada.
		 */
		Collections.addAll(cua, "Eva", "Ferran");
		System.out.println("addAll: " + cua + "\n");

		///////////////////////
		//  .binarySearch()  //
		///////////////////////

		/*
		 * Busca un valor en una llista ORDENADA (si no ho està, el resultat no té sentit).
		 * Retorna la posició, o un número negatiu si no hi és.
		 */
		Collections.sort(punts);
		System.out.println("Ordenada: " + punts + "  binarySearch(60): " + Collections.binarySearch(punts, 60) + "\n");

		///////////////////////
		//  .rotate()        //
		///////////////////////

		/*
		 * Mou tots els elements n posicions cap a la dreta; els de l'última posició tornen pel principi.
		 * Va bé per a torns: qui era primer passa a ser últim amb rotate(llista, -1).
		 */
		List<String> torns = new ArrayList<>(List.of("Anna", "Biel", "Carla", "Dani"));
		Collections.rotate(torns, -1);
		System.out.println("rotate(-1): " + torns + "\n");

		///////////////////////
		//  .disjoint()      //
		///////////////////////

		/*
		 * true si les dues llistes NO tenen cap element en comú.
		 */
		List<String> grupA = List.of("Anna", "Biel");
		List<String> grupB = List.of("Carla", "Dani");
		System.out.println("Cap alumne repetit entre grups? " + Collections.disjoint(grupA, grupB));
	}

}
