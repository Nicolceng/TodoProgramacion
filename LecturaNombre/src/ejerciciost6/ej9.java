package ejerciciost6;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
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
		
		int cont=0,contnegativo=0, n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
		
		System.out.print("Introduzca un numero: ");
		n1 = teclado.nextInt();
		if(n1>=0) {
			cont++;
		}else {
			contnegativo++;
		}
		System.out.print("Introduzca un numero: ");
		n2 = teclado.nextInt();
		if(n2>=0) {
			cont++;
		}else {
			contnegativo++;
		}
		System.out.print("Introduzca un numero: ");
		n3 = teclado.nextInt();
		if(n3>=0) {
			cont++;
		}else {
			contnegativo++;
		}
		System.out.print("Introduzca un numero: ");
		n4 = teclado.nextInt();
		if(n4>=0) {
			cont++;
		}else {
			contnegativo++;
		}
		System.out.print("Introduzca un numero: ");
		n5 = teclado.nextInt();
		if(n5>=0) {
			cont++;
		}else {
			contnegativo++;
		}
		System.out.print("Introduzca un numero: ");
		n6 = teclado.nextInt();
		if(n6>=0) {
			cont++;
		}else {
			contnegativo++;
		}
		System.out.print("Introduzca un numero: ");
		n7 = teclado.nextInt();
		if(n7>=0) {
			cont++;
		}else {
			contnegativo++;
		}
		System.out.print("Introduzca un numero: ");
		n8 = teclado.nextInt();
		if(n8>=0) {
			cont++;
		}else {
			contnegativo++;
		}
		System.out.print("Introduzca un numero: ");
		n9 = teclado.nextInt();
		if(n9>=0) {
			cont++;
		}else {
			contnegativo++;
		}
		System.out.print("Introduzca un numero: ");
		n10 = teclado.nextInt();
		if(n10>=0) {
			cont++;
		}else {
			contnegativo++;
		}
		
		System.out.println("Usted tiene "+cont+ " positivos y "+contnegativo+ " negativos");
		

	}

}
