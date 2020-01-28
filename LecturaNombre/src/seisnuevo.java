import java.util.Scanner;
public class seisnuevo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int n;
		int cubo;
		System.out.println("introduzca el numero del cual desea hacer el cubo-> ");
		n = teclado.nextInt();
		cubo=n*n*n;
		System.out.println("El resultado es = "+cubo);

	}

}
