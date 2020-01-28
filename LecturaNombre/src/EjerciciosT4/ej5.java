package EjerciciosT4;
import java.util.*;
public class ej5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int n;
		System.out.println("Introduzca un numero del uno al 7 para decirle que dia de la semana es");
		n = teclado.nextInt();
		if(n==1) {
			System.out.println("Es lunes");
		}
		if(n==2) {
			System.out.println("Es martes");
		}
		if(n==3) {
			System.out.println("Es miercoles");
		}
		if(n==4) {
			System.out.println("Es jueves");
		}
		if(n==5) {
			System.out.println("Es viernes");
		}
		if(n==6) {
			System.out.println("Es sabado");
		}
		if(n==7) {
			System.out.println("Es domingo");
		}

	}

}
