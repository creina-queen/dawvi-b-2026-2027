package bucles;

import java.util.Scanner;

public class LaVenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for(int i=0; i<casos; i++) {
			int velMeva = sc.nextInt();
			int velCompi = sc.nextInt();
			int velEnemic = sc.nextInt();
			int distEnemic = sc.nextInt();
			int distTorre = sc.nextInt();
			
			int distTotalEnemic = distEnemic+distTorre;
			
			boolean compiArriba = distTorre * velEnemic < distTotalEnemic * velCompi;
			boolean enemicAtrapa = distTotalEnemic * velMeva <= distTorre * velEnemic;
			
			if(compiArriba && distEnemic != 0) {
				System.out.println("SALVATS");
			} else if (enemicAtrapa || compiArriba) {
				System.out.println("MORTS");
			} else {
				System.out.println("LA VENDA");
			}
		}

	}

}
