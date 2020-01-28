package ejerciciost5;
import java.util.Scanner;
public class ej3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Scanner teclado1 = new Scanner (System.in);
		Scanner teclado2 = new Scanner (System.in);
		int n1,n2,n3,medio,mayor,menor;
		System.out.println("Introduzca n1");
		n1 = teclado.nextInt();
		System.out.println("Introduzca n2");
		n2 = teclado1.nextInt();
		System.out.println("Introduzca n3");
		n3 = teclado2.nextInt();
		
		if (n1>n2 && n1>n3) {
		      mayor = n1;
		    } else if (n2>n1 && n2>n3) {
		      mayor = n2;
		    } else {
		      mayor = n3;
		    }
		    
		    if (n1<n2 && n1<n3) {
		      menor = n1;
		    } else if (n2<n1 && n2<n3) {
		      menor = n2;
		    } else {
		      menor = n3;
		    }
		    
		    medio = (n1+n2+n3) - (mayor+menor);
		    System.out.println("Menor = " + menor );
		    System.out.println("Medio = " + medio );
		    System.out.println("Mayor = " + mayor );

	}

}
