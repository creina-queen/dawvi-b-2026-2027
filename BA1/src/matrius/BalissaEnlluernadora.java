package matrius;

import java.util.Scanner;

//JO-EL: Balissa Enlluernadora (https://jo-el.es/problem/balizacegadora)
public class BalissaEnlluernadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//1. QUÈ EM DONEN: files, columnes, el mapa de la carretera i el radi R
		//El mapa són lletres, no números: matriu de char
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] mapa = new char[n][m];
		omplirMatriu(mapa,sc);
		int r = sc.nextInt();

		//2. Busco totes les balises: recorro tot el mapa com sempre
		for(int i=0; i<mapa.length; i++) {
			for(int j=0; j<mapa[0].length; j++) {
				if(mapa[i][j]=='B') {
					//3. Des de la balisa avanço pas a pas en línia recta
					//Paro si: ja he fet R passos, surto de la carretera, o trobo una B o una C
					//L'ordre del while importa: primer esticDins, si no peta en mirar mapa[..][..]
					//Les caselles il·luminades les marco amb '*' així no les compto dues vegades

					//Dreta: la fila queda igual, la columna va sumant
					int k = 1;
					while(k<=r && esticDins(mapa,i,j+k) && mapa[i][j+k]!='B' && mapa[i][j+k]!='C') {
						mapa[i][j+k] = '*';
						k++;
					}
					//Esquerra: la fila queda igual, la columna va restant
					k = 1;
					while(k<=r && esticDins(mapa,i,j-k) && mapa[i][j-k]!='B' && mapa[i][j-k]!='C') {
						mapa[i][j-k] = '*';
						k++;
					}
					//Amunt: la columna queda igual, la fila va restant
					k = 1;
					while(k<=r && esticDins(mapa,i-k,j) && mapa[i-k][j]!='B' && mapa[i-k][j]!='C') {
						mapa[i-k][j] = '*';
						k++;
					}
					//Avall: la columna queda igual, la fila va sumant
					k = 1;
					while(k<=r && esticDins(mapa,i+k,j) && mapa[i+k][j]!='B' && mapa[i+k][j]!='C') {
						mapa[i+k][j] = '*';
						k++;
					}
				}
			}
		}
		//Si vull veure com ha quedat la carretera:
		//printarMatriu(mapa);

		//4. QUÈ EM DEMANEN: quantes caselles tenen llum, i les balises també compten
		int comptador = 0;
		for(int i=0; i<mapa.length; i++) {
			for(int j=0; j<mapa[0].length; j++) {
				if(mapa[i][j]=='*' || mapa[i][j]=='B') comptador++;
			}
		}
		System.out.println(comptador);

		sc.close();
	}

	//La mateixa omplirMatriu de sempre, però llegint lletres
	//sc.next() llegeix una paraula i charAt(0) n'agafa la primera lletra
	private static void omplirMatriu(char[][] mat, Scanner sc) {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				mat[i][j] = sc.next().charAt(0);
			}
		}
	}

	private static void printarMatriu(char[][] mat) {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	//La mateixa esticDins, però la matriu és de char
	//Si poso int[][] no em deixa passar-li el mapa
	private static boolean esticDins(char[][] m, int f, int c) {
		return f>=0 && c>=0 && f<m.length && c<m[0].length;
	}

}
