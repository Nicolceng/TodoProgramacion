import java.util.Scanner;
public class nuevoonce {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		Scanner teclado1 = new Scanner (System.in);
		float n=0,n1=0,deseada=0,operar=0,ultima=0;
		System.out.println("Introduzca la primera nota");
		n = teclado.nextInt();
		n=(int) (n*0.4);
		System.out.println("Que desea sacar");
		deseada = teclado1.nextInt();
		operar=deseada-n;
		n1= (float) (operar/0.6);
		System.out.println("Para sacar un "+deseada+" necesitas sacar un "+n1+" en el segundo examen");
	}

}
