package matrius;

public class EsticDinsVoltant {

	public static void main(String[] args) {
		//Fem un tauler d'un joc: cada casella són les monedes que hi ha
		int[][] tauler = {{1,0,3,2},{4,5,0,1},{2,2,6,0}};

		//Fins ara les funcions printaven. Ara en volem una que RETORNI una resposta
		//trobaMax ja ho feia: retornava un int i el guardàvem o el printàvem
		//esticDins retorna un boolean, per tant la puc posar directament dins d'un if
		System.out.println("[1][2] dins? "+esticDins(tauler,1,2));   // true

		//Els casos límit són els que ens fan petar el programa
		System.out.println("[-1][0] dins? "+esticDins(tauler,-1,0));  // false, fila -1 no existeix
		System.out.println("[3][0] dins? "+esticDins(tauler,3,0));    // false, files 0,1,2 (tauler.length és 3)
		System.out.println("[0][4] dins? "+esticDins(tauler,0,4));    // false, columnes 0..3 (tauler[0].length és 4)
		System.out.println("[2][3] dins? "+esticDins(tauler,2,3));    // true, és l'última casella

		//esticFora és just el contrari, de vegades queda més clar llegir-ho així
		System.out.println("[0][4] fora? "+esticFora(tauler,0,4));    // true
		System.out.println();

		//Per què ens serveix? Si miro una casella que no existeix el programa peta
		//System.out.println(tauler[-1][0]); // ERROR: ArrayIndexOutOfBoundsException
		//Abans de mirar SEMPRE pregunto si hi sóc
		int f = 0;
		int c = 0;
		if(esticDins(tauler,f-1,c)) {
			System.out.println("A dalt de [0][0] hi ha: "+tauler[f-1][c]);
		} else {
			System.out.println("A dalt de [0][0] no hi ha res, és la vora");
		}
		System.out.println();

		//Les 8 veïnes d'una casella es troben sumant -1, 0 o +1 a la fila i a la columna
		//  [f-1][c-1]  [f-1][c]  [f-1][c+1]
		//  [f][c-1]     [f][c]    [f][c+1]
		//  [f+1][c-1]  [f+1][c]  [f+1][c+1]
		System.out.println("Monedes al voltant de [1][1]: "+sumaVoltant(tauler,1,1)); // 1+0+3+4+0+2+2+6 = 18
		System.out.println("Monedes al voltant de [0][0]: "+sumaVoltant(tauler,0,0)); // 0+4+5 = 9 (a la cantonada només en té 3)
		System.out.println("Monedes al voltant de [2][3]: "+sumaVoltant(tauler,2,3)); // 0+1+6 = 7
	}

	//Retorna true si la casella [f][c] existeix a la matriu
	//Les files van de 0 a m.length-1 i les columnes de 0 a m[0].length-1
	private static boolean esticDins(int[][] m, int f, int c) {
		//També podem fer:
        // return f>=0 && c>=0 && f<m.length && c<m[0].length;
		if(f<0 || c<0 || f>=m.length || c>=m[0].length) {
			return false;
		} else {
			return true;
		}
	}

	//No la torno a programar: és el contrari de esticDins
	private static boolean esticFora(int[][] m, int f, int c) {
		return !esticDins(m,f,c);
	}

	//Suma les 8 caselles que té al voltant [f][c], la del mig no
	private static int sumaVoltant(int[][] m, int f, int c) {
		int acum = 0;
		//Seria el mateix que mirar les 8 posicions a mà, una per una:
		//if(esticDins(m,f-1,c-1)) acum += m[f-1][c-1]; // amunt esquerra
		//if(esticDins(m,f-1,c))   acum += m[f-1][c];   // amunt
		//if(esticDins(m,f-1,c+1)) acum += m[f-1][c+1]; // amunt dreta
		//if(esticDins(m,f,c-1))   acum += m[f][c-1];   // esquerra
		//if(esticDins(m,f,c+1))   acum += m[f][c+1];   // dreta
		//if(esticDins(m,f+1,c-1)) acum += m[f+1][c-1]; // avall esquerra
		//if(esticDins(m,f+1,c))   acum += m[f+1][c];   // avall
		//if(esticDins(m,f+1,c+1)) acum += m[f+1][c+1]; // avall dreta
		
		//Aquí no cal restar la del mig perquè no la sumem
		//Funciona, però són 8 ifs gairebé iguals. Només canvia el -1, 0, +1
		//Amb un doble for fem que i i j prenguin aquests valors i ens estalviem repetir
		//Recorro de la fila d'abans a la de després, i el mateix amb les columnes
		for(int i=f-1; i<=f+1; i++) {
			for(int j=c-1; j<=c+1; j++) {
				//Primer pregunto si hi sóc, després miro el valor
				if(esticDins(m,i,j)) acum += m[i][j];
			}
		}
		//El doble for també ha passat per la del mig: la trec
		acum -= m[f][c];
		return acum;
	}

}
