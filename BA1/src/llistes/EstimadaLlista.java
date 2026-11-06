package llistes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EstimadaLlista {

	public static void main(String[] args) {
		// Crear dues llistes
        List<String> listA = new ArrayList<>();
        listA.add("Poma");
        listA.add("Plàtan");
        listA.add("Mango");
        listA.add("Raïm");

        List<String> listB = new ArrayList<>();
        listB.add("Mango");
        listB.add("Raïm");
        listB.add("Cirera");
        listB.add("Plàtan");

        System.out.println("Llista A: " + listA);
        System.out.println("Llista B: " + listB);
        
        // Ordenem per defecte i amb Comparator per demanar de fer-ho en ordre invers
        listA.sort(null);
        System.out.println(listA);
        listA.sort(Comparator.reverseOrder());
        System.out.println(listA);

        // Unió de llistes (tots els elements de listA i listB)
        List<String> unionList = new ArrayList<>(listA);
        unionList.addAll(listB);
        System.out.println("\nUnió de llistes (A + B): " + unionList);

        // Intersecció de llistes (elements comuns entre listA i listB)
        List<String> intersectionList = new ArrayList<>(listA);
        intersectionList.retainAll(listB);
        System.out.println("Intersecció de llistes (A ∩ B): " + intersectionList);

        // Diferència de llistes (elements que estan a listA però no a listB)
        List<String> differenceList = new ArrayList<>(listA);
        differenceList.removeAll(listB);
        System.out.println("Diferència de llistes (A - B): " + differenceList);

        
     // Buscar un element dins d'una llista
        boolean conteMango = listA.contains("Mango");
        System.out.println("\nListA conté 'Mango'? " + conteMango);

        // Obtenir un subllistat (part d'una llista)
        List<String> subList = listA.subList(1, 3);
        System.out.println("Subllista de llista A (índex 1 a 3): " + subList);


	}

}
