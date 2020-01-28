import java.util.*;
public class ej4 {

	public static void main(String[] args) {
		String dias[]= {"Lunes","Martes","Miercoles"};
		int horas[]= {8,9,10,11,12,13,14};
		String asignaturas1[] = {"sistemas","sistemas","fol","recreo","bbdd","bbdd","bbdd"};
		String asignaturas2[] = {"entorno","entorno","programacion","recreo","programacion","lenguaje","lenguaje"};
		String asignaturas3[] = {"sistemas","sistemas","bbdd","recreo","bbdd","fol","fol"};
		for(int i=0; i<=2; i++) {
			
			System.out.print("               "+dias[i]);
			
			
		}
		
		System.out.print("\n");
		System.out.println();
		for(int x=0; x<=6; x++) {
			
			System.out.print(horas[x]+ "->");
			System.out.print("\t     " + asignaturas1[x]);
			System.out.print("        \t" + asignaturas2[x]);
			System.out.println("          \t" + asignaturas3[x]);
			
		}
		

	}

}
