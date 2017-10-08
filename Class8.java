package Clases;
public class Class8
{
  private int Asis;
  private int SueldoD;
  private String nombre;
  private float apagar;
  public void IngresoDatos (String nombre,int Asis,int SueldoD)
  {
  	this.nombre = nombre;
  	this.Asis = Asis;
	  this.SueldoD = SueldoD;
  }
  public int Calcular ()
  {
  	int Total;
  	Total = Asis*SueldoD;
  	return Total;
  }
  public void Desplegado (int sueldo)
  {
  	System.out.println("\nEl empleado "+nombre+"asistio "+Asis);
  	System.out.print(" dias con un sueldo diario de $"+SueldoD);
  	System.out.print("\nCon un sueldo semanal de $"+sueldo);
  }
}