package solucioExProvaBucles2;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int opt;
		String nick = "";
		boolean ma = false;
		int total = 0;
		int fitxes = 100;
		int g = 0;
		int j = 0;
        
        do {
        	
        	System.out.println("\n\t----------------------------------");
            System.out.println("\t|     BLACKJACK DE DEBO          |");
            System.out.println("\t----------------------------------");
            System.out.println("\t|  1. Registrar jugador          |");
            System.out.println("\t|  2. Nova ma                    |");
            System.out.println("\t|  3. Demanar carta              |");
            System.out.println("\t|  4. Plantar-se                 |");
            System.out.println("\t|  5. Sortir                     |");
            System.out.println("\t----------------------------------");
            System.out.print("\n\tTria una opció: ");
            
            opt = sc.nextInt();
            
        	switch(opt) {
    		case 1:
    			System.out.println("Tria un nick: ");
    			String temp = sc.next().toUpperCase();
    			if(temp.length()<4 || temp.length()>8 || temp.charAt(0)<'A' || temp.charAt(0)>'Z') {
    				System.out.println("NICK INCORRECTE");
    			} else {
    				boolean xifra = false;
    				boolean simbol = false;
    				for(int i=0; i<temp.length(); i++) {
        				if(temp.charAt(i)>='0' && temp.charAt(i)<='9') {
        					xifra = true;
        				} else {
        					if(temp.charAt(i)<'A' || temp.charAt(i)>'Z') {
        						simbol = true;
        					}
        				}
        			}
    				if(!xifra || simbol) {
    					System.out.println("NICK INCORRECTE");
    				} else {
    					nick = temp;
    					System.out.println("JUGADOR "+nick+" REGISTRAT");
    				}
    			}
    			
    			break;
    		case 2:
    			if(!ma) {
    				if(!nick.isEmpty()) {
    					j++;
    					int carta1 = rd.nextInt(1,12);
        				int carta2 = rd.nextInt(1,12);
        				total = carta1+carta2;
        				System.out.println("CARTES: "+carta1+" + "+carta2+" = "+total);
        				if(total==21) {
        					System.out.println("BLACKJACK! +30");
        					fitxes+=30;
        					total=0;
        					g++;
        				} else if(total>21) {
        					System.out.println("T'HAS PASSAT! -20");
        					fitxes-=20;
        					total=0;
        				} else {
        					ma=true;
        				}
        				
    				} else {
    					System.out.println("PRIMER REGISTRA EL JUGADOR");
    				}
    				
    			} else {
    				System.out.println("JA TENS UNA MA EN JOC");
    			}
    			break;
    		case 3:
    			if(nick.isEmpty()) {
    				System.out.println("PRIMER REGISTRA EL JUGADOR");
    			} else if (!ma) {
    				System.out.println("PRIMER COMENCA UNA MA");
    			} else {
    				int carta = rd.nextInt(1,12);
    				total+=carta;
    				System.out.println("CARTA: "+carta+". TOTAL: "+total);
    				if(total==21) {
    					System.out.println("BLACKJACK! +30");
    					fitxes+=30;
    					ma=false;
    					total=0;
    					g++;
    				} else if(total>21) {
    					System.out.println("T'HAS PASSAT! -20");
    					fitxes-=20;
    					ma=false;
    					total=0;
    				}
    			}
    			break;
    		case 4:
    			if(nick.isEmpty()) {
    				System.out.println("PRIMER REGISTRA EL JUGADOR");
    			} else if (!ma) {
    				System.out.println("PRIMER COMENCA UNA MA");
    			} else {
    				int casa = 0;
    				while(casa<17) {
    					casa+=rd.nextInt(1,12);
    				}
    				System.out.print("CASA: "+casa+" -> ");
    				if(casa==21 || (casa>total && casa<21)) {
    					System.out.println("PERDS! -20");
    					fitxes-=20;
    				} else if(casa>21 || total>casa) {
    					System.out.println("GUANYES! +20");
    					fitxes+=20;
    					g++;
    				} else {
    					System.out.println("EMPAT");
    				}
    				ma=false;
    				total=0;
    			}
    			break;
    		case 5:
    			break;

    		default:
    			System.out.println("OPCIO INCORRECTA");
    			break;
    		}
        	
        } while(opt!=5 && fitxes>0 && fitxes<200);
		
		if(fitxes <= 0) {
			System.out.println("GAME OVER: T’HAS QUEDAT SENSE FITXES");
		} else if(fitxes >= 200) {
			System.out.println("HAS FET SALTAR LA BANCA!");
		}
		if(nick.isEmpty()) {
			nick="ANONIM";
		}
		System.out.println("RESUM: "+nick+" | "+fitxes+" FITXES | "+g+"/"+j+" MANS GUANYADES");
		sc.close();

	}

}
