package Clases;
import java.util.Scanner;
public class Class7
{
  private int Asis;
  private int SueldoD;
  private String nombre;
  private float apagar;
  Scanner sc = new Scanner(System.in);
  public void IngresoDatos ()
  {      
  	System.out.print("\nTecle el nombre del empleado: ");
  	nombre = sc.nextLine();
  	System.out.print("\nEl numero de asistencias es--> ");
  	Asis = sc.nextInt();
  	System.out.print("\nEl sueldo diario del empleado es-->");
	SueldoD = sc.nextInt();  
  }
  public int Calcular ()
  {
  	int sueSem;
  	sueSem = 7*SueldoD;
  	return sueSem;
  }
  public void Desplegado (int sueldo)
  {
  	System.out.println("\nEl empleado "+nombre+" asistio "+Asis);
  	System.out.print(" dias con un sueldo diario de $"+SueldoD);
  	System.out.print("\nCon un sueldo semanal de $"+sueldo);
  }
}