package arrays;

import java.util.*;

public class Lalafel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < casos; i++) {
			String texto = sc.nextLine().toLowerCase();
			int capacidad = sc.nextInt();
			sc.nextLine();
			int llenas  = 0;
			int telas = 0;
			int lalafels = 0;
			String [] partes = texto.split(",");
			for(String n : partes) {
				n = n.trim();
				if (n.equals("aranya")){
					lalafels = 0;
					llenas = 0;
					telas = 0;
				}else if (n.equals("telaranya")) {
					telas++;
				}else if (n.equals("lalafel")) {
					lalafels++;
				}
				while(capacidad > 0 && telas > 0 && lalafels >= capacidad) {
					llenas++;
					lalafels -= capacidad;
					telas--;
				}
			}
			System.out.println("Hay " + llenas + " teleranyas llenas.");
		}
	}

}
