import java.util.Scanner;
public class nueve {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Scanner teclado1 = new Scanner (System.in);
		Scanner teclado2 = new Scanner (System.in);
		
		int elegir = 0;
		double kb,mb,ojo1,ojo2;
		do {
			System.out.println("1.KB to MB");
			System.out.println("2.MB to KB");
			System.out.println("3.END PROGRAM");
			elegir = teclado.nextInt();
			switch(elegir) {
			case 1:
			System.out.println("Introduzca cuantos kb quiere transformar");
			ojo1 = teclado1.nextInt();
			kb=(int) (ojo1*0.001);
			System.out.println("Su total en MB es-> "+kb);
			break;
			case 2: 
			System.out.println("Introduzca los MB que quiere transformar");
			ojo2 = teclado2.nextInt();
			mb=ojo2*1024;
			System.out.println("Su total en KB es-> "+mb);
			break;
			case 3:System.out.println("FIN");
					
			}
			
			
		}while(elegir!=3);
			
			

	}

}
