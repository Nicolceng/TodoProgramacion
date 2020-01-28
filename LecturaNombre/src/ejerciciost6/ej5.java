package ejerciciost6;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int clave=1234;
		int intentos=0;
		do {
		System.out.print("Introduzca la clave: ");
		clave = teclado.nextInt();
		
		intentos++;
		
		if(clave==1234) {
			System.out.println("Ha introducido correctamente la clave");
			break;
		}
		else {
			System.out.println("no tiene la clave bien");
		}
		}while(intentos<4);
		
		
	}

}
