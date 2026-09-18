package condicionals;
/**
 * SWITCH
 * ------
 * Alternativa a l'else if quan comparem UNA variable amb VALORS CONCRETS.
 *
 *      switch (variable) {
 *          case valor1:
 *              ...
 *              break;
 *          case valor2:
 *              ...
 *              break;
 *          default:
 *              ...
 *      }
 *
 * Tipus admesos: byte, short, int, char, String i enum
 *   (NO es pot fer switch amb double, float, long ni amb rangs com "> 5").
 */
public class Switch {

    public static void main(String[] args) {

        // =========================================================
        // 1. SWITCH CLÀSSIC
        // =========================================================
        int diaSetmana = 3;

        System.out.println("--- Switch clàssic ---");
        switch (diaSetmana) {
            case 1:
                System.out.println("Dilluns");
                break;          // surt del switch
            case 2:
                System.out.println("Dimarts");
                break;
            case 3:
                System.out.println("Dimecres");
                break;
            case 4:
                System.out.println("Dijous");
                break;
            case 5:
                System.out.println("Divendres");
                break;
            case 6:
                System.out.println("Dissabte");
                break;
            case 7:
                System.out.println("Diumenge");
                break;
            default:            // si no coincideix amb cap case
                System.out.println("Dia no vàlid");
        }

        // =========================================================
        // 2. EL break ÉS IMPRESCINDIBLE (fall-through)
        // =========================================================
        // Si oblidem el break, l'execució CONTINUA pels cases següents
        // encara que no coincideixin. És l'error més típic del switch.
        System.out.println("\n--- Sense break (fall-through) ---");
        int opcio = 2;
        switch (opcio) {
            case 1:
                System.out.println("Opció 1");
            case 2:
                System.out.println("Opció 2");   // entra aquí...
            case 3:
                System.out.println("Opció 3");   // ...i continua!
            default:
                System.out.println("Final");     // ...i acaba aquí
        }

        // =========================================================
        // 3. FALL-THROUGH INTENCIONAT: agrupar casos
        // =========================================================
        // A vegades ens interessa: diversos valors amb la mateixa resposta.
        System.out.println("\n--- Casos agrupats ---");
        int mes = 2;
        int any = 2024;
        int dies;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dies = 31;
                break;
            case 4: case 6: case 9: case 11:
                dies = 30;
                break;
            case 2:
                // dins d'un case podem posar if, bucles, el que calgui
                if ((any % 4 == 0 && any % 100 != 0) || any % 400 == 0) {
                    dies = 29;
                } else {
                    dies = 28;
                }
                break;
            default:
                dies = -1;
        }
        System.out.println("El mes " + mes + " de " + any + " té " + dies + " dies");

        // =========================================================
        // 4. SWITCH AMB STRING
        // =========================================================
        System.out.println("\n--- Switch amb String ---");
        String comanda = "guardar";

        switch (comanda) {
            case "obrir":
                System.out.println("Obrint el fitxer...");
                break;
            case "guardar":
                System.out.println("Guardant els canvis...");
                break;
            case "sortir":
                System.out.println("Fins aviat!");
                break;
            default:
                System.out.println("Comanda desconeguda: " + comanda);
        }
        // Compte: distingeix majúscules ("Guardar" no entraria al case).
        // Truc habitual:  switch (comanda.toLowerCase()) { ... }

        // =========================================================
        // 5. SWITCH AMB CHAR: una calculadora
        // =========================================================
        System.out.println("\n--- Switch amb char ---");
        double num1 = 12, num2 = 4;
        char operador = '*';

        switch (operador) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("No es pot dividir entre zero");
                }
                break;
            default:
                System.out.println("Operador no reconegut");
        }

        // =========================================================
        // 6. SWITCH MODERN AMB FLETXA ->  (Java 14 en endavant)
        // =========================================================
        // No cal break: només s'executa la branca que coincideix.
        System.out.println("\n--- Switch amb fletxa ---");
        switch (diaSetmana) {
            case 1, 2, 3, 4, 5 -> System.out.println("Dia feiner");
            case 6, 7          -> System.out.println("Cap de setmana");
            default            -> System.out.println("Dia no vàlid");
        }

        // Si una branca necessita diverses línies, es posen entre claus:
        switch (operador) {
            case '+' -> {
                double r = num1 + num2;
                System.out.println("Resultat de la suma: " + r);
            }
            default -> System.out.println("Cap suma");
        }

        // =========================================================
        // 7. SWITCH COM A EXPRESSIÓ (retorna un valor)
        // =========================================================
        // Molt útil per assignar valors: cal cobrir TOTS els casos (default).
        System.out.println("\n--- Switch com a expressió ---");
        String nomDia = switch (diaSetmana) {
            case 1 -> "Dilluns";
            case 2 -> "Dimarts";
            case 3 -> "Dimecres";
            case 4 -> "Dijous";
            case 5 -> "Divendres";
            case 6 -> "Dissabte";
            case 7 -> "Diumenge";
            default -> "Desconegut";
        };
        System.out.println("El dia " + diaSetmana + " és " + nomDia);

        // Amb blocs de diverses línies, el valor es retorna amb "yield":
        int mesConsulta = 7;
        String estacio = switch (mesConsulta) {
            case 12, 1, 2 -> "Hivern";
            case 3, 4, 5  -> "Primavera";
            case 6, 7, 8  -> {
                String s = "Estiu";
                yield s + " (vacances!)";   // yield retorna el valor del bloc
            }
            case 9, 10, 11 -> "Tardor";
            default -> "Mes no vàlid";
        };
        System.out.println("Mes " + mesConsulta + ": " + estacio);

        // =========================================================
        // 8. QUAN FER SERVIR SWITCH I QUAN ELSE IF
        // =========================================================
        // SWITCH  -> comparem UNA variable amb VALORS EXACTES
        //            (menús, codis, dies, comandes, caràcters...)
        // ELSE IF -> condicions amb RANGS (nota >= 5), amb && i ||,
        //            o amb variables diferents a cada condició.
        //
        // Això NO es pot fer amb switch:
        //      if (nota < 5) ... else if (nota < 7) ...
        // perquè els cases han de ser valors concrets, no rangs.
        //
        // Truc: de vegades es transforma un rang en un valor concret:
        System.out.println("\n--- Rang convertit en valor ---");
        int notaEntera = 8;
        switch (notaEntera / 5) {      // 0..4 -> 0 ; 5..9 -> 1 ; 10 -> 2
            case 0 -> System.out.println("Suspès");
            case 1 -> System.out.println("Aprovat");
            case 2 -> System.out.println("Excel·lent (10)");
            default -> System.out.println("Nota no vàlida");
        }
    }
}
