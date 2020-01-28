package EjerciciosT4;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		int n,n1,contador=0;
		
		Scanner teclado = new Scanner (System.in);
		Scanner teclado1 = new Scanner (System.in);
		System.out.println("Introduzca el numero limite que quiere");
		n = teclado.nextInt();
		
		do {
			System.out.println("Introduzca numeros (se iran sumando hasta llegar al limite)");
			n1 = teclado1.nextInt();
			contador=contador+n1;
		}while(contador<=n);
				
		System.out.println("Ha sobrepasado el limite " +contador);
	

	}

}
