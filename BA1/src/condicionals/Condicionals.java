package condicionals;
/**
 * CONDICIONALS: IF i ELSE
 * -----------------------
 * Fins ara els programes s'executaven línia a línia, sempre igual.
 * Amb l'if podem DECIDIR si un bloc de codi s'executa o no.
 *
 * Sintaxi:
 *      if (condició) {
 *          // s'executa si la condició és TRUE
 *      } else {
 *          // s'executa si la condició és FALSE
 *      }
 *
 * La condició SEMPRE ha de ser un boolean (true/false).
 */
public class Condicionals {

    public static void main(String[] args) {

        // =========================================================
        // 1. IF SIMPLE (sense else)
        // =========================================================
        // Si es compleix, fa alguna cosa. Si no, no fa res i continua.
        int edat = 20;

        System.out.println("--- If simple ---");
        if (edat >= 18) {
            System.out.println("Ets major d'edat");
        }
        System.out.println("(aquesta línia s'executa sempre)");

        // =========================================================
        // 2. IF - ELSE
        // =========================================================
        // Una de les dues branques S'EXECUTA SEMPRE. Mai les dues.
        double nota = 4.5;

        System.out.println("\n--- If / else ---");
        if (nota >= 5) {
            System.out.println("APROVAT amb un " + nota);
        } else {
            System.out.println("SUSPÈS amb un " + nota);
        }

        // =========================================================
        // 3. LA CONDICIÓ POT SER QUALSEVOL EXPRESSIÓ BOOLEANA
        // =========================================================
        System.out.println("\n--- Tipus de condicions ---");

        int numero = 7;

        // Comparació directa
        if (numero % 2 == 0) {
            System.out.println(numero + " és parell");
        } else {
            System.out.println(numero + " és senar");
        }

        // Variable boolean: NO cal escriure "== true"
        boolean teBeca = true;
        if (teBeca) {                 // millor que:  if (teBeca == true)
            System.out.println("Té beca");
        }
        if (!teBeca) {                // millor que:  if (teBeca == false)
            System.out.println("No té beca");
        }

        // Condicions combinades amb && i ||
        int hora = 14;
        boolean esFeiner = true;
        if (hora >= 8 && hora < 15 && esFeiner) {
            System.out.println("L'institut és obert");
        } else {
            System.out.println("L'institut és tancat");
        }

        // Mètodes que retornen boolean
        String usuari = "claudia";
        if (usuari.equals("claudia")) {
            System.out.println("Benvinguda, Clàudia!");
        } else {
            System.out.println("Usuari desconegut");
        }

        if (usuari.isEmpty()) {
            System.out.println("No has escrit cap usuari");
        }

        // =========================================================
        // 4. LES CLAUS { } I L'ERROR MÉS TÍPIC
        // =========================================================
        System.out.println("\n--- Claus ---");

        // Si només hi ha UNA instrucció, les claus són opcionals...
        if (edat >= 18)
            System.out.println("Pot votar");

        // ...però NO les ometeu mai! Aquest codi enganya:
        //      if (edat >= 18)
        //          System.out.println("Pot votar");
        //          System.out.println("Pot conduir");   <-- SEMPRE s'executa!
        // La segona línia està indentada, però no forma part de l'if.
        // REGLA: poseu SEMPRE les claus.

        // Un altre error clàssic: PUNT I COMA després de l'if
        //      if (edat >= 18);  { ... }
        // Aquest ";" tanca l'if amb un cos buit, i el bloc { } s'executa
        // sempre. El compilador no es queixa. Compte!

        // =========================================================
        // 5. ÀMBIT (SCOPE) DE LES VARIABLES
        // =========================================================
        System.out.println("\n--- Àmbit de variables ---");
        if (nota >= 5) {
            String missatge = "Enhorabona";   // només existeix dins d'aquest bloc
            System.out.println(missatge);
        }
        // System.out.println(missatge);   // ERROR: aquí ja no existeix

        // Si la necessitem fora, la declarem fora:
        String qualificacio;
        if (nota >= 5) {
            qualificacio = "Apte";
        } else {
            qualificacio = "No apte";
        }
        System.out.println("Qualificació: " + qualificacio);

        // =========================================================
        // 6. EXEMPLES COMPLETS
        // =========================================================
        System.out.println("\n--- Exemples ---");

        // a) Preu amb descompte
        double preu = 80;
        double preuFinal;
        if (preu > 50) {
            preuFinal = preu * 0.90;   // 10% de descompte
            System.out.println("Tens un 10% de descompte!");
        } else {
            preuFinal = preu;
            System.out.println("Sense descompte (mínim 50 €)");
        }
        System.out.println("Preu final: " + preuFinal + " €");

        // b) El més gran de dos números
        int a = 34, b = 17;
        if (a > b) {
            System.out.println("El més gran és " + a);
        } else {
            System.out.println("El més gran és " + b);
        }

        // c) Validar una entrada
        int codi = -3;
        if (codi < 0) {
            System.out.println("Error: el codi no pot ser negatiu");
        } else {
            System.out.println("Codi acceptat: " + codi);
        }

    }
}
