package ejerciciost5;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		int año;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el año");
		año = teclado.nextInt();
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
		      System.out.println("Este año Eustaquio podra celebrar su cumpleaños :-)");
		    else
		      System.out.println("Este año Eustaquio no podra celebrar su cumpleaños :-(");
	}

}
