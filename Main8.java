package Clases;
import java.util.Scanner;
public class Main8
{
	public static void main (String args[])
	{
          Scanner sc = new Scanner(System.in);
	  System.out.print("\nTecle el nombre del empleado: ");
  	  String nombre = sc.nextLine();
  	  System.out.print("\nEl numero de asistencias es--> ");
  	  int Asis = sc.nextInt();
  	  System.out.print("\nEl sueldo diario del empleado es-->");
	  int SueldoD = sc.nextInt();  
		Class8 Inst = new Class8();
		Inst.IngresoDatos(nombre, Asis, SueldoD);
		int sueldo = Inst.Calcular();
		Inst.Desplegado(sueldo);		
	}
}