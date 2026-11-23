package solucioExProvaArraysLlistes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CtrlZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int c = 0; c < k; c++) {
            int ordres = sc.nextInt();
            List<String> text = new ArrayList<>();
            List<String> desfetes = new ArrayList<>();
            for (int o = 0; o < ordres; o++) {
                String ordre = sc.next();
                if (ordre.equals("ESCRIU")) {
                    text.add(sc.next());
                    desfetes.clear();
                } else if (ordre.equals("DESFES")) {
                    if (!text.isEmpty()) desfetes.add(text.remove(text.size() - 1));
                } else if (ordre.equals("REFES")) {
                    if (!desfetes.isEmpty()) text.add(desfetes.remove(desfetes.size() - 1));
                }
            }
            if(text.isEmpty()) {
            	System.out.println("BUIT");
            } else {
            	System.out.println(String.join(" ", text));
            }
            
        }
    }
}
