package Clases;import java.util.Scanner;
public class Main9
{
	public static void main (String args[])
        {
          Scanner sc = new Scanner(System.in);
	  System.out.print("\nTecle el titulo del libro:");
	  String Titulo = sc.nextLine();
	  System.out.print("El autor de la obra es:");
	  String Autor = sc.nextLine();
	  System.out.print("La editorial es:");
	  String Edit = sc.nextLine();
	  System.out.print("El area del libro es:");
	  String Area = sc.nextLine();
	  System.out.print("El costo del libro es de--> ");
	  int Cost = sc.nextInt();
	  	Class9 Inst = new Class9();
	  	Inst.Datos(Titulo, Area, Edit, Autor, Cost);
	  	double apagar =Inst.Calcular();
	  	Inst.Desplegado(apagar);
	}
}