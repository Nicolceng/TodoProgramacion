package EjerciciosT4;
import java.util.*;
import java.lang.Math; 
public class ej9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float n; 
		
		int captar; 
		System.out.println("Introduzca un numero con decimales");
		n = teclado.nextFloat();
		captar = (int) Math.round(n); 
		System.out.println("El valor double es "+n+", redondeado con Math.round() es "+captar);
	}

}
