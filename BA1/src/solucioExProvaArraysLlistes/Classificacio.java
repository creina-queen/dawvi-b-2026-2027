package solucioExProvaArraysLlistes;
import java.util.Scanner;

public class Classificacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int c = 0; c < k; c++) {
            int n = sc.nextInt();
            String[] noms = new String[n];
            int[] punts = new int[n];
            for (int i = 0; i < n; i++) {
            	noms[i] = sc.next();
            }
            for (int i = 0; i < n; i++) {
            	punts[i] = sc.nextInt();
            }
            int[] pos = new int[n];
            for (int i = 0; i < n; i++) {
                int millors = 0;
                for (int j = 0; j < n; j++) if (punts[j] > punts[i]) millors++;
                pos[i] = millors + 1;
            }
            StringBuilder l1 = new StringBuilder();
            StringBuilder l2 = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (i > 0) l1.append(" ");
                l1.append(pos[i]);
                if (pos[i] <= 3) {
                    if (l2.length() > 0) l2.append(" ");
                    l2.append(noms[i]);
                }
            }
            System.out.println(l1);
            System.out.println(l2);
        }
    }
}
