package matrius;

public class MaximMitjana {

	public static void main(String[] args) {
		// El màxim sempre s'inicialitza amb el valor més petit
		// Si jo tinc una matriu de negatius no en tinc prou amb inicialitzar a -1
		int max = Integer.MIN_VALUE;
		
		//MIN_VALUE és el valor més petit possible
		//MAX_VALUE és el valor més gran possible
		
		//Fem una matriu
		int[][] matriu = {{4,5,6},{3,2,4},{9,6,5}};
		
		//Si vull trobar el màxim la recorreré actualitzant max
		//Sempre es quedarà amb el primer valor que trobi, si hi ha un igual l'ignorarà
		for(int i=0; i<matriu.length; i++) {
			for(int j=0; j<matriu[0].length; j++) {
				if(matriu[i][j]>max) max = matriu[i][j];
			}
		}
		System.out.println("Màxim: "+max);
		
		//Posem que tinc dues matrius més:
		int[][] mat2 = {{-10,-3,-200},{-5,-23,-15},{-100,-200,-5}};
		int[][] mat3 = {{1,1,1},{3,2,1},{1,2,2}};
		
		//Si vull veure els maxs hauria de repetir el bucle, aquesta és la gràcia de les funcions
		System.out.println("Màxim mat2: "+trobaMax(mat2));
		System.out.println("Màxim mat2: "+trobaMax(mat3));
		
		//Per fer la mitjana he de decidir si la vull de files o de columnes
		//Sempre posar un dels dos valors de la divisió en decimals
		System.out.println("Mitjana fila 1: "+(double)sumaFila(1,matriu)/matriu.length);
		System.out.println("Mijtana columna 0: "+(double)sumaColumna(0,matriu)/matriu[0].length);

	}
	public static int trobaMax(int[][] m) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[0].length; j++) {
				if(m[i][j]>max) max = m[i][j];
			}
		}
		return max;
	}
	
	public static int sumaFila(int f, int[][]m) {
		int acum = 0;
		//Només un bucle amb la fila que vull
		for(int i=0; i<m[0].length;i++) {
			acum += m[f][i];
		}
		return acum;
	}
	
	public static int sumaColumna(int c, int[][]m) {
		int acum = 0;
		//Només un bucle amb la columna que vull
		for(int i=0; i<m.length;i++) {
			acum += m[i][c];
		}
		return acum;
	}

}
