package ejerciciost5;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Scanner teclado2 = new Scanner (System.in);
		Scanner teclado3 = new Scanner (System.in);
		int dia,hora,minutos;
		System.out.println("Introduzca el dia de la semana");
		dia = teclado.nextInt();
		System.out.println("Introduzca la hora");
		hora = teclado2.nextInt();
		System.out.println("Introduzca los mins");
		minutos = teclado.nextInt();
		
		
		
		int minutosTotales = (4 * 24 * 60) + (15 * 60);
	     int minutosActuales = (dia * 24 * 60) + (hora * 60) + minutos;
	        
	        System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
		

	}

}
