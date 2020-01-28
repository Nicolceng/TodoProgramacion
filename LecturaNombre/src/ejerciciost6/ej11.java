package ejerciciost6;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		int n;
		System.out.println("Introduzca un numero positivo");
		n = teclado.nextInt();
		if(n>0) {
			for(int i=n; i<=100; i++) {
				n=n+i;
			}
		}
		System.out.println(n);
		
	}

}
