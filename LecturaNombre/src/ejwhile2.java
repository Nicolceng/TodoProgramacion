import java.util.Scanner;

public class ejwhile2 {

	public static void main(String[] args) {
		int entrada;
		Scanner teclado = new Scanner (System.in);
		
		do {
			System.out.println("Introduzca un numero par, si introduce uno par el programa parara");
			
			entrada=teclado.nextInt();
		}while(entrada%2==0);
		
		System.out.println("SALUDOS");

	}

}
