package inici;
/**
 * OPERADORS RELACIONALS I LÒGICS
 * ------------------------------
 * Tots retornen un boolean (true o false).
 *
 * Relacionals (comparen valors):
 *   ==  igual           !=  diferent
 *   <   menor           >   major
 *   <=  menor o igual   >=  major o igual
 *
 * Lògics (combinen booleans):
 *   &&  I (AND)   -> cert si els DOS són certs
 *   ||  O (OR)    -> cert si ALMENYS UN és cert
 *   !   NO (NOT)  -> inverteix el valor
 *   ^   O exclusiu (XOR) -> cert si són DIFERENTS
 */
public class OperacionsLogiques {

    public static void main(String[] args) {

        // =========================================================
        // 1. OPERADORS RELACIONALS
        // =========================================================
        int a = 10;
        int b = 20;

        System.out.println("--- Relacionals (a=10, b=20) ---");
        System.out.println("a == b -> " + (a == b));   // false
        System.out.println("a != b -> " + (a != b));   // true
        System.out.println("a <  b -> " + (a < b));    // true
        System.out.println("a >  b -> " + (a > b));    // false
        System.out.println("a <= 10 -> " + (a <= 10)); // true
        System.out.println("b >= 25 -> " + (b >= 25)); // false

        // El resultat es pot guardar en una variable boolean
        double nota = 6.5;
        boolean aprovat = nota >= 5;
        System.out.println("Nota " + nota + " aprovat? " + aprovat);

        // COMPTE: = és ASSIGNACIÓ, == és COMPARACIÓ
        // if (a = 10)   -> ERROR de compilació
        // if (a == 10)  -> correcte

        // =========================================================
        // 2. TAULES DE VERITAT
        // =========================================================
        System.out.println("\n--- Taula de veritat ---");
        System.out.println("A      B      | A&&B   A||B   A^B    !A");
        boolean[] valors = {true, false};
        for (boolean p : valors) {
            for (boolean q : valors) {
                System.out.printf("%-6b %-6b | %-6b %-6b %-6b %-6b%n",
                        p, q, p && q, p || q, p ^ q, !p);
            }
        }

        // =========================================================
        // 3. EXEMPLES PRÀCTICS
        // =========================================================
        System.out.println("\n--- Exemples pràctics ---");

        int edat = 19;
        boolean teCarnet = true;

        // AND: han de complir-se les dues condicions
        boolean potConduir = edat >= 18 && teCarnet;
        System.out.println("Pot conduir? " + potConduir);

        // OR: n'hi ha prou amb una
        String dia = "dissabte";
        boolean capDeSetmana = dia.equals("dissabte") || dia.equals("diumenge");
        System.out.println("És cap de setmana? " + capDeSetmana);

        // NOT: inverteix
        boolean esLaborable = !capDeSetmana;
        System.out.println("És laborable? " + esLaborable);

        // Rang: un número entre 1 i 10 (ambdós inclosos)
        int num = 7;
        boolean dinsRang = num >= 1 && num <= 10;
        System.out.println(num + " està entre 1 i 10? " + dinsRang);
        // 1 <= num <= 10   -> ERROR en Java! Cal separar-ho amb &&

        // Fora de rang
        boolean foraRang = num < 1 || num > 10;
        System.out.println(num + " està fora de l'1-10? " + foraRang);

        // Any de traspàs: divisible entre 4 i no entre 100, o divisible entre 400
        int any = 2024;
        boolean traspas = (any % 4 == 0 && any % 100 != 0) || any % 400 == 0;
        System.out.println(any + " és de traspàs? " + traspas);

        // =========================================================
        // 4. PRECEDÈNCIA
        // =========================================================
        // Ordre: !   ->   relacionals (< > == ...)   ->   &&   ->   ||
        // && té més prioritat que ||  (com * respecte +)
        System.out.println("\n--- Precedència ---");
        boolean r1 = true || false && false;     // true || (false && false) -> true
        boolean r2 = (true || false) && false;   // true && false -> false
        System.out.println("true || false && false   = " + r1);
        System.out.println("(true || false) && false = " + r2);
        // Consell: en cas de dubte, POSEU PARÈNTESIS.

        // =========================================================
        // 5. AVALUACIÓ EN CURTCIRCUIT
        // =========================================================
        // && : si la primera és false, NO avalua la segona (ja sap que serà false)
        // || : si la primera és true,  NO avalua la segona (ja sap que serà true)
        System.out.println("\n--- Curtcircuit ---");
        int divisor = 0;
        if (divisor != 0 && 100 / divisor > 5) {
            System.out.println("Resultat gran");
        } else {
            System.out.println("No es divideix: divisor és 0 (i no ha petat!)");
        }
        // Si canviem l'ordre de les condicions, sí que petaria:
        // if (100 / divisor > 5 && divisor != 0)  -> ArithmeticException

        // =========================================================
        // 6. COMPARAR STRINGS: equals() i NO ==
        // =========================================================
        System.out.println("\n--- Comparar Strings ---");
        String s1 = "hola";
        String s2 = new String("hola");

        System.out.println("s1 == s2       -> " + (s1 == s2));        // false (!)
        System.out.println("s1.equals(s2)  -> " + s1.equals(s2));     // true
        System.out.println("\"HOLA\".equalsIgnoreCase(s1) -> " + "HOLA".equalsIgnoreCase(s1));
        // == compara si són el MATEIX objecte a memòria, no el contingut.
        // Per comparar text: SEMPRE equals().

        // Comparar char sí que es fa amb == (és primitiu)
        char lletra = 'a';
        System.out.println("lletra == 'a'  -> " + (lletra == 'a'));

        // =========================================================
        // 7. OPERADOR TERNARI  condició ? valorSiCert : valorSiFals
        // =========================================================
        System.out.println("\n--- Operador ternari ---");
        String resultat = nota >= 5 ? "APROVAT" : "SUSPÈS";
        System.out.println("Nota " + nota + ": " + resultat);

        int numero = 15;
        String paritat = numero % 2 == 0 ? "parell" : "senar";
        System.out.println(numero + " és " + paritat);

        int maxim = a > b ? a : b;
        System.out.println("El màxim entre " + a + " i " + b + " és " + maxim);
    }
}
