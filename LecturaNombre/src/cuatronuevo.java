import java.util.Scanner;
public class cuatronuevo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		Scanner teclado1 = new Scanner (System.in);
		int lado1,lado2,operacion;
		System.out.print("Introduzca un lado del rectangulo-> ");
		lado1 = teclado.nextInt();
		System.out.print("Introduzca el otro lado-> ");
		lado2 = teclado1.nextInt();
		operacion=lado1*lado2;
		System.out.println("Su area es = "+operacion);

	}

}
