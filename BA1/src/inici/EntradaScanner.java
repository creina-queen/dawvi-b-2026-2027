package inici;
import java.util.Locale;
import java.util.Scanner;   // 1. Cal IMPORTAR la classe Scanner

/**
 * ENTRADA DE DADES AMB SCANNER
 * ----------------------------
 * Scanner ens permet llegir el que l'usuari escriu pel teclat.
 *
 * Passos:
 *   1. import java.util.Scanner;
 *   2. Crear l'objecte:   Scanner sc = new Scanner(System.in);
 *   3. Llegir dades:      sc.nextInt(), sc.nextLine()...
 *   4. Tancar-lo al final: sc.close();
 */
public class EntradaScanner {

    public static void main(String[] args) {

        // 2. Creem l'Scanner associat al teclat (System.in)
        Scanner sc = new Scanner(System.in);

        // Per defecte, els decimals depenen de la configuració regional
        // de l'ordinador (en català/castellà s'escriu 3,5 amb COMA).
        // Si volem que s'escrigui amb PUNT (3.5), fem:
        sc.useLocale(Locale.US);

        // =========================================================
        // 3. MÈTODES DE LECTURA
        // =========================================================

        // --- nextLine(): llegeix TOTA la línia (fins a l'Intro) ---
        System.out.print("Com et dius? ");
        String nomComplet = sc.nextLine();

        // --- next(): llegeix només UNA paraula (fins a l'espai) ---
        System.out.print("Escriu una paraula: ");
        String paraula = sc.next();

        // --- nextInt(): llegeix un enter ---
        System.out.print("Quants anys tens? ");
        int edat = sc.nextInt();

        // --- nextDouble(): llegeix un decimal ---
        System.out.print("Quina alçada tens (en metres, ex: 1.70)? ");
        double alcada = sc.nextDouble();

        // --- nextBoolean(): llegeix true o false ---
        System.out.print("Tens carnet de conduir? (true/false): ");
        boolean carnet = sc.nextBoolean();

        System.out.println("\n--- Resum ---");
        System.out.println("Nom: " + nomComplet);
        System.out.println("Paraula: " + paraula);
        System.out.println("Edat: " + edat);
        System.out.println("Alçada: " + alcada + " m");
        System.out.println("Carnet: " + carnet);

        // =========================================================
        // PROBLEMA TÍPIC: nextInt() + nextLine()
        // =========================================================
        // nextInt(), nextDouble(), next()... llegeixen el valor però
        // DEIXEN l'Intro (\n) al buffer. Si després fem nextLine(),
        // aquest llegeix l'Intro pendent i sembla que "se salta".
        //
        // SOLUCIÓ: fer un sc.nextLine() "buit" per netejar el buffer.

        sc.nextLine();   // <-- Netegem l'Intro que ha quedat pendent

        System.out.print("\nQuina és la teva ciutat? ");
        String ciutat = sc.nextLine();   // Ara sí que funciona bé
        System.out.println("Vius a " + ciutat);

        // Prova a comentar la línia "sc.nextLine();" de dalt
        // i executa el programa: veuràs que no et deixa escriure la ciutat!

        // =========================================================
        // ALTERNATIVA: llegir sempre amb nextLine() i convertir
        // =========================================================
        // Evita el problema del buffer del tot.
        System.out.print("Quantes germanes/germans tens? ");
        int germans = Integer.parseInt(sc.nextLine());
        System.out.println("Tens " + germans + " germà/germana(s)");

        // =========================================================
        // hasNextInt(): comprovar abans de llegir
        // =========================================================
        // Si l'usuari escriu "hola" quan esperem un número, el programa
        // peta (InputMismatchException). Podem comprovar-ho abans:
        System.out.print("Escriu un número enter: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println("Correcte! Has escrit " + n);
        } else {
            String incorrecte = sc.next();
            System.out.println("'" + incorrecte + "' no és un número enter");
        }

        // 4. Tanquem l'Scanner quan ja no el necessitem
        sc.close();
    }
}
