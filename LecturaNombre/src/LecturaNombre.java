import java.util.*;

public class LecturaNombre {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String lectura,Salami="bien",legumbre="mal";
		
		System.out.println("Dime tu nombre");
		lectura = teclado.nextLine();
		System.out.println("Hola " + lectura + " Como has estado");
		lectura = teclado.nextLine();
		
		if(lectura.equalsIgnoreCase(Salami)){
		
			System.out.println("Me alegro");
			
		}
		
		if(lectura.equalsIgnoreCase(legumbre)) {
			
			System.out.println("Ok");
			
		}
}
}

