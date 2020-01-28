package ejerciciost5;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner teclado = new Scanner (System.in);
		Scanner teclado1 = new Scanner (System.in);
		Scanner teclado2 = new Scanner (System.in);
		Scanner teclado3 = new Scanner (System.in);
		Scanner teclado4 = new Scanner (System.in);
		Scanner teclado5 = new Scanner (System.in);
		Scanner teclado6 = new Scanner (System.in);
		Scanner teclado7 = new Scanner (System.in);
		Scanner teclado8 = new Scanner (System.in);
		Scanner teclado9 = new Scanner (System.in);
		String n,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
		int contador=0;
		System.out.println("Bienvenido a este test, vaya respondiendo las siguientes preguntas con Y/N");
		Thread.sleep(1000);
		System.out.println("¿Es el cielo azul?");
		n= teclado.nextLine();
		if(n.equalsIgnoreCase("Y")) {
			contador++;
			}
		System.out.println("¿Es el cielo azul?");
		n1= teclado1.nextLine();
		if(n1.equalsIgnoreCase("Y")) {
			contador++;
			}
		System.out.println("¿Es el cielo azul?");
		n2= teclado2.nextLine();
		if(n2.equalsIgnoreCase("Y")) {
			contador++;
			}
		System.out.println("¿Es el cielo azul?");
		n3= teclado3.nextLine();
		if(n3.equalsIgnoreCase("Y")) {
			contador++;
			}
		System.out.println("¿Es el cielo azul?");
		n4= teclado4.nextLine();
		if(n4.equalsIgnoreCase("Y")) {
			contador++;
			}
		System.out.println("¿Es el cielo azul?");
		n5= teclado5.nextLine();
		if(n5.equalsIgnoreCase("Y")) {
			contador++;
			}
		System.out.println("¿Es el cielo azul?");
		n6= teclado6.nextLine();
		if(n6.equalsIgnoreCase("Y")) {
			contador++;
			}
		System.out.println("¿Es el cielo azul?");
		n7= teclado7.nextLine();
		if(n7.equalsIgnoreCase("Y")) {
			contador++;
			}
		System.out.println("¿Es el cielo azul?");
		n8= teclado8.nextLine();
		if(n8.equalsIgnoreCase("Y")) {
			contador++;
			}
		System.out.println("¿Es el cielo azul?");
		n9= teclado9.nextLine();
		if(n9.equalsIgnoreCase("Y")) {
			contador++;
			}
		
		System.out.println("Ha sacado un "+contador);
		
		
		

	}

}
