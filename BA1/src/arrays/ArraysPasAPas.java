package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysPasAPas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // ===== 1. CREAR =====
        int[] temperatures = new int[7];
        String[] dies = {"dl", "dt", "dc", "dj", "dv", "ds", "dg"};

        // ===== 2. OMPLIR =====
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Temperatura del " + dies[i] + ": ");
            temperatures[i] = sc.nextInt();
        }

        int[] aleatoris = new int[10];
        for (int i = 0; i < aleatoris.length; i++) {
            aleatoris[i] = rd.nextInt(100);
        }

        // ===== 3. RECÓRRER =====
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println(dies[i] + ": " + temperatures[i] + " graus");
        }

        // ===== 4. OBTENIR =====
        int dimecres = temperatures[2];
        int ultima = temperatures[temperatures.length - 1];
        System.out.println("Dimecres: " + dimecres + "   Diumenge: " + ultima);

        int suma = 0;
        for (int i = 0; i < temperatures.length; i++) {
            suma = suma + temperatures[i];
        }
        System.out.println("Mitjana: " + (double) suma / temperatures.length);

        int posMax = 0;
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > temperatures[posMax]) {
                posMax = i;
            }
        }
        System.out.println("Dia més calorós: " + dies[posMax] + " (" + temperatures[posMax] + " graus)");

        // ===== 5. MODIFICAR =====
        temperatures[0] = 20;

        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = temperatures[i] + 2;
        }

        // ===== 6. PRINTAR =====
        System.out.println(temperatures);
        System.out.println(Arrays.toString(temperatures));

        for (int i = 0; i < aleatoris.length; i++) {
            System.out.print(aleatoris[i] + " ");
        }
        System.out.println();

        // ===== 7. CLASSE ARRAYS =====
        int[] notes = {7, 3, 9, 5, 10};

        Arrays.sort(notes);
        int pos = Arrays.binarySearch(notes, 9);

        int[] plantilla = new int[5];
        Arrays.fill(plantilla, 5);

        int[] primeres = Arrays.copyOf(notes, 3);
        int[] delMig = Arrays.copyOfRange(notes, 1, 4);
        boolean iguals = Arrays.equals(notes, primeres);

        System.out.println("Ordenades: " + Arrays.toString(notes) + "   El 9 és a la posició " + pos);
        System.out.println("Plantilla: " + Arrays.toString(plantilla));
        System.out.println("Primeres:  " + Arrays.toString(primeres));
        System.out.println("Del mig:   " + Arrays.toString(delMig));
        System.out.println("Iguals?    " + iguals);
    }
}
