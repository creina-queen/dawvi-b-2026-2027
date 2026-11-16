package solucioExProvaArraysLlistes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CandyCrush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        for (int c = 0; c < k; c++) {
            List<String> fila = new ArrayList<>(Arrays.asList(sc.nextLine().trim().split(" ")));
            int eliminats = 0;
            boolean canvi = true;
            while (canvi) {
                canvi = false;
                int i = 0;
                while (i < fila.size() && !canvi) {
                    int j = i;
                    while (j < fila.size() && fila.get(j).equals(fila.get(i))) j++;
                    if (j - i >= 3) {
                        for (int r = i; r < j; r++) fila.remove(i);
                        eliminats += j - i;
                        canvi = true;
                    } else {
                        i = j;
                    }
                }
            }
            System.out.println(fila);
            System.out.println("Eliminats: " + eliminats);
        }
    }
}
