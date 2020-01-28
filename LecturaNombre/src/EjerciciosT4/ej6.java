package EjerciciosT4;
import java.util.*;
public class ej6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int horas=0,calculo=0,extras=0;
		System.out.println("Introduzca cuantas horas ha trabajado esta semana");
		horas = teclado.nextInt();
		if(horas<=40) {
			calculo=horas*12;
			System.out.println("Usted ha ganado "+calculo+ " Euros esta semana");
		}
		if(horas>40) {
			calculo=(horas*12)+4;
			
			System.out.println("Usted ha ganado "+calculo+ " Euros esta semana");
		}

	}

}
