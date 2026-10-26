package solucioExProvaBucles2;

import java.util.Scanner;

public class CampNou {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int n = sc.nextInt();
		int interv = 1;
		int aforament = 0;
		int max = -1;
		int numInt = 0;
		
		while(interv<=n && aforament<=c && aforament>=0) {
			aforament += sc.nextInt();
			if(aforament>max) {
				max=aforament;
				numInt=interv;
			}
			if(aforament<=c) {
				aforament -= sc.nextInt();
				if(aforament<0) {
					System.out.println("ERROR A L'INTERVAL "+interv+": SORTIDES FANTASMA");
				}
			} else {
				System.out.println("ERROR A L'INTERVAL "+interv+": AFORAMENT SUPERAT");
			}
			interv++;
			
		}
		
		if(aforament<=c && aforament>=0) {
			System.out.println("MAX "+max+" A L'INTERVAL "+numInt);
			System.out.println("FINAL "+aforament);
			System.out.println("OCUPACIO MAXIMA: "+(max*100/c)+"%");
		}

	}

}
