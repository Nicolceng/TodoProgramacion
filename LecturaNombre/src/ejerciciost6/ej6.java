package ejerciciost6;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		int multi=0;
		int n;
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduzca el numero que desea multiplicar: ");
		n = teclado.nextInt();
		for(int i=0; i<=10; i++) {
		
			multi=n*i;
			System.out.println(n+"X"+i+"="+multi);
		}
	}
}