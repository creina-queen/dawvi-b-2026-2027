package condicionals_resolts;

import java.util.Random;

public class Ex_Prova_Ex4 {

	public static void main(String[] args) {
		Random rd = new Random();
		int euros = rd.nextInt(21);
		
		// PRINTEM EL CONTINGUT DEL RANDOM PER COMPROBAR SI FUNCIONA BÉ
		System.out.println("Euros: "+euros);
		
		System.out.print("Nesflis et diu ");
		
		if(euros>14) {
			System.out.println("\"PREMIUM\"");
		} else {
			if(euros>=9) {
				System.out.println("\"ESTANDARD\"");
			} else {
				if(euros>=6) {
					System.out.println("\"BASIC\"");
				} else {
					if(euros>=1) {
						System.out.println("\"ESTANDARD AMB ANUNCIS\"");
					} else {
						System.out.println("\"NOTHING\"");
					}
				}
			}
		}

	}

}
