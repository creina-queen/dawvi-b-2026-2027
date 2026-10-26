package arrays;

import java.util.Arrays;
import java.util.Random;

public class MetodesArrays {

	public static void main(String[] args) {
		int[] array = {3, 1, 4, 1, 5, 9};
		
		///////////////////////
		//      .sort()      //
		///////////////////////

		/*
		* Ordena l'array en ordre ascendent
		*/
        Arrays.sort(array);
        System.out.println("Array ordenat: " + Arrays.toString(array)+"\n");

		///////////////////////
		// .binarySearch()   //
		///////////////////////
        /*
         * Busca un element en un array ordenat
         * no només serveix amb elements numèrics, sempre que es faci un sort primer
         */
        int index = Arrays.binarySearch(array, 4);
        System.out.println("Índex de l'element 4: " + index+"\n");

		///////////////////////
		//      .fill()      //
		///////////////////////

        /*
         *  Omple l'array amb un valor especificat
         */
        int[] arrayOmplert = new int[5];
        Arrays.fill(arrayOmplert, 7);
        System.out.println("Array omplert: " + Arrays.toString(arrayOmplert)+"\n");
        
		///////////////////////
		//    	 RANDOM      //
		///////////////////////
        /* 
         * 	Omple l'array amb valors aleatoris
         */
        int[] arrayRandom = new int[10];
        Random rd = new Random();
        for (int i=0; i<arrayRandom.length; i++) {
        	arrayRandom[i]= rd.nextInt(100);
        }
        System.out.println("Array random: "+Arrays.toString(arrayRandom)+"\n");

		///////////////////////
		//    .equals()      //
		///////////////////////
        /*
         *  Compara si dos arrays són iguals
         */
        int[] array2 = {3, 1, 4, 1, 5, 9};
        boolean iguals = Arrays.equals(array, array2);
        System.out.println("Els arrays són iguals? " + iguals+"\n");

		///////////////////////
		//    .copyOf()      //
		///////////////////////
        /*
         *  Crea una còpia d'un array amb una longitud especificada
         */
        int[] copiaArray = Arrays.copyOf(array, 4);
        System.out.println("Còpia de l'array (primeres 4 posicions): " + Arrays.toString(copiaArray)+"\n");

		///////////////////////
		//  .copyOfRange()   //
		///////////////////////
        /*
         *  Crea una còpia d'una part de l'array
         */
        int[] subArray = Arrays.copyOfRange(array, 1, 4); // Del segon al quart element
        System.out.println("Subarray (posicions 1 a 3): " + Arrays.toString(subArray)+"\n");


	}

}
