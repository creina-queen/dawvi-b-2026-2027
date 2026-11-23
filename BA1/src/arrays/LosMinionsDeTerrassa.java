package arrays;

import java.util.*;

public class LosMinionsDeTerrassa{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < casos; i++) {
			int cont = 0;
			String[] castell = sc.nextLine().split(" de ");
			int pisos = Integer.parseInt(castell[1]);
			int pers = Integer.parseInt(castell[0]);
			int[] membres = new int[pisos];
			for (int j = 0; j < pisos - 3; j++) {

				membres[j] = pers;

			}
			if(pers!=1) {
				membres[membres.length-3]=2;
				membres[membres.length-2]=1;
				membres[membres.length-1]=1;
			}else if(pers==1) {
				membres[membres.length-3]=1;
				membres[membres.length-2]=1;
				membres[membres.length-1]=1;	
				
			}
			for(int j=0;j<membres.length;j++) {
				cont+=membres[j];
			}

			System.out.println(cont);
		}
	}

}