package ExamenJava;
import java.util.Scanner;
import java.lang.*;
import java.io.IOException;
public class Pruebaexamen {

public static void main(String[] args) throws IOException, InterruptedException {
		
			Scanner teclado = new Scanner (System.in);
			Scanner teclado1 = new Scanner (System.in);
			String User;
			String password;
			String l1,l2,l3,l4,l5,s;
			String entrar;
			String piramide;
			int altura=0,apotema=0,calculo=0;
			int cont=0;
			int contpreguntas=0;
			int contrepetidor=0;
			int n=0;
			int n1=0;
			int n2=0;
		
			do {
			System.out.print("Introduzca el usuario Gran Sabio Imhotep-> ");
			User = teclado.nextLine();
			System.out.print("");
			System.out.print("Introduzca la contrasennia Gran Sabio Imhotep-> ");
			password = teclado.nextLine();
			System.out.print("");
			cont++;
			
			if(cont>3) {
				System.out.println("USTED NO ES EL GRAN SABIO, NO PUEDE ACCEDER A LOS ARCHIVOS SAGRADOS");
				break;
			}
			
			
			}while(!User.equals("Imhotep") || !password.equals("Saqqara"));
		

			do {
			
			System.out.println("-----------------------------------------------");
			System.out.println("S-> Salir del Sistema de archivos Sagrado (Introduzca la letra de su opción en mayusculas, por favor)");
			
			System.out.println("L-> Hacer Checklist de preguntas Sagradas (Introduzca la letra de su opción en mayusculas, por favor)");
			
			System.out.println("C-> Realizar el calculo Sagrado (Introduzca la letra de su opción en mayusculas, por favor)");
			
			System.out.println("P-> Planos de las pirámides Sagradas (made by Aliens) (Introduzca la letra de su opción en mayusculas, por favor)");
			
			entrar = teclado1.nextLine();
			
			System.out.print("");
		
			switch(entrar) {
		
			case "L":
				
			if(contrepetidor>=1) {
			System.out.println("Usted ya ha hecho este checklist, por favor se le ruega no repetirlo por el bien de la sociedad Egipcia");
			}
				
			System.out.println("A continuacion accederá a un sistema de preguntas sagradas, por favor conteste con cautela");
			Thread.sleep(1000);
			
			System.out.println("¿Cuál es el centro del universo?");
			l1 = teclado.nextLine();
			if(l1.equalsIgnoreCase("Egipto")) {contpreguntas++;}
			System.out.print("");
			
			System.out.println("¿Qué nombre le damos al cielo?");
			l2 = teclado.nextLine();
			if(l2.equalsIgnoreCase("Nut")) {contpreguntas++;}
			System.out.print("");
			
			System.out.println("¿Y al más allá?");
			l3 = teclado.nextLine();
			if(l3.equalsIgnoreCase("Duat")) {contpreguntas++;}
			System.out.print("");
			
			System.out.println("¿Nombre del padre del Rey Dyeser?");
			l4 = teclado.nextLine();
			if(l4.equalsIgnoreCase("Sanajt")) {contpreguntas++;}
			System.out.print("");
			
			System.out.println("¿Sobrenombre del Rey?");
			l5 = teclado.nextLine();
			if(l5.equalsIgnoreCase("Necherjet")) {contpreguntas++;}
			
			if(contpreguntas==5) {
				System.out.println("<------------------------------------------------------------------------------------------------->");
				System.out.println("Usted ha acertado "+contpreguntas+ " Enhorabuena Sabio Imhotep");
			}
			
			if(contpreguntas>=2 && contpreguntas<=4) {
				System.out.println("<------------------------------------------------------------------------------------------------->");
				System.out.println("Usted ha acertado "+contpreguntas+ " Está bien pero debe estudiar más sobre nuestro Imperio Sagrado");
			}
			
			if(contpreguntas<2) {
				System.out.println("<------------------------------------------------------------------------------------------------->");
				System.out.println("Usted ha acertado "+contpreguntas+ " Esto es inaceptable Sabio Imhotep...");
			}
			
			contrepetidor++;
			
			break;
			
			
			
			case "S": 
			System.out.println("Usted ha salido del programa");
			 
			break;
			
			
			
			case "C": 
			
			System.out.println("Ahora vamos a realizar el calculo del area de la Sagrada Pirámide, por favor introduzca los siguientes datos: "); 
			Thread.sleep(1000);
			
			System.out.print("Introduzca la altura: ");
			altura = teclado1.nextInt();
			System.out.print("");
			
			System.out.print("Introduzca la apotema: ");
			apotema = teclado1.nextInt();
			System.out.print("");
			
			calculo=(int) Math.sqrt(Math.pow(altura,2)+Math.pow(apotema,2));
			Thread.sleep(1000);
		
			System.out.println("Su area es de: "+calculo);
		
			case "P" : 
	
			System.out.println("A continuación se le van a mostrar 3 de las maravillas de Egipcio: ");
			Thread.sleep(1000);
			System.out.print("Introduzca la altura que desea que tenga su piramide-> ");
			n = teclado1.nextInt();
			System.out.print("");
			
			for(int i=1; i<=n; i++) {
			System.out.print("\n");
			for(int j=1; j<=n-i; j++) {	
			System.out.print(" ");	
			}
			for(int x=1; x<=(i*2)-1; x++) {	
			System.out.print("*"); 
			}	
			}
				
			System.out.print("\n");
			
			System.out.print("Introduzca la altura que desea que tenga su piramide-> ");
			n1 = teclado1.nextInt();
			System.out.print("");
			
			for(int i=0; i<=n; i++) {
				System.out.print("\n");
			for(int x=0; x<=i; x++) {
				System.out.print("*");
			}
			}
			
			System.out.print("\n");
			
			System.out.print("Introduzca la altura que desea que tenga su piramide-> ");
			n2 = teclado1.nextInt();
			System.out.print("");
			
			for(int i=n2; i>=0; i--) {
				System.out.print("\n");
			for(int x=0; x<=i; x++) {
				System.out.print("*");
			}
			}
		
		    System.out.print("\n");
		
		    break;
		
			}
			}while(!entrar.equalsIgnoreCase("S"));	
			
			
	
		
}
}