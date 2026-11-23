package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EscalaReial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for(int i = 0; i < casos; i++) {
			
			int[] arr = new int [7];
			
			for(int j = 0; j < arr.length; j++) {
				
				arr[j] = sc.nextInt();
						
				}
			
			Arrays.sort(arr);
			
			if(Arrays.binarySearch(arr, 1)>-1&&Arrays.binarySearch(arr, 10)>-1&& Arrays.binarySearch(arr, 11)>-1 && Arrays.binarySearch(arr, 12)>-1&& Arrays.binarySearch(arr, 13)>-1) {
				System.out.println("ESCALA REIAL");
			} else {
				int seguidas = 1;
				
				for(int j = 0; j < arr.length-1; j++) {
					
					if(arr[j]== arr[j+1]-1) {
						seguidas++;
					} else if(arr[j]!= arr[j+1] && seguidas<5){
						seguidas=1;
					}
				}
				if(seguidas >= 5) {
					System.out.println("ESCALERA");
				} else {
					System.out.println("NO");
				}
			}
		}
		

	}

}
