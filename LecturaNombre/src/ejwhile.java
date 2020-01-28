import java.util.Scanner;

public class ejwhile {

	public static void main(String[] args) {
		
		int entrada=1;
		int suma=1;
		Scanner teclado=new Scanner (System.in);
		
		while(entrada>0) {
			System.out.print("Introduzca un numero, para parar introduzca uno negativo->");
			 entrada=teclado.nextInt();
			 suma=suma+entrada;
		   }
		System.out.println("Su total es= "+suma);
		System.out.println("Su programa ha finalizado");

	}

}
