package solucioExProvaArraysLlistes;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int c = 0; c < k; c++) {
            int n = sc.nextInt();
            int[] cadires = new int[n];
            for (int i = 0; i < n; i++) {
            	cadires[i] = sc.nextInt();
            }
            int e = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int a = 0; a < e; a++) {
                int millor = -1, millorDist = -1;
                for (int i = 0; i < n; i++) {
                    if (cadires[i] == 0) {
                        int dist = n;
                        for (int j = 0; j < n; j++) {
                            if (cadires[j] == 1 && Math.abs(i - j) < dist) dist = Math.abs(i - j);
                        }
                        if (dist > millorDist) millorDist = dist; millor = i;
                    }
                }
                cadires[millor] = 1;
                if (a > 0) sb.append(" ");
                sb.append(millor);
            }
            System.out.println(sb);
        }
    }
}
