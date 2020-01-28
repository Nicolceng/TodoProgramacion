package EjerciciosT4;
import java.util.*;
public class ej4 {

	public static void main(String[] args) {
		int n=0;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Buenas, por favor introduzca la hora");
		n = teclado.nextInt();
		
		if(n>6 && n<13 ) {
			System.out.println("Buenos días");
		}
		
		if(n>13 && n<20 ) {
			System.out.println("Buenas tardes");
		}
		
		if(n>20 || n<6 ) {
			System.out.println("Buenas noches");
		}
		
		
		
		
		
		
		
	}

}
