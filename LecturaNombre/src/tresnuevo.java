import java.util.Scanner;
public class tresnuevo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Scanner teclado1 = new Scanner (System.in);
		
		int n,n1,operacion,operacion1,operacion2,operacion3;
		System.out.println("Introduzca un numero");
		n = teclado.nextInt();
		System.out.println("Introduzca otro numero");
		n1 = teclado1.nextInt();
		operacion=n+n1;
		operacion1=n-n1;
		operacion2=n*n1;
		operacion3=n/n1;
		System.out.println("La suma da-> "+operacion+ " La resta da-> "+operacion1+ " La multiplicacion da-> " + operacion2+ " Y la division-> "+operacion3);
		
	}

}
