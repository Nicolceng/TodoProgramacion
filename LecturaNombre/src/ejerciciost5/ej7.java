package ejerciciost5;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		int a�o;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el a�o");
		a�o = teclado.nextInt();
		if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0)))
		      System.out.println("Este a�o Eustaquio podra celebrar su cumplea�os :-)");
		    else
		      System.out.println("Este a�o Eustaquio no podra celebrar su cumplea�os :-(");
	}

}
