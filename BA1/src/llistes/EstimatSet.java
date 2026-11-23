package llistes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EstimatSet {

	public static void main(String[] args) {
		// Crear un HashSet (bàsicament una col·lecció que no permet duplicats)
    	/*
    	 * Un Set és molt més ràpid que una List quan busques si un element existeix. 
    	 * Això es deu al fet que HashSet utilitza una implementació basada en taules de hash.
    	 */
        Set<String> setA = new HashSet<>();
        setA.add("Poma"); 
        setA.add("Plàtan"); 
        setA.add("Mango"); 

        System.out.println("Set original (setA): " + setA);

        // Convertim el Set a una Llista, per si necessitem accedir als elements per índex
        List<String> listFromSet = new ArrayList<>(setA);
        System.out.println("Convertit a List: " + listFromSet);

        // Creem un altre Set (setB) per fer algunes operacions
        Set<String> setB = new HashSet<>();
        setB.add("Mango");
        setB.add("Raïm");
        setB.add("Plàtan"); 

        System.out.println("\nSet secundari (setB): " + setB);

        // Unió de sets: ajuntem tots els elements de setA i setB (no es repeteixen els duplicats)
        Set<String> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB); 
        System.out.println("Unió de setA i setB: " + unionSet);

        // Intersecció de sets: quins elements tenen en comú setA i setB?
        Set<String> intersectionSet = new HashSet<>(setA);
        intersectionSet.retainAll(setB); // Reté només els elements comuns
        System.out.println("Intersecció de setA i setB: " + intersectionSet);

        // Diferència de sets: quins elements hi ha a setA que NO estan a setB?
        Set<String> differenceSet = new HashSet<>(setA);
        differenceSet.removeAll(setB); // Elimina del setA tot el que està a setB
        System.out.println("Diferència (setA - setB): " + differenceSet);

        // Comprovem si un set conté un element específic
        boolean conteMango = setA.contains("Mango");
        System.out.println("\nSetA conté 'Mango'? " + conteMango);

        // Convertim una llista amb duplicats a un Set (perquè el Set elimina duplicats automàticament)
        List<String> listWithDuplicates = new ArrayList<>(List.of("Poma","Mango","Mango","Plàtan"));
        
        // El Set elimina els duplicats per tu
        Set<String> setFromList = new HashSet<>(listWithDuplicates); 
        System.out.println("Convertit List a Set (eliminant duplicats): " + setFromList);
        
        /*
         * Quan utilitzar Set?
		- Quan no vols duplicats.
		- Quan necessites operacions com unió, intersecció o diferència.
		- Quan prioritzes rendiment en cerques i no t'importa l'ordre.
		
		 * Quan utilitzar List?
		- Quan vols mantenir l'ordre dels elements.
		- Quan necessites accedir als elements per índex.
		- Quan esperes que els duplicats siguin vàlids.
         */


	}

}
