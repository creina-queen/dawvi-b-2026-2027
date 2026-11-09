package llistes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeArrayALlista {

	public static void main(String[] args) {

		///////////////////////////////
		//   List<> o ArrayList<>?   //
		///////////////////////////////

		/*
		 * A l'esquerra posem List (QUÈ és: una llista).
		 * A la dreta posem ArrayList (COM està feta per dins).
		 * Si més endavant la volem canviar per una LinkedList, només canviem la part de la dreta.
		 *
		 * Entre <> va el tipus dels elements. Ha de ser una classe:
		 *   int     -> Integer
		 *   double  -> Double
		 *   char    -> Character
		 *   boolean -> Boolean
		 */
		List<Integer> notes = new ArrayList<>();
		// List<int> notes = new ArrayList<>();   // NO COMPILA: int no és una classe
		notes.add(7);   // Java converteix el 7 (int) en un Integer automàticament
		int primera = notes.get(0);   // i aquí fa al revés: de Integer a int
		System.out.println("Notes: " + notes + "  primera: " + primera + "\n");

		///////////////////////////////
		//   D'array a llista        //
		///////////////////////////////

		String[] fruites = {"Poma", "Plàtan", "Mango"};

		/*
		 * Arrays.asList: la llista queda ENGANXADA a l'array i té mida fixa.
		 * Es pot fer set, però no add ni remove.
		 */
		List<String> enganxada = Arrays.asList(fruites);
		enganxada.set(0, "Pera");
		System.out.println("Arrays.asList: " + enganxada + "  array: " + Arrays.toString(fruites));
		// enganxada.add("Kiwi");   // UnsupportedOperationException

		/*
		 * List.of: llista que no es pot modificar gens (ni add, ni remove, ni set).
		 * Va bé per a dades fixes.
		 */
		List<String> fixa = List.of("Poma", "Plàtan", "Mango");
		System.out.println("List.of: " + fixa);
		// fixa.add("Kiwi");   // UnsupportedOperationException

		/*
		 * La manera bona quan la volem fer créixer:
		 * new ArrayList<>(...) fa una CÒPIA que és una ArrayList normal.
		 */
		List<String> cistella = new ArrayList<>(List.of("Poma", "Plàtan", "Mango"));
		cistella.add("Kiwi");
		System.out.println("new ArrayList<>(List.of(...)): " + cistella);

		/*
		 * Collections.addAll: afegeix tots els elements d'un array a una llista que ja existeix.
		 */
		List<String> altra = new ArrayList<>();
		Collections.addAll(altra, fruites);
		System.out.println("Collections.addAll: " + altra + "\n");

		///////////////////////////////
		//   De llista a array       //
		///////////////////////////////

		/*
		 * toArray: li passem un array buit del tipus que volem.
		 */
		String[] tornada = cistella.toArray(new String[0]);
		System.out.println("toArray: " + Arrays.toString(tornada) + "  length = " + tornada.length);
	}

}
