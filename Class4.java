package Clases;
import java.util.Scanner;
public class Class4
{
    private String nombre;
    private final float local = 0.20f;
    private final float naci = 0.50f;
    private final float inter = 0.80f;
    private int total;
    Scanner sc = new Scanner(System.in);
  public void IngresoNom()
  {
  	System.out.println("Ingresa tu nombre: ");
  	nombre = sc.nextLine();
  }
  public void Calcular()
  {
  	char opc = 's';
  	int llam=0,tiempo=0;
  	float costo=0;
  	while (opc == 's') 
  	{
  		System.out.print("___________________________________________");
  		System.out.println("\nTeclea la opcion deseada");
  		System.out.println("1.- Local");
  		System.out.println("2.-Nacional");
  		System.out.println("3.-Internacional");
  		System.out.print("4.-Salir\n");
  		System.out.print("--> ");
  		llam = sc.nextInt();
  		System.out.print("___________________________________________");
  		if (llam == 1)
  			{System.out.println("\nTeclea la duracion de la llamada:");
  		    tiempo = sc.nextInt();
  			costo=tiempo*local;
  			System.out.println("El costo es: $"+costo);
  			total += costo;}
  		if (llam == 2)
  			{System.out.println("\nTeclea la duracion de la llamada:");
  		    tiempo = sc.nextInt();
  			costo=tiempo*naci;
  			System.out.println("El costo es: $"+costo);
  			total += costo;}
  		if (llam == 3)
  			{System.out.println("\nTeclea la duracion de la llamada:");
  		    tiempo = sc.nextInt();
  			costo=tiempo*inter;
  			System.out.println("El costo es: $"+costo);
  			total += costo;}
  		if (llam == 4)
  			opc = 'n';
  	}
  }
  public void Desplegado()
  {
  	System.out.println("\nSr."+nombre+" el total a pagar es: $"+total);
  }
}