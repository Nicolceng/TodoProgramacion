package ejerciciost5;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		int figura;
	    double base=0;
	    double altura=0;
	    double areac;
	    double radio=0;
	    double areat;
	    
	    Scanner teclado = new Scanner(System.in);
	    Scanner teclado2 = new Scanner(System.in);
	    
	    System.out.println("Escriba 1 para calcular area del triangulo. Escriba 2 para calcular area de circulo");
	    figura = teclado.nextInt();
	    
	    switch(figura) {
	    
	    case 1:
	      
	      System.out.println("Dame la base");
	      base = teclado.nextDouble();
	      
	      System.out.println("Dame la altura");
	      altura = teclado.nextDouble();
	      
	      areat= (base * altura) / 2;
	      
	      System.out.println("El area de su triangulo es: " + areat);
	      
	      break;
	    case 2:
	      
	      System.out.println("Dame el radio");
	      radio = teclado.nextDouble();
	      
	      areac= (3.14) * (radio*radio);
	      
	      System.out.println("El area de su circulo es: " + areac);
	    }

	}

}
