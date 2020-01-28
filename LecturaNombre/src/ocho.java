import java.util.Scanner;
public class ocho {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int n,total,h=12;
		System.out.println("Introduzca el numero de horas que ha trabajado esta semana-> ");
		n = teclado.nextInt();
		total=n*h;
		System.out.println("Usted ha ganado un total de-> "+total+" Esta semana");

	}

}
