package bucles;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		/*
		 * La màgia del switch és que ens permet fer un menú funcional per a utilitzar
		 * els nostres programes.
		 * Farem un menú de mates, que se que us agraden.
		 */
		
		/*
		 * A més, si volem que un menú es repeteixi, tenim la màgia dels bucles
		 */
		Scanner sc = new Scanner(System.in);
		
        
        int n, opt;
        
        do {
        	
        	System.out.println("\n\t----------------------------------");
            System.out.println("\t|     MENÚ FESTA MATEMÀTICA      |");
            System.out.println("\t----------------------------------");
            System.out.println("\t|  1. Taula de multiplicar       |");
            System.out.println("\t|  2. Comprovar si és primer     |");
            System.out.println("\t|  3. Successió de Fibonacci     |");
            System.out.println("\t|  4. Factorial                  |");
            System.out.println("\t|  0. Sortir                     |");
            System.out.println("\t----------------------------------");
            System.out.print("\n\tTria una opció: ");
            
            opt = sc.nextInt();
            
        	switch(opt) {
    		case 1:
    			System.out.println("Tria un nombre de l'1 al 10 per mostrar la seva taula de multiplicar: ");
    			n = sc.nextInt();
    			for(int i=1; i<=10; i++) {
    				System.out.printf("%d x %2d = %3d\n",n,i,n*i);
    			}
    			break;
    		case 2:
    			System.out.println("Tria un nombre major a 0 per comprovar si és primer: ");
    			n = sc.nextInt();
    			boolean flag=true;
    			for(int i=2; i<n && flag; i++) {
    				if(n%i==0) {
    					flag=false;
    				}
    			}
    			System.out.printf("El nombre %d és primer? %b\n",n,flag);
    			break;
    		case 3:
    			System.out.println("Tria un nombre major a 0 per calcular els primers nombres de la successió de Fibonacci: ");
    			n = sc.nextInt();
    			int next, actual = 1, anterior = 0;
    			if(n > 0) {
    				for(int i = 0; i < n - 1; i++) {
    					System.out.print(actual + ", ");
    					next = actual + anterior;
    					anterior = actual;
    					actual = next;
    				}
    				System.out.println(actual + ".");
    			}else {
    				System.out.println("Heu d'inserir un nombre major que zero");
    			}
    			break;
    		case 4:
    			System.out.println("Tria un nombre major a 0 per calcular el seu factorial: ");
    			n=sc.nextInt();
    			int factorial=1;

    			for(int i = 1; i <= n; i++) {
    				factorial *= i;
    			}
    			System.out.printf("El factorial de %d és %d%n", n, factorial);
    			break;
    		case 0:
    			System.out.println("ADÉU!!");
    			break;

    		default:
    			System.out.println("Opció no vàlida, trieu un nombre de la llista.");
    			break;
    		}
        	
        } while(opt!=0);
		
		
		sc.close();


	}

}
