package llistes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EstimadaLinkedList {

	public static void main(String[] args) {

		/*
		 * ArrayList guarda els elements en un array per dins: tots seguits.
		 *   - get(i) és immediat.
		 *   - add(0, x) o remove(0) han de moure tots els altres elements (com vam fer a mà amb els arrays).
		 *
		 * LinkedList guarda cada element en un "node" que sap quin és l'anterior i quin el següent.
		 *   - Afegir o treure pel principi o pel final és immediat: només es canvien enllaços.
		 *   - get(i) ha d'anar saltant de node en node des d'una punta.
		 *
		 * Totes dues són List: add, get, set, remove, size, contains... funcionen igual.
		 */
		List<String> llista = new LinkedList<>(List.of("Biel", "Carla"));
		llista.add("Dani");
		llista.add(0, "Anna");
		System.out.println("Com qualsevol List: " + llista + "  get(2) = " + llista.get(2) + "\n");

		///////////////////////////////
		//   Mètodes de les puntes   //
		///////////////////////////////

		/*
		 * Per fer servir aquests mètodes declarem la variable com a LinkedList.
		 */
		LinkedList<String> fila = new LinkedList<>(List.of("Biel", "Carla"));
		fila.addFirst("Anna");      // al principi
		fila.addLast("Dani");       // al final (com add)
		System.out.println("addFirst i addLast: " + fila);
		System.out.println("getFirst: " + fila.getFirst() + "  getLast: " + fila.getLast());
		String primer = fila.removeFirst();
		String ultim = fila.removeLast();
		System.out.println("removeFirst: " + primer + "  removeLast: " + ultim + "  queda: " + fila + "\n");

		///////////////////////////////
		//   Com a CUA (FIFO)        //
		///////////////////////////////

		/*
		 * El primer que arriba és el primer que surt. Com la cua del forn.
		 * Entren pel final (addLast) i surten pel principi (removeFirst).
		 */
		LinkedList<String> cuaForn = new LinkedList<>();
		cuaForn.addLast("Anna");
		cuaForn.addLast("Biel");
		cuaForn.addLast("Carla");
		System.out.println("Cua del forn: " + cuaForn);
		while (!cuaForn.isEmpty()) {
			String client = cuaForn.removeFirst();
			System.out.println("  Atenem: " + client + "  -> queden " + cuaForn);
		}

		///////////////////////////////
		//   Com a PILA (LIFO)       //
		///////////////////////////////

		/*
		 * L'últim que entra és el primer que surt. Com una pila de plats,
		 * o el botó de "desfer" d'un editor.
		 * Entren i surten pel mateix costat (addFirst / removeFirst).
		 */
		LinkedList<String> desfer = new LinkedList<>();
		desfer.addFirst("escriure 'Hola'");
		desfer.addFirst("posar negreta");
		desfer.addFirst("esborrar línia");
		System.out.println("\nAccions fetes (l'última, a dalt): " + desfer);
		System.out.println("Ctrl+Z desfà: " + desfer.removeFirst());
		System.out.println("Ctrl+Z desfà: " + desfer.removeFirst());
		System.out.println("Queda: " + desfer + "\n");

		///////////////////////////////
		//   Quan faig servir quina? //
		///////////////////////////////

		/*
		 * ArrayList: quasi sempre. Accés per posició ràpid i ocupa menys memòria.
		 * LinkedList: quan la feina és posar i treure per les puntes (cues, piles, torns).
		 *
		 * Prova: treure 100.000 elements pel principi de cada llista.
		 */
		List<Integer> al = new ArrayList<>();
		LinkedList<Integer> ll = new LinkedList<>();
		for (int i = 0; i < 100000; i++) {
			al.add(i);
			ll.add(i);
		}
		long inici = System.currentTimeMillis();
		while (!al.isEmpty()) {
			al.remove(0);
		}
		System.out.println("ArrayList, remove(0) x 100.000: " + (System.currentTimeMillis() - inici) + " ms");
		inici = System.currentTimeMillis();
		while (!ll.isEmpty()) {
			ll.removeFirst();
		}
		System.out.println("LinkedList, removeFirst() x 100.000: " + (System.currentTimeMillis() - inici) + " ms");
	}

}
