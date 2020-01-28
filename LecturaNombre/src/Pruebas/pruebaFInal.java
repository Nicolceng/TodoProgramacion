package Pruebas;

import java.util.Scanner;
import java.lang.*;
public class pruebaFInal {

public static void main(String[] args) throws InterruptedException {
	
	
			System.out.println(" ______ _____ _____ _____ _______ ____  \r\n" + 
					          "|  ____/ ____|_   _|  __ \\__   __/ __ \\ \r\n" + 
					          "| |__ | |  __  | | | |__) | | | | |  | |\r\n" + 
					          "|  __|| | |_ | | | |  ___/  | | | |  | |\r\n" + 
					          "| |___| |__| |_| |_| |      | | | |__| |\r\n" + 
					          "|______\\_____|_____|_|      |_|  \\____/ ");
			Thread.sleep(1000);
			//Al principio como de costumbre en Java, creamos nuestros teclados
			Scanner teclado = new Scanner (System.in);
			Scanner teclado1 = new Scanner (System.in);
			//Introducimos todas las variables que vamos a usar en nuestro código
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
			//comenzamos el codigo con un sencillo sistema de login en el cual el usuario tan solo posee 3 intentos 
			do {
			System.out.print("Introduzca el usuario Gran Sabio Imhotep-> ");
			User = teclado.nextLine();
			System.out.print("");
			System.out.print("Introduzca la contrasennia Gran Sabio Imhotep-> ");
			password = teclado.nextLine();
			System.out.print("");
			cont++;
			//limitamos los intentos con un contador el cual esta configurado en el if de abajo para que cuando sea mayor de 3 el programa se cierre
			if(cont>3) {
				System.out.println("USTED NO ES EL GRAN SABIO, NO PUEDE ACCEDER A LOS ARCHIVOS SAGRADOS");
				System.exit(0);
			}
			
			//aqui declaramos que cuando el user y la password sean sus respectivas correctas combinaciones el user pueda pasar al siguiente menu
			}while(!User.equals("Imhotep") || !password.equals("Saqqara"));
		
			//comenzamos con un do while para que el programa no se cierre hasta que el usuario no teclee S
			do {
			
			System.out.println("-----------------------------------------------");
			System.out.println("S-> Salir del Sistema de archivos Sagrado (Introduzca la letra de su opción en mayusculas, por favor)");
			
			System.out.println("L-> Hacer Checklist de preguntas Sagradas (Introduzca la letra de su opción en mayusculas, por favor)");
			
			System.out.println("C-> Realizar el calculo Sagrado (Introduzca la letra de su opción en mayusculas, por favor)");
			
			System.out.println("P-> Planos de las pirámides Sagradas (made by Aliens) (Introduzca la letra de su opción en mayusculas, por favor)");
			
			entrar = teclado1.nextLine();
			//aqui imprimimos las opciones que posee el usuario para poder usar el programa
			System.out.print("");
			//estas salidas vacias las creamos para poder limpiar el buffer de nuestro teclado
			
			switch(entrar) {
		
			case "L":
			//si el usuario tiene la impertinencia (XD) de usar el checklist dos veces le comento que ya lo ha hecho y que tan solo introduzca 0 para no manipular el contador
			if(contrepetidor>=1) {
			System.out.println("Usted ya ha hecho este checklist, por favor se le ruega no repetirlo por el bien de la sociedad Egipcia, tan solo introduzca 0 hasta cerrar el proceso");
			}
				
			System.out.println("A continuacion accederá a un sistema de preguntas sagradas, por favor conteste con cautela");
			Thread.sleep(1000);
			//hacemos estos sleeps para retrasar el siguiente SYSO un segundo
			System.out.println("¿Cuál es el centro del universo?");
			l1 = teclado.nextLine();
			if(l1.equalsIgnoreCase("Egipto")) {contpreguntas++;}
			System.out.print("");
			//vamos incrementando nuestro contador en caso de que la respuesta sea correcta
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
			//proseguimos incrementando...
			if(contpreguntas==5) {
				System.out.println("<------------------------------------------------------------------------------------------------->");
				System.out.println("Usted ha acertado "+contpreguntas+ " Enhorabuena Sabio Imhotep");
			}
			
			if(contpreguntas>=2 && contpreguntas<=4) {
				System.out.println("<------------------------------------------------------------------------------------------------->");
				System.out.println("Usted ha acertado "+contpreguntas+ " Está bien pero debe estudiar más sobre nuestro Imperio Sagrado");
			}
			//en estas ordenes IF le enviamos un mensaje al user respecto a cuantas ha tenido bien y un mensajito extra...
			if(contpreguntas<2) {
				System.out.println("<------------------------------------------------------------------------------------------------->");
				System.out.println("Usted ha acertado "+contpreguntas+ " Esto es inaceptable Sabio Imhotep...");
			}
			
			contrepetidor++;
			//este es el contador el cual nos dice que el usuario ya ha realizado este test por lo cual se le enviara el mensaje de arriba
			break;
			
			
			
			case "S": 
			//simplemente cerramos este bucle
			System.out.println("Usted ha salido del programa");
			 
			break;
			
			
			
			case "C": 
			//aqui comenzamos con el calculo del area de nuestra piramide, metemos la altura y la apotema
			System.out.println("Ahora vamos a realizar el calculo del area de la Sagrada Pirámide, por favor introduzca los siguientes datos: "); 
			Thread.sleep(1000);
			
			System.out.print("Introduzca la altura: ");
			altura = teclado1.nextInt();
			System.out.print("");
			//seguimos limpiando el buffer para que no se nos machaquen los datos...
			System.out.print("Introduzca la apotema: ");
			apotema = teclado1.nextInt();
			System.out.print("");
			//este es el calculo el cual tira de la clase math, que con sqrt nos permite hacer la raiz del calculo que hay dentro el cual es una suma con dos potencias
			calculo=(int) Math.sqrt(Math.pow(altura,2)+Math.pow(apotema,2));
			Thread.sleep(1000);
		
			System.out.println("Su area es de: "+calculo);
			System.out.println("<------------------------------------------------->");
			break;
			
			
			
			case "P" : 
			//con P comenzamos el ciclo de las piramides, donde vamos a ir pidiendo al usuario la altura de la misma
			System.out.println("A continuación se le van a mostrar 3 de las maravillas de Egipcio: ");
			Thread.sleep(1000);
			System.out.print("Introduzca la altura que desea que tenga su piramide-> ");
			n = teclado1.nextInt();
			System.out.print("");
			//aquí imprimimos la primera de ellas, la cual es la original...
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
			//salto de linea para que no choquen las piramides
			System.out.print("Introduzca la altura que desea que tenga su piramide-> ");
			n1 = teclado1.nextInt();
			System.out.print("");
			//la segunda piramide escalera normal..
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
			//Y aquí la última piramide, la escalera inversa.
			for(int i=n2; i>=0; i--) {
				System.out.print("\n");
			for(int x=0; x<=i; x++) {
				System.out.print("*");
			}
			}
		
		    System.out.print("\n");
		
		    break;
		
			}//aqui ponemos la condicion del while para que se cierre el bucle while y el programa termine.... o no....
			}while(!entrar.equalsIgnoreCase("S"));	
			//Easter egg
			System.out.println("Por último adoremos a los ... Constructores.....");
			for(int i=0; i<=100; i++) {
				Thread.sleep(12);
				System.out.println(i+"%");
			}
			
			System.out.println(" "
					+ "      _..._\r\n" + 
					"     .'     '.\r\n" + 
					"    /`\\     /`\\    |\\\r\n" + 
					"   (__|     |__)|\\  \\\\  /|\r\n" + 
					"   (     \"     ) \\\\ || //\r\n" + 
					"    \\         /   \\\\||//\r\n" + 
					"     \\   _   /  |\\|`  /\r\n" + 
					"      '.___.'   \\____/\r\n" + 
					"       (___)    (___)\r\n" + 
					"     /`     `\\  / /\r\n" + 
					"    |         \\/ /\r\n" + 
					"    | |     |\\  /\r\n" + 
					"    | |     | \"`\r\n" + 
					"    | |     |\r\n" + 
					"    | |     |\r\n" + 
					"    |_|_____|\r\n" + 
					"   (___)_____)\r\n" + 
					"   /    \\   |\r\n" + 
					"  /   |\\|   |\r\n" + 
					" //||\\\\  Y  |\r\n" + 
					"|| || \\\\ |  |\r\n" + 
					"|/ \\\\ |\\||  |\r\n" + 
					"    \\||__|__|\r\n" + 
					"     (___|___)\r\n" + 
					"     /   A   \\\r\n" + 
					"    /   / \\   \\\r\n" + 
					"   \\___/   \\___/");
			
	
		
}
}
		

		





