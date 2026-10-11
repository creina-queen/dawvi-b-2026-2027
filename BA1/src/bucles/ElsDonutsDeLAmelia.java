package bucles;

import java.util.Scanner;

public class ElsDonutsDeLAmelia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();
		
		for(int i=0; i<casos; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			// Acumularem per cada volta el mínim comú múltiple
			int mcm = 1;
			
			// Necessitem un boleà per saber si hem trobat el mcm
			boolean trobat = false;
			
			// Farem un bucle while per incrementar aquest múltiple
			// Mentre no el trobem i mentre no arribem al pitjor cas (a*b*c)
			// Aquest bucle es repetirà
			while(mcm<(a*b*c) && !trobat) {
				// si mcm es divisible entre els tres nombres: HO HEM ACONSEGUIT
				if(mcm%a==0 && mcm%b==0 && mcm%c==0) {
					trobat=true;
				} else {
					// si no, augmentem mcm
					mcm++;
				}
			}
			
			if(trobat) {
				System.out.println(mcm);
			} else {
				System.out.println(a*b*c);
			}
		}
	}

}
