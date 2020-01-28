import java.util.Scanner;
public class sistenuevo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float factura;
		float base,total;
		System.out.println("Introduzca el dinero sin la base imponible aplcada-> ");
		factura = teclado.nextInt();
		base=(float) (factura*0.21);
		System.out.println("Se le debe aplicar este dinero-> "+base);
		total=base+factura;
		System.out.println("Esto hace un total de-> "+total);
		

	}

}
