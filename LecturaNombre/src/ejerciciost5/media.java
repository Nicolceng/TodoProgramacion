package ejerciciost5;
import java.util.*;
public class media {

	public static void main(String[] args) {
		
		int nota1=0, nota2=0, operacion=0;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduzca su primera nota: ");
		nota1 = teclado.nextInt();
		System.out.print("Introduzca su segunda nota: ");
		nota2 = teclado.nextInt();
		operacion=(nota1+nota2)/2;
		if(operacion>=5) {
			System.out.println("Su nota es apta");
		}else {
			System.out.println("Su nota no es apta");
		}
		
		

	}

}
