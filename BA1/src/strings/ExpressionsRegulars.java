package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionsRegulars {

	public static void main(String[] args) {
		/*
		 * Una expressió regular (regex) és un PATRÓ: una manera de descriure
		 * la FORMA que ha de tenir un text. Per exemple: "vuit xifres i una lletra".
		 *
		 * La fem servir amb els mètodes de String .matches(), .replaceAll(),
		 * .replaceFirst() i .split(), i amb les classes Pattern i Matcher.
		 *
		 * IMPORTANT: a Java la barra \ dins d'un String s'escriu \\
		 * Per tant, el patró \d (un dígit) l'escrivim "\\d"
		 */

		///////////////////////
		//   .matches()      //
		///////////////////////
		// torna un booleà: true si TOT el text té la forma del patró
		System.out.println("si".matches("si"));      // true
		System.out.println("si".matches("s"));       // false: sobra la i
		System.out.println("si".matches("Si"));      // false: distingeix majúscules
		System.out.println("sisi".matches("si"));    // false: ha de coincidir sencer
		System.out.println("sisi".contains("si"));   // true: contains busca un tros
		System.out.println();

		///////////////////////
		//  CLASSES          //
		///////////////////////
		// [...] és UN sol caràcter d'entre els que hi ha a dins
		System.out.println("b".matches("[abc]"));     // true
		System.out.println("b".matches("[a-z]"));     // true: rang de la a a la z
		System.out.println("B".matches("[a-z]"));     // false
		System.out.println("B".matches("[a-zA-Z]"));  // true
		System.out.println("7".matches("[^0-9]"));    // false: ^ dins [] vol dir "qualsevol menys"
		// dreceres: \d dígit, \w lletra/dígit/_, \s espai, . qualsevol caràcter
		System.out.println("7".matches("\\d"));       // true
		System.out.println("x".matches("."));         // true
		System.out.println("ab".matches("."));        // false: el punt és UN caràcter
		System.out.println();

		///////////////////////
		//  QUANTIFICADORS   //
		///////////////////////
		// s'apliquen a l'element que tenen just al davant
		// ? 0 o 1   * 0 o més   + 1 o més   {n} exactament n   {n,m} entre n i m
		System.out.println("color".matches("colou?r"));         // true
		System.out.println("colour".matches("colou?r"));        // true
		System.out.println("aaa".matches("a+"));                // true
		System.out.println("".matches("a+"));                   // false: + vol com a mínim 1
		System.out.println("".matches("a*"));                   // true: * accepta 0
		System.out.println("08201".matches("\\d{5}"));          // true
		System.out.println("8201".matches("\\d{5}"));           // false
		System.out.println("123".matches("\\d{2,4}"));          // true
		System.out.println("Anna".matches("[A-Z][a-z]+"));      // true
		System.out.println();

		///////////////////////////
		//  ALTERNATIVES I GRUPS //
		///////////////////////////
		// | vol dir "o"; els parèntesis agrupen
		System.out.println("si".matches("si|no"));              // true
		System.out.println("sino".matches("si|no"));            // false
		System.out.println("hahaha".matches("(ha)+"));          // true: es repeteix el grup
		System.out.println("hahaha".matches("ha+"));            // false: es repeteix només la a
		System.out.println("haaaa".matches("ha+"));             // true
		System.out.println("foto.png".matches("\\w+\\.(jpg|png)")); // true
		System.out.println();

		////////////////////////////////////////////
		//  .split()  .replaceAll()  .replaceFirst() //
		////////////////////////////////////////////
		// també reben un patró
		String frase = "Hola   món   cruel";
		String[] paraules = frase.split("\\s+");               // talla per un o més espais
		System.out.println(paraules.length);                   // 3
		System.out.println(frase.replaceAll("\\s+", " "));     // Hola món cruel
		String tel = "93-123-45-67";
		System.out.println(tel.replaceAll("[^0-9]", ""));      // 931234567
		String dniVisible = "12345678Z";
		System.out.println(dniVisible.replaceFirst("\\d{5}", "*****")); // *****678Z
		System.out.println();

		///////////////////////
		//  VALIDAR DADES    //
		///////////////////////
		// el bucle es repeteix MENTRE el format NO sigui correcte
		Scanner sc = new Scanner(System.in);
		System.out.print("DNI: ");
		String dni = sc.nextLine().trim().toUpperCase();
		while (!dni.matches("\\d{8}[A-Z]")) {
			System.out.print("Format incorrecte. DNI: ");
			dni = sc.nextLine().trim().toUpperCase();
		}
		System.out.println("DNI correcte");
		// altres formats habituals:
		//   codi postal  "\\d{5}"
		//   mòbil        "[67]\\d{8}"
		//   matrícula    "\\d{4}-[BCDFGHJKLMNPRSTVWXYZ]{3}"
		//   correu       "[\\w.]+@\\w+\\.[a-z]{2,}"   (simplificat)
		System.out.println();

		/////////////////////////
		//  Pattern i Matcher  //
		/////////////////////////
		// matches() només diu sí o no. Per BUSCAR trossos dins d'un text:
		String text = "Tel: 612345678 o 934567890";
		Pattern p = Pattern.compile("\\d{9}");
		Matcher m = p.matcher(text);
		while (m.find()) {
			System.out.println(m.start() + ": " + m.group());   // posició i tros trobat
		}
		// els parèntesis creen grups que podem recuperar per separat
		Pattern hores = Pattern.compile("(\\d{2}):(\\d{2})");
		Matcher h = hores.matcher("Entrada 08:15");
		if (h.find()) {
			int hora = Integer.parseInt(h.group(1));
			int minuts = Integer.parseInt(h.group(2));
			System.out.println(hora + " h i " + minuts + " min");
		}
		System.out.println();

		///////////////////////
		//  TRAMPES          //
		///////////////////////
		String ip = "192.168.1.1";
		System.out.println(ip.split(".").length);     // 0 !! el punt és "qualsevol caràcter"
		System.out.println(ip.split("\\.").length);   // 4
		System.out.println("a|b".split("|").length);  // 3 !! | sol és "res o res"
		System.out.println("abc".replaceAll(".", "*"));   // ***
		System.out.println("abc".replace(".", "*"));      // abc: replace NO fa servir patrons
		System.out.println("Tel 612345678".matches("\\d{9}")); // false: per buscar, find()
		// "\d{5}" amb una sola barra NO COMPILA: cal "\\d{5}"

		sc.close();
	}

}
