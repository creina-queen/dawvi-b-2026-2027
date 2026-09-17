package inici;
/**
 * OPERACIONS ARITMÈTIQUES
 * -----------------------
 *   +   suma
 *   -   resta
 *   *   multiplicació
 *   /   divisió
 *   %   mòdul (residu de la divisió)
 */
public class OperacionsAritmetiques {

    public static void main(String[] args) {

        // =========================================================
        // 1. OPERADORS BÀSICS
        // =========================================================
        int a = 17;
        int b = 5;

        System.out.println("--- Operadors bàsics (a=17, b=5) ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));   // 3  (divisió entera!)
        System.out.println("a % b = " + (a % b));   // 2  (residu)

        // =========================================================
        // 2. DIVISIÓ ENTERA vs DIVISIÓ REAL  (error molt freqüent!)
        // =========================================================
        System.out.println("\n--- Divisió entera vs real ---");
        System.out.println("17 / 5     = " + (17 / 5));       // 3
        System.out.println("17.0 / 5   = " + (17.0 / 5));     // 3.4
        System.out.println("17 / 5.0   = " + (17 / 5.0));     // 3.4

        // Si els dos són int, el resultat és int encara que el guardem en double
        double malament = a / b;
        double be = (double) a / b;
        System.out.println("double malament = a / b          -> " + malament);
        System.out.println("double be = (double) a / b       -> " + be);

        // =========================================================
        // 3. USOS DEL MÒDUL %
        // =========================================================
        System.out.println("\n--- Usos del mòdul ---");
        int numero = 24;
        System.out.println(numero + " % 2 = " + (numero % 2) + "  -> si és 0, és PARELL");

        int totalSegons = 3725;
        int hores = totalSegons / 3600;
        int minuts = (totalSegons % 3600) / 60;
        int segons = totalSegons % 60;
        System.out.println(totalSegons + " segons = " + hores + "h " + minuts + "m " + segons + "s");

        int nombre = 473;
        System.out.println("Última xifra de " + nombre + ": " + (nombre % 10));

        // =========================================================
        // 4. PRECEDÈNCIA D'OPERADORS
        // =========================================================
        // Com a matemàtiques: primer * / %, després + -
        // En cas d'empat, d'esquerra a dreta. Els parèntesis manen.
        System.out.println("\n--- Precedència ---");
        System.out.println("2 + 3 * 4   = " + (2 + 3 * 4));     // 14
        System.out.println("(2 + 3) * 4 = " + ((2 + 3) * 4));   // 20
        System.out.println("10 - 4 - 3  = " + (10 - 4 - 3));    // 3

        double nota1 = 6, nota2 = 8, nota3 = 7;
        double mitjanaMalament = nota1 + nota2 + nota3 / 3;
        double mitjanaBe = (nota1 + nota2 + nota3) / 3;
        System.out.println("Mitjana sense parèntesis: " + mitjanaMalament);
        System.out.println("Mitjana amb parèntesis:   " + mitjanaBe);

        // =========================================================
        // 5. COMPTE AMB EL + I ELS STRINGS
        // =========================================================
        System.out.println("\n--- + amb Strings ---");
        int x = 3, y = 4;
        System.out.println("Suma: " + x + y);      // "Suma: 34"  (concatena!)
        System.out.println("Suma: " + (x + y));    // "Suma: 7"
        System.out.println(x + y + " és la suma"); // "7 és la suma" (esquerra a dreta)

        // =========================================================
        // 6. INCREMENT I DECREMENT
        // =========================================================
        System.out.println("\n--- ++ i -- ---");
        int comptador = 10;
        comptador++;   // equival a: comptador = comptador + 1;
        System.out.println("Després de ++: " + comptador);   // 11
        comptador--;
        System.out.println("Després de --: " + comptador);   // 10

        // Postfix vs prefix: importa quan s'utilitza dins d'una expressió
        int n = 5;
        int resultat1 = n++;   // PRIMER assigna (5), DESPRÉS incrementa
        System.out.println("n++ -> resultat: " + resultat1 + ", n: " + n);  // 5, 6

        n = 5;
        int resultat2 = ++n;   // PRIMER incrementa, DESPRÉS assigna (6)
        System.out.println("++n -> resultat: " + resultat2 + ", n: " + n);  // 6, 6

        // =========================================================
        // 7. OPERADORS D'ASSIGNACIÓ COMPOSTA
        // =========================================================
        System.out.println("\n--- Assignació composta ---");
        int punts = 100;
        punts += 20;   System.out.println("+= 20 -> " + punts);   // 120
        punts -= 10;   System.out.println("-= 10 -> " + punts);   // 110
        punts *= 2;    System.out.println("*= 2  -> " + punts);   // 220
        punts /= 4;    System.out.println("/= 4  -> " + punts);   // 55
        punts %= 10;   System.out.println("%= 10 -> " + punts);   // 5

        // =========================================================
        // 8. LA CLASSE Math
        // =========================================================
        System.out.println("\n--- Classe Math ---");
        System.out.println("Math.pow(2, 10)   = " + Math.pow(2, 10));   // potència
        System.out.println("Math.sqrt(81)     = " + Math.sqrt(81));     // arrel quadrada
        System.out.println("Math.abs(-7)      = " + Math.abs(-7));      // valor absolut
        System.out.println("Math.max(4, 9)    = " + Math.max(4, 9));
        System.out.println("Math.min(4, 9)    = " + Math.min(4, 9));
        System.out.println("Math.round(4.5)   = " + Math.round(4.5));   // arrodoneix
        System.out.println("Math.floor(4.9)   = " + Math.floor(4.9));   // cap avall
        System.out.println("Math.ceil(4.1)    = " + Math.ceil(4.1));    // cap amunt
        System.out.println("Math.PI           = " + Math.PI);

        // Número aleatori entre 1 i 6 (un dau)
        int dau = (int) (Math.random() * 6) + 1;
        System.out.println("Tirada de dau: " + dau);

        // =========================================================
        // 9. CASOS ESPECIALS
        // =========================================================
        System.out.println("\n--- Casos especials ---");
        System.out.println("10.0 / 0 = " + (10.0 / 0));    // Infinity
        System.out.println("0.0 / 0  = " + (0.0 / 0));     // NaN (Not a Number)
        System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));  // 0.30000000000000004 (!)
        // System.out.println(10 / 0);  // int / 0 -> ArithmeticException (el programa peta)
    }
}
