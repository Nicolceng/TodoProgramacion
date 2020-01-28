package Pruebas;

import javax.swing.JOptionPane;

class pruebalogin {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String texto1="Bienvenido al sistema de login de DAM";
    String texto2="A continuacion introduce tu nombre y apellidos";
    
    JOptionPane.showMessageDialog(null, texto1);
    JOptionPane.showMessageDialog(null, texto2);
  
    
    String teclado=JOptionPane.showInputDialog("Escribe tu nombre");
    System.out.println(teclado);
    String teclado1=JOptionPane.showInputDialog("Escribe tu apellido");
    System.out.println(teclado1);
   
    
    if (teclado.equalsIgnoreCase("Nico") && teclado1.equals("Cirera")) {
      String texto3="¡USUARIO VALIDADO!";
      JOptionPane.showMessageDialog(null, texto3);
    }
  }
}
