package solucioExProvaBucles2;

import java.util.Scanner;

public class Masterchef {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int laura = 6;
		int david = 5;
		int votsSeguitsLaura = 0;
		int votsSeguitsDavid = 0;
		boolean jordi = false;
		int valoracions = 0;
		
		while(laura<10 && david<10 && !jordi && valoracions<6) {
			String nom = sc.nextLine();
			if(nom.equals("LAURA")) {
				laura++;
				votsSeguitsLaura++;
				votsSeguitsDavid=0;
				valoracions++;
				if(votsSeguitsLaura%3==0) {
					laura++;
				}
			} else if(nom.equals("DAVID")) {
				david++;
				votsSeguitsDavid++;
				votsSeguitsLaura=0;
				valoracions++;
				if(votsSeguitsDavid%3==0) {
					david++;
				}
			} else if(nom.equals("JORDI")) {
				jordi=true;
			}
		}
		if(jordi) {
			System.out.println("JORDI S’HO QUEDA TOT DESPRES DE "+valoracions+" VALORACIONS");
		} else if (valoracions==6 && laura<10 && david<10) {
			if(laura>david) {
				System.out.println("GUANYA LAURA PER PUNTS: "+laura+" A "+david);
			} else if(david>laura) {
				System.out.println("GUANYA DAVID PER PUNTS: "+david+" A "+laura);
			} else {
				System.out.println("EMPAT A "+laura+" PUNTS");
			}
		} else {
			if(laura>david) {
				System.out.println("GUANYA LAURA AMB "+laura+" PUNTS DESPRES DE "+valoracions+" VALORACIONS");
			} else {
				System.out.println("GUANYA DAVID AMB "+david+" PUNTS DESPRES DE "+valoracions+" VALORACIONS");
			}
		}
	}
}
