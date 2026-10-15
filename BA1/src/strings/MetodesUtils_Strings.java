package strings;

public class MetodesUtils_Strings {

	public static void main(String[] args) {
		/*
		 * Els strings tenen tota una sèrie de mètodes per a treballar
		 * amb ells que poden ser molt útils. 
		 * 
		 * Només fent una crida a aquests mètodes (afegint després de la 
		 * variable .[nom_metode](arguments) podem fer múltiples modificacions
		 * 
		 */
		
		String s = "   Hola    mon   !   ";
		///////////////////////
		//    .length()      //
		///////////////////////
		// ens torna un enter amb la mida de la frase
		System.out.printf("La frase té %d lletres.\n\n", s.length());
		
		///////////////////////
		//    .equals()      //
		///////////////////////
		// com ja sabem, compara frases ja que no podem comparar-les amb ==
		// torna un booleà
		System.out.println("patata".equals("sardina"));
		System.out.println("   Hola    mon   !   ".equals(s));
		System.out.println();
		
		//////////////////////////
		//  .equalsIgnoreCase() //
		//////////////////////////
		// com l'equals però no té en compte majúscules o minúscules
		System.out.println("Equals normal compara POMA i poma: "+"POMA".equals("poma"));
		System.out.println("Equals ignorant majúscules: "+"POMA".equalsIgnoreCase("poma"));
		System.out.println();
		
		///////////////////////
		//    .trim()        //
		///////////////////////
		// treu els espais en blanc sobrants de principi i final d'string
		System.out.println("Quantitat de lletres abans de trim: "+s.length());
		System.out.println(s.trim());
		System.out.println("Quantitat de lletres després de trim: "+s.trim().length());
		System.out.println();
		
		///////////////////////
		//    .replace()     //
		///////////////////////
		// substitueix una seqüencia de caràcters per una altra
		System.out.println(s.replace("mon", "què tal"));
		System.out.println(s.replace("   ", " "));
		System.out.println(s.replace(" ", ""));
		System.out.println();
		
		///////////////////////
		//  .toUpperCase()   //
		///////////////////////
		// converteix l'string a majúscules
		System.out.println(s.toUpperCase());
		System.out.println();
		
		///////////////////////
		//  .toLowerCase()   //
		///////////////////////
		// converteix l'string a minúscules
		System.out.println(s.toLowerCase());
		System.out.println();
		
		///////////////////////
		//     .charAt()     //
		///////////////////////
		// torna el caràcter que ocupa la posició especificada
		// ull, que comença a comptar a partir de 0!!!
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(6));
		System.out.println();
		
		///////////////////////
		//    .indexOf()     //
		///////////////////////
		// invers a charAt, donat una lletra o una seqüència 
		// ens torna l'enter d'on s'inicia
		// pot utilitzar-se amb char o amb string, fixeu-vos en les cometes
		System.out.println("Hola comença a la posició: "+s.indexOf("Hola"));
		System.out.println("! es troba a la posició: "+s.indexOf('!'));
		System.out.println();
		
		///////////////////////
		//   .substring()    //
		///////////////////////
		// torna un string definit entre dues posicions de lletres
		System.out.println(s.substring(3, 7));
		// també podem indicar que volem de determinada posició fins al final
		System.out.println(s.substring(11));
		System.out.println();
		
		///////////////////////
		//   .contains()     //
		///////////////////////
		// ens indica amb un booleà si l'string conté una lletra o seqüècia de letres
		System.out.println("La frase Hola mon! conté la lletra r? "+s.contains("r"));
		System.out.println("La frase Hola mon! conté la paraula mon? "+s.contains("mon"));
		System.out.println();
		
		///////////////////////
		//    .isEmpty()     //
		///////////////////////
		// ens torna un booleà que indica si l'string està buit (útil per a control d'errors)
		System.out.println("La variable s està buida? "+s.isEmpty());
		String o="";
		System.out.println("La variable o està buida? "+o.isEmpty());
		System.out.println();
		
		
		///////////////////////
		//    ALTRES         //
		///////////////////////
		/*
		* Ens quedarien .replaceAll i .matches... veure EXPRESSIONS REGULARS
		*/


	}

}
