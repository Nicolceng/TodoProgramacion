package ejerciciost5;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int n=0; 
		System.out.print("Introduzca un numero-> ");
		n = teclado.nextInt();
		int length = String.valueOf(n).length();
		System.out.println("Su numero mide "+length+ " digitos");
	}

}
