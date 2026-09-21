package condicionals_resolts;

import java.util.Scanner;

public class Eleccions2020_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jiden = sc.nextInt();
		int drump = sc.nextInt();
		
		if(jiden > drump) {
			System.out.println("Jiden");
		} else if (jiden < drump){
			System.out.println("Drump");
		} else {
			System.out.println("No");
		}

	}

}
