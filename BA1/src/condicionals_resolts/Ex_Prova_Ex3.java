package condicionals_resolts;

import java.util.Scanner;

public class Ex_Prova_Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dies = sc.nextInt();
		
		int parcial = dies%183;
		int total = dies%548;
		
		if(dies%183==0) {
			System.out.println("PARCIAL "+ parcial);
		} else if (dies%548==0) {
			System.out.println("TOTAL "+ total);
		} else {
			if((548-total)>(183-parcial)) {
				System.out.println("NO "+(183-parcial));
			} else {
				System.out.println("NO "+(548-total));
			}
		}

	}

}
