package matrius;

import java.util.Scanner;

// EXERCICI RESOLT PER KAREN
public class Baliza {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int f = input.nextInt();
		int c = input.nextInt();
		String[][] mat = new String[f][c];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				mat[i][j] = input.next();
			}
		}
		int radio = input.nextInt();
		boolean[][] iluminado = new boolean[f][c];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(mat[i][j].equals("B")) {
					iluminado[i][j]=true;
				
				int pasos = 1;
				// derecha (1 columna, fila se mantiene)
				while(pasos<=radio) {
					int ni = i;
					int nj = j +pasos;
					if(ni<0 || ni>=f || nj<0 || nj>=c) break;
					if(mat[ni][nj].equals("C")|| mat[ni][nj].equals("B")) break;
					if(mat[ni][nj].equals("0"))iluminado[ni][nj]=true;
					pasos++;
				}
				pasos = 1;
				// izquierda (-1 columna, fila se mantiene)
				while(pasos<=radio) {
					int ni = i;
					int nj = j -pasos;
					if(ni<0 || ni>=f || nj<0 || nj>=c) break;
					if(mat[ni][nj].equals("C")|| mat[ni][nj].equals("B")) break;
					if(mat[ni][nj].equals("0"))iluminado[ni][nj]=true;
					pasos++;
				}
				pasos = 1;
				// abajo (1 fila, columna se mantiene)
				while(pasos<=radio) {
					int ni = i+pasos;
					int nj = j;
					if(ni<0 || ni>=f || nj<0 || nj>=c) break;
					if(mat[ni][nj].equals("C")|| mat[ni][nj].equals("B")) break;
					if(mat[ni][nj].equals("0"))iluminado[ni][nj]=true;
					pasos++;
				}
				pasos = 1;
				// arriba (-1 fila, columna se mantiene)
				while(pasos<=radio) {
					int ni = i-pasos;
					int nj = j;
					if(ni<0 || ni>=f || nj<0 || nj>=c) break;
					if(mat[ni][nj].equals("C")|| mat[ni][nj].equals("B")) break;
					if(mat[ni][nj].equals("0"))iluminado[ni][nj]=true;
					pasos++;
				}
				}
			}
		
		}
		int llum = 0;
		for(int i=0;i<iluminado.length;i++) {
			for(int j=0;j<iluminado[0].length;j++) {
				if(iluminado[i][j]) {
					llum++;
				}
			}
		}
		System.out.println(llum);
	}

}
