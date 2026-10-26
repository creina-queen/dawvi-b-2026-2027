package solucioExProvaBucles2;

import java.util.Scanner;

public class Topuria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int rondes = 1;
		int totalT = 0;
		int totalH = 0;
		int rondesT = 0;
		int rondesH = 0;
		boolean ko = false;
		
		while(rondes<=r && !ko) {
			int k = sc.nextInt();
			int puntsT = 0;
			int puntsH = 0;
			
			String nomKO = "";
			while(k>0 && !ko) {
				String jug = sc.next();
				String cop = sc.next();
				int punts = 0;
				switch(cop) {
				case "LK":
					punts = 2;
					break;
				case "J":
					punts = 5;
					break;
				case "G":
					punts = 10;
					break;
				case "KO":
					if(rondes<3) {
						punts = -5;
					} else {
						ko=true;
						if(jug.equals("T")) {
							nomKO = "TOPURIA";
						} else {
							nomKO = "HOLLOWAY";
						}
						
					}
					break;
				}
				if(jug.equals("T")) {
					puntsT += punts;
				} else {
					puntsH += punts;
				}
				k--;
			}
			if(!ko) {
				System.out.println("RONDA "+rondes+": TOPURIA "+puntsT+" - HOLLOWAY "+puntsH);
				totalT+=puntsT;
				totalH+=puntsH;
				if(puntsT>puntsH) {
					rondesT++;
				} else if (puntsH>puntsT) {
					rondesH++;
				}
			} else {
				System.out.println("KO! GUANYA "+nomKO+" A LA RONDA "+rondes);
			}
			rondes++;
		}
		if(!ko) {
			if(totalT>totalH) {
				System.out.println("GUANYA TOPURIA PER PUNTS: "+totalT+" A "+totalH);
			} else if (totalH>totalT) {
				System.out.println("GUANYA HOLLOWAY PER PUNTS: "+totalH+" A "+totalT);
			} else {
				if(rondesT>rondesH) {
					System.out.println("GUANYA TOPURIA PER RONDES: "+rondesT+" A "+rondesH);
				} else if(rondesH>rondesT) {
					System.out.println("GUANYA HOLLOWAY PER RONDES: "+rondesH+" A "+rondesT);
				} else {
					System.out.println("EMPAT A "+totalH+" PUNTS");
				}
			}
		}

	}

}
