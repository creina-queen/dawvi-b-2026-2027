package condicionals;
/**
 * ELSE IF I IF NIUATS
 * -------------------
 * ELSE IF (condicions encadenades):
 *      Per triar UNA opció entre DIVERSES possibilitats.
 *      Es comproven EN ORDRE i s'atura a la primera que es compleix.
 *
 *      if (condició1) { ... }
 *      else if (condició2) { ... }
 *      else if (condició3) { ... }
 *      else { ... }                 // cas per defecte (opcional)
 *
 * IF NIUAT (if dins d'un altre if):
 *      Per comprovar una condició NOMÉS si ja se n'ha complert una altra.
 */
public class CondicionalsEncadenades {

    public static void main(String[] args) {

        // =========================================================
        // 1. ELSE IF: qualificació d'una nota
        // =========================================================
        double nota = 7.4;

        System.out.println("--- Else if: qualificacions ---");
        if (nota < 0 || nota > 10) {
            System.out.println("Nota no vàlida");
        } else if (nota < 5) {
            System.out.println("Insuficient");
        } else if (nota < 6) {
            System.out.println("Suficient");
        } else if (nota < 7) {
            System.out.println("Bé");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Excel·lent");
        }

        // FIXEU-VOS: a la branca "nota < 6" no cal escriure "nota >= 5 && nota < 6".
        // Si hem arribat fins aquí és perquè "nota < 5" era FALSA,
        // o sigui que ja sabem que la nota és 5 o més.

        // =========================================================
        // 2. L'ORDRE IMPORTA (error molt freqüent)
        // =========================================================
        System.out.println("\n--- L'ordre importa ---");

        // MALAMENT: la primera condició s'empassa gairebé tots els casos
        if (nota < 10) {
            System.out.println("[malament] Diu que és insuficient? -> entra aquí sempre");
        } else if (nota < 5) {
            System.out.println("[malament] Aquesta branca no s'executa MAI");
        }
        // Regla pràctica: ordeneu les condicions de la MÉS RESTRICTIVA
        // a la MÉS GENERAL (o de menor a major, de forma coherent).

        // =========================================================
        // 3. NOMÉS S'EXECUTA UNA BRANCA
        // =========================================================
        // Amb else if, quan una es compleix, la resta ni tan sols es comproven.
        // Si escrivim ifs INDEPENDENTS, es comproven tots:
        System.out.println("\n--- If independents vs else if ---");
        int punts = 95;

        System.out.println("Amb ifs independents:");
        if (punts >= 50) { 
        	System.out.println("  Has superat els 50 punts"); 
        }
        if (punts >= 75) { 
        	System.out.println("  Has superat els 75 punts"); 
        }
        if (punts >= 90) { 
        	System.out.println("  Has superat els 90 punts"); 
        }

        System.out.println("Amb else if:");
        if (punts >= 90) { 
        	System.out.println("  Nivell OR"); 
        } else if (punts >= 75) { 
        	System.out.println("  Nivell PLATA"); 
        } else if (punts >= 50) { 
        	System.out.println("  Nivell BRONZE"); 
        }

        // Els dos són correctes: depèn de si volem TOTS els missatges o només UN.

        // =========================================================
        // 4. ELSE IF AMB VALORS CONCRETS
        // =========================================================
        System.out.println("\n--- Valors concrets ---");
        String dia = "dimecres";

        if (dia.equals("dilluns")) {
            System.out.println("Toca Programació");
        } else if (dia.equals("dimecres")) {
            System.out.println("Toca Bases de Dades");
        } else if (dia.equals("divendres")) {
            System.out.println("Toca Entorns de Desenvolupament");
        } else {
            System.out.println("Avui no hi ha classe");
        }
        // (Per a casos com aquest, més endavant veurem el switch: és més clar.)

        // =========================================================
        // 5. IF NIUATS (uns dins dels altres)
        // =========================================================
        System.out.println("\n--- If niuats ---");

        boolean matriculat = true;
        boolean pagat = true;
        double notaFinal = 6.0;

        if (matriculat) {
            System.out.println("Alumne matriculat");

            if (pagat) {
                System.out.println("  Taxes pagades");

                if (notaFinal >= 5) {
                    System.out.println("  -> Es pot emetre el títol");
                } else {
                    System.out.println("  -> Cal recuperar abans del títol");
                }

            } else {
                System.out.println("  Falta pagar les taxes");
            }

        } else {
            System.out.println("Alumne NO matriculat");
        }

        // =========================================================
        // 6. IF NIUAT vs && : quan fer servir cadascun
        // =========================================================
        System.out.println("\n--- Niuat vs && ---");

        // Si NOMÉS ens interessa el cas "tot correcte", l'&& és més net:
        if (matriculat && pagat && notaFinal >= 5) {
            System.out.println("[amb &&] Títol emès");
        }

        // Si volem un missatge DIFERENT per a cada motiu de rebuig,
        // llavors cal niuar (o encadenar else if), com a l'apartat 5.

        // També es pot resoldre amb else if, que sovint és més llegible:
        if (!matriculat) {
            System.out.println("[amb else if] No està matriculat");
        } else if (!pagat) {
            System.out.println("[amb else if] No ha pagat");
        } else if (notaFinal < 5) {
            System.out.println("[amb else if] No arriba al 5");
        } else {
            System.out.println("[amb else if] Títol emès");
        }
        // Consell: massa nivells de niuat (3 o més) fan el codi difícil de llegir.
        // Sovint es pot "aplanar" amb else if, com acabem de veure.

        // =========================================================
        // 7. EL "DANGLING ELSE": a quin if pertany l'else?
        // =========================================================
        // L'else sempre s'associa a l'if MÉS PROPER que no en tingui.
        System.out.println("\n--- A quin if va l'else? ---");
        int x = 10;
        int y = -5;

        if (x > 0) {
            if (y > 0) {
                System.out.println("Tots dos positius");
            } else {
                System.out.println("x positiu, y negatiu");   // <- aquest else és de l'if intern
            }
        }
        // Amb claus sempre queda clar. Sense claus, és font d'errors.

        // =========================================================
        // 8. EXEMPLE COMPLET: calcular l'IMC
        // =========================================================
        System.out.println("\n--- Exemple complet: IMC ---");
        double pes = 68;      // kg
        double alcada = 1.72; // m

        if (pes <= 0 || alcada <= 0) {
            System.out.println("Dades no vàlides");
        } else {
            double imc = pes / (alcada * alcada);
            System.out.printf("IMC = %.2f%n", imc);

            if (imc < 18.5) {
                System.out.println("Categoria: per sota del pes recomanat");
            } else if (imc < 25) {
                System.out.println("Categoria: pes normal");
            } else if (imc < 30) {
                System.out.println("Categoria: sobrepès");
            } else {
                System.out.println("Categoria: obesitat");
            }
        }

    }
}
