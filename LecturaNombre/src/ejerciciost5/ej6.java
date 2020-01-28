package ejerciciost5;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		int n,op = 0;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el precio, si es mayor que 300 se le aplicara el 20%");
		n = teclado.nextInt();
		if(n>300) {
			
			op=(int) (n*20)/100;
			n=n-op;
			
			
		}
		
		System.out.println("Su precio final sera de "+n);
	}

}
