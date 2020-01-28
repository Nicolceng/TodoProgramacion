package EjerciciosT4;
import java.util.*;
public class ej8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int n=0;
		System.out.println("Introduzca un numero para saber si es par o divisible entre 5");
		n = teclado.nextInt();
		
		if(n%2==0) {
			System.out.println("Es par");
		}
		
		if(n%5==0 || n%5==5) {
			System.out.println("Es divisible entre 5");
		}
		
	}

}
