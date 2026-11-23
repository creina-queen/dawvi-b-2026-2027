package llistes;

import java.util.ArrayList;

public class EstimatArrayList {

	public static void main(String[] args) {
		// Crear un ArrayList d'integers
        ArrayList<Integer> numeros = new ArrayList<>();

        // Afegir elements
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        System.out.println("ArrayList després d'afegir elements: " + numeros);

        // Afegir element en una posició específica
        numeros.add(1, 15); // Afegir 15 en la posició 1
        System.out.println("ArrayList després d'afegir en posició 1: " + numeros);

        // Accedir a un element
        int primerElement = numeros.get(0);
        System.out.println("Primer element: " + primerElement);

        // Modificar un element
        numeros.set(2, 25); // Canvia el valor en la posició 2 a 25
        System.out.println("ArrayList després de modificar posició 2: " + numeros);

        // Eliminar un element per index
        numeros.remove(1); // Elimina l'element en la posició 1
        System.out.println("ArrayList després d'eliminar posició 1: " + numeros);

        // Eliminar un element per valor
        numeros.remove(Integer.valueOf(25)); // Elimina el primer valor que coincideix amb 25
        System.out.println("ArrayList després d'eliminar valor 25: " + numeros);

        // Comprovar si l'ArrayList conté un valor
        boolean conte20 = numeros.contains(20);
        System.out.println("Conté 20? " + conte20);

        // Obtenir la mida de l'ArrayList
        int mida = numeros.size();
        System.out.println("Mida de l'ArrayList: " + mida);

        // Buidar l'ArrayList
        numeros.clear();
        System.out.println("ArrayList després de buidar: " + numeros);

        // Comprovar si l'ArrayList està buit
        boolean estaBuit = numeros.isEmpty();
        System.out.println("Està buit? " + estaBuit);


	}

}
