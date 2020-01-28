package EjerciciosT4;
import java.util.*;
public class ej7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Scanner teclado1 = new Scanner (System.in);
		int horas=0; int min = 0,calculo=0,calculo1=0,calculo2=0,calculo3=0,calculototal=0;
		int medianoche=12*3600;
		System.out.print("Introduzca que hora es-> ");
		horas = teclado.nextInt();
		System.out.print("Introduzca que minuto es-> ");
		min = teclado1.nextInt();
		
		calculo=horas*3600;
		calculo1=min*60;
		calculo2=calculo+calculo1;
		calculo3=medianoche-calculo2;
		
		System.out.println("le faltan "+calculo3+ " Segundos para llegar");
		

	}

}
