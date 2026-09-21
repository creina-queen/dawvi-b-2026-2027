package condicionals_resolts;

import java.util.Scanner;

public class Eleccions2020_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jiden = sc.nextInt();
		int drump = sc.nextInt();
		int banders = sc.nextInt();
		
		// Posem totes les combinacions possibles per cada candidat
		if((jiden > drump && drump>= banders) || (jiden > banders && banders>=drump)) {
			System.out.println("Jiden");
		} else if ((jiden < drump && jiden>= banders) || (drump > banders && banders>=jiden)){
			System.out.println("Drump");
		} else {
			System.out.println("Banders");
		}

	}

}
