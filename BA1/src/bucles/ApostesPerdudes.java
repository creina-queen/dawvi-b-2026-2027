package bucles;

import java.util.Scanner;

public class ApostesPerdudes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// Necessitem variable per comptar les apostes
		int perdudes = 0;
		
		// Com no sabem quants nombres tenim hem de fer while
		while(num!=0) {
			if(num<0) {
				perdudes++;
			}
			// Abans de sortir tornem a llegir per evitar bucle infinit
			num = sc.nextInt();
		}
		System.out.println(perdudes);

	}

}
