package Clases;
import java.util.Scanner;
public class Class2 
{
	private int largo;
	private int ancho;
	private int alto;
	private int volumen;
  public void IngresoDatos()
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("\ningresa el largo--> ");
     largo = sc.nextInt();
     System.out.print("\ningresa el ancho--> ");
     ancho = sc.nextInt();
     System.out.print("\ningresa el alto--> ");
     alto = sc.nextInt();
    }
  public int Calcular ()
  	{
  	 int volumen;
  	 volumen = largo * ancho * alto;
  	 return volumen;
  	}
  public void Desplegado(int volum)
  	{
  	 System.out.println("\nEl Largo es--> "+largo);
  	 System.out.println("El ancho es--> "+ancho);
  	 System.out.println("El alto es--> "+alto);
  	 System.out.println("El volumen es--> "+volum);
  	}
}
