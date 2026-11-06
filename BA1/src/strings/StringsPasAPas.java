package strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringsPasAPas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== 1. CREAR I MIDA =====
        String paraula = "patata";
        char lletra = 'p';

        int mida = paraula.length();
        char primera = paraula.charAt(0);
        char ultima = paraula.charAt(paraula.length() - 1);
        System.out.println(paraula + " té " + mida + " lletres. Primera: " + primera + "  Última: " + ultima);
        System.out.println("Un char: " + lletra);

        // ===== 2. RECÓRRER =====
        String frase = "la casa blava";
        int comptador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a') {
                comptador++;
            }
        }
        System.out.println("A \"" + frase + "\" hi ha " + comptador + " lletres a");

        String roma = "roma";
        for (int i = roma.length() - 1; i >= 0; i--) {
            System.out.print(roma.charAt(i));
        }
        System.out.println();

        // ===== 3. COMPARAR =====
        System.out.print("Escriu hola: ");
        String resposta = sc.nextLine();
        System.out.println("==                -> " + (resposta == "hola"));
        System.out.println("equals            -> " + resposta.equals("hola"));
        System.out.println("equalsIgnoreCase  -> " + resposta.equalsIgnoreCase("HOLA"));
        System.out.println("comença per 'h'?  -> " + (resposta.charAt(0) == 'h'));

        // ===== 4. BUSCAR =====
        String text = "el gat i el gos";
        System.out.println("indexOf('g')       = " + text.indexOf('g'));
        System.out.println("indexOf(\"el\")      = " + text.indexOf("el"));
        System.out.println("lastIndexOf(\"el\")  = " + text.lastIndexOf("el"));
        System.out.println("indexOf(\"ca\")      = " + text.indexOf("ca"));
        System.out.println("contains(\"gat\")    = " + text.contains("gat"));
        System.out.println("startsWith(\"el\")   = " + text.startsWith("el"));

        // ===== 5. RETALLAR =====
        String nom = "Programació";
        String inici = nom.substring(0, 4);
        String fi = nom.substring(7);
        System.out.println(inici + " | " + fi);

        String brut = "   hola   ";
        String net = brut.trim();
        System.out.println("[" + brut + "] -> [" + net + "]");

        // ===== 6. TRANSFORMAR =====
        String salutacio = "hola món";

        salutacio.toUpperCase(); // no fa res: el resultat no es guarda
        System.out.println(salutacio);

        salutacio = salutacio.toUpperCase();
        System.out.println(salutacio);
        System.out.println(salutacio.toLowerCase());
        System.out.println(salutacio.replace("MÓN", "CLASSE"));

        // ===== 7. STRINGS I ARRAYS =====
        String fruita = "poma pera kiwi";
        String[] fruites = fruita.split(" ");
        System.out.println(Arrays.toString(fruites));

        String llista = String.join(", ", fruites);
        System.out.println(llista);

        char[] lletres = "kiwi".toCharArray();
        System.out.println(Arrays.toString(lletres));

        String any = "2026";
        int[] xifres = new int[any.length()];
        for (int i = 0; i < any.length(); i++) {
            xifres[i] = Character.getNumericValue(any.charAt(i));
        }
        System.out.println(Arrays.toString(xifres));

        // ===== 8. CONSTRUIR =====
        String acumulat = "";
        for (int i = 0; i < 3; i++) {
            System.out.print("Paraula " + (i + 1) + ": ");
            acumulat = acumulat + sc.nextLine() + " ";
        }
        System.out.println(acumulat.trim());

        StringBuilder sb = new StringBuilder("roma");
        sb.reverse();
        sb.setCharAt(0, 'A');
        sb.append("!");
        sb.insert(0, "Visca l'");
        String resultat = sb.toString();
        System.out.println(resultat);

        // ===== 9. LLEGIR UN NÚMERO I DESPRÉS UN TEXT =====
        System.out.print("Edat: ");
        int edat = sc.nextInt();
        sc.nextLine(); // s'emporta l'Enter que ha deixat nextInt()
        System.out.print("Nom: ");
        String nomAlumne = sc.nextLine();
        System.out.println(nomAlumne + " té " + edat + " anys");

        sc.close();
    }
}
