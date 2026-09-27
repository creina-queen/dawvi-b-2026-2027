package inici;

import java.util.Random;

public class NombresAleatoris {

	public static void main(String[] args) {
		Random rd = new Random();
		
		/*
		 * La classe random genera aleatoris del tipus i rang que li diguem
		 */
		
		// Nombres de 0 a 1
		int a = rd.nextInt(2);
		
		// Nombres de 3 a 5
		int b = rd.nextInt(3,6);
		
		// Una altra manera d'expressar el mateix rang
		int c = rd.nextInt(3)+3; //Entre parèntesi quants valors té el rang, la suma és el desplaçament respecte el 0
		
		System.out.println(a+" "+b+" "+c);
		
		/*
		 * També es poden generar decimals, booleans, però NO Strings.
		 */

	}

}
