package EjerciciosT4;
import java.util.*;
public class ej3 {

	public static void main(String[] args) {
		
		 
	       Scanner sc = new Scanner(System.in);
	        int N;
	        System.out.print("Introduzca valor de N: ");
	        N = sc.nextInt();
	        System.out.println("Primera cifra de " + N + " -> " + (N/100));
	        System.out.println("Cifra central de " + N + " -> " + (N/10)%10);
	        System.out.println("Última cifra  de " + N + " -> " + (N%10));

}
}
