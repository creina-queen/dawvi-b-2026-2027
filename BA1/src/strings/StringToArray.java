package strings;

import java.util.Arrays;

public class StringToArray {

	public static void main(String[] args) {
		String a = "HOLA QUE TAL COM ESTEM AVUI";
		
		// A l'split donem el patró per partir l'estring en x arrays
		// Podem fer patrons simples com l'espai o més complexes (veure Expressions Regulars)
		String[] array = a.split(" ");
		System.out.println(Arrays.toString(array));
		
		//Podem separar per guió també o per més d'un element
		String tel = "666-775-882";
		String a2[] = tel.split("-");
		System.out.println(Arrays.toString(a2));
		
		//Tenim strings, si sabem que realment són nombres i necessitem ternir-los així els podem parsejar
		// Integer.parseInt transforma un string a un int
		int[] enteros = new int[a2.length];
		for(int i=0; i<enteros.length; i++) {
			enteros[i] = Integer.parseInt(a2[i]);
		}
		//Aqui ja no concatena, aqui suma realment els valors
		System.out.println(enteros[0]+enteros[1]);
		
		//Si vull convertir un array a un string utilitzo String.join
		String nou = String.join("", a2);
		System.out.println(nou);

	}

}
