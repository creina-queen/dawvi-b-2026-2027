package condicionals_resolts;

import java.util.Scanner;

public class Ex_Prova_Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double mitjana = (a+b+c)/3;
		
		if(a==0||b==0||c==0) {
			System.out.println("SUSPES");
		} else {
			if(c>=9) {
				System.out.println("APROVAT FINAL");
			} else {
				if(mitjana >= 5 && a>=4 && b>=4 && c>=4) {
					System.out.println("APROVAT");
				} else {
					System.out.println("SUSPES");
				}
			}
		}

	}

}
