package inici;
/**
 * VARIABLES I TIPUS DE DADES
 * --------------------------
 * Una variable és un espai de memòria amb un NOM i un TIPUS
 * on guardem un valor que pot canviar durant l'execució.
 *
 * Sintaxi:  tipus nomVariable = valor;
 */
public class Variables {

    // CONSTANT: amb "final" el valor no es pot canviar mai.
    // Per convenció, s'escriuen en MAJÚSCULES amb guions baixos.
    static final double IVA_GENERAL = 0.21;

    public static void main(String[] args) {

        // =========================================================
        // 1. DECLARACIÓ i INICIALITZACIÓ
        // =========================================================
        int edat;          // Declaració: reservem l'espai
        edat = 17;         // Inicialització: li donem valor
        int curs = 1;      // Declaració + inicialització en una línia

        System.out.println("Edat: " + edat + ", curs: " + curs);

        // Una variable pot canviar de valor (però no de tipus!)
        edat = 18;
        System.out.println("Nova edat: " + edat);
        // edat = "divuit";   // ERROR de compilació: no és un int

        // =========================================================
        // 2. TIPUS PRIMITIUS (8 en total)
        // =========================================================

        // --- Enters ---
        byte   b = 127;              // 1 byte  -> -128 a 127
        short  s = 32000;            // 2 bytes -> -32.768 a 32.767
        int    i = 2_000_000;        // 4 bytes -> ~ ±2.100 milions (el més habitual)
        long   l = 9_000_000_000L;   // 8 bytes -> cal la L al final

        // --- Decimals (coma flotant) ---
        float  f = 3.14f;            // 4 bytes -> cal la f al final
        double d = 3.14159265359;    // 8 bytes -> el més habitual per decimals

        // --- Caràcter ---
        char lletra = 'A';           // Cometes SIMPLES. Un sol caràcter.

        // --- Lògic ---
        boolean aprovat = true;      // Només true o false

        System.out.println("\n--- Tipus primitius ---");
        System.out.println("byte:    " + b);
        System.out.println("short:   " + s);
        System.out.println("int:     " + i);
        System.out.println("long:    " + l);
        System.out.println("float:   " + f);
        System.out.println("double:  " + d);
        System.out.println("char:    " + lletra);
        System.out.println("boolean: " + aprovat);

        // Límits de cada tipus (classes "wrapper")
        System.out.println("\n--- Límits ---");
        System.out.println("int màxim:  " + Integer.MAX_VALUE);
        System.out.println("int mínim:  " + Integer.MIN_VALUE);
        System.out.println("long màxim: " + Long.MAX_VALUE);

        // Desbordament (overflow): si ens passem, "dona la volta"
        int maxim = Integer.MAX_VALUE;
        System.out.println("MAX_VALUE + 1 = " + (maxim + 1) + "  <-- compte!");

        // =========================================================
        // 3. STRING (no és primitiu, és una classe)
        // =========================================================
        String nom = "Clàudia";      // Cometes DOBLES
        String cognom = "Puig";
        String nomComplet = nom + " " + cognom;   // Concatenació amb +

        System.out.println("\n--- String ---");
        System.out.println("Nom complet: " + nomComplet);
        System.out.println("Longitud: " + nomComplet.length());
        System.out.println("En majúscules: " + nomComplet.toUpperCase());

        // =========================================================
        // 4. CONSTANTS
        // =========================================================
        final int DIES_SETMANA = 7;
        // DIES_SETMANA = 8;   // ERROR: no es pot modificar una constant

        double preu = 100.0;
        System.out.println("\n--- Constants ---");
        System.out.println("Dies de la setmana: " + DIES_SETMANA);
        System.out.println("Preu amb IVA: " + (preu + preu * IVA_GENERAL));

        // =========================================================
        // 5. CONVERSIONS DE TIPUS (CASTING)
        // =========================================================
        System.out.println("\n--- Casting ---");

        // Implícit (automàtic): de tipus petit a gran, no es perd informació
        int enter = 42;
        double real = enter;
        System.out.println("int -> double: " + real);

        // Explícit: de gran a petit, cal indicar-ho i ES POT PERDRE informació
        double nota = 7.89;
        int notaTruncada = (int) nota;   // Talla els decimals, NO arrodoneix
        System.out.println("double -> int: " + notaTruncada);

        // char i int estan relacionats (codi Unicode)
        char c = 'A';
        int codi = c;
        char seguent = (char) (c + 1);
        System.out.println("Codi de 'A': " + codi + ", següent lletra: " + seguent);

        // String <-> número
        String text = "123";
        int numero = Integer.parseInt(text);
        double numReal = Double.parseDouble("4.5");
        String deTornada = String.valueOf(numero);
        System.out.println("String -> int: " + (numero + 1));
        System.out.println("String -> double: " + numReal);
        System.out.println("int -> String: " + deTornada + "1");  // concatena!

        // =========================================================
        // 6. INFERÈNCIA DE TIPUS amb var (Java 10+)
        // =========================================================
        var ciutat = "Sabadell";   // Java dedueix que és String
        var alumnes = 30;          // Java dedueix que és int
        System.out.println("\n--- var ---");
        System.out.println(ciutat + " té " + alumnes + " alumnes a classe");
        // var x;   // ERROR: var necessita un valor inicial

        // =========================================================
        // NORMES DE NOMS (convencions)
        // =========================================================
        // - camelCase per a variables:   notaFinal, nombreAlumnes
        // - MAJÚSCULES per a constants:  MAX_INTENTS
        // - No poden començar per número: 1nota  -> ERROR
        // - No poden ser paraules reservades: int, class, public...
        // - Distingeix majúscules/minúscules: nota != Nota
        // - Noms descriptius! "n" no diu res, "notaExamen" sí.
    }
}