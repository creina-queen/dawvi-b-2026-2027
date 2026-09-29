package condicionals_resolts;

import java.util.Scanner;

public class Colors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String col1 = sc.nextLine();
		String col2 = sc.nextLine();
		String col3 = sc.nextLine();
		
		if(col1.equals("M")||col1.equals("N")) {
			if(col2.equals("G")||col2.equals("N")) {
				if(col3.equals("C")||col3.equals("N")) {
					if(col1.equals("M")) {
						if(col2.equals("N")) {
							if(col3.equals("N")) {
								System.out.println("Magenta");
							} else {
								System.out.println("Violeta");
							}
						} else {
							if(col3.equals("N")) {
								System.out.println("Vermell");
							} else {
								System.out.println("Negre");
							}
						}
					} else {
						if(col2.equals("N")) {
							if(col3.equals("N")) {
								System.out.println("Blanc");
							} else {
								System.out.println("Cian");
							}
						} else {
							if(col3.equals("N")) {
								System.out.println("Groc");
							} else {
								System.out.println("Verd");
							}
						}
					}
				}else {
					System.out.println("Color 3 no vàlid");
				}
			} else {
				System.out.println("Color 2 no vàlid");
			}
		} else {
			System.out.println("Color 1 no vàlid");
		}

	}

}
