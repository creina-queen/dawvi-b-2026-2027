package condicionals_resolts;

import java.util.Scanner;

public class Ex_Prova_Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dep = sc.nextLine();
		
		switch(dep) {
		case "INFORMATICA":
			System.out.println("GASETA "+dep);
			break;
		case "DIRECCIO":
			System.out.println("BUTLLETI "+dep);
			break;
		case "RECURSOS HUMANS":
		case "SECRETARIA":
			System.out.println("INFORME "+dep);
			break;
		case "LOGISTICA":
			System.out.println("COMUNICAT "+dep);
			break;
		case "I+D":
			System.out.println("SETMANAL "+dep);
			break;
		default:
			System.out.println("DESCONEC EL DEPARTAMENT DE "+dep);
		}

	}

}
