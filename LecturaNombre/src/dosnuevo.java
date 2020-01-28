import java.util.Scanner;
import javax.swing.*;
public class dosnuevo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		double peseta=166.38;
		Scanner teclado = new Scanner (System.in);
		System.out.println(JOptionPane.showInputDialog("Introduzca el numero de euros que quiere transformar->"));
		n = teclado.nextInt();
		peseta=peseta/n;
		System.out.println("Usted tiene " +peseta);
		
	}

}
