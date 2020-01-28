package ejerciciost6;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		int n=0;
		int j;
		String caracter;
		String espacios=" ";
		Scanner teclado = new Scanner (System.in);
		Scanner teclado1 = new Scanner (System.in);
		System.out.println("Introduzca la altura que desea para su piramide");
		n = teclado.nextInt();
		System.out.println("Introduzca el caracter que quiere que se imprima");
		caracter = teclado1.nextLine();
		
			for(int i=1; i<=n; i++) {
				
			System.out.print("\n");
			
			for(j=1; j<=n-i; j++) {
				
				System.out.print(espacios);
				
			}
			
			for(int x=1; x<=(i*2)-1; x++) {
				
				System.out.print(caracter); 
			
			}
				
			}
	}
}
