package Pruebas;

import java.io.IOException;


public class pruebaexamen {

	public static void main(String[] args) throws IOException, InterruptedException {
		 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		for(int i=0; i<=3; i++) {
			 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("hola");
			 
		}
		

	}

}
