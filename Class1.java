package Clases;
import java.util.Scanner;
public class Class1
{
    private String nombre;
    private String puesto;
    private final  int [] sueldo = new int[6];
  public void IngresoDatos ()
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nTeclea el nombre del empleado: ");
    nombre = sc.nextLine();
    System.out.print("\nTeclea el puesto del empleado: ");
    puesto = sc.nextLine();
    System.out.println("\n");
    for (int i=0;i<6;++i)
       {
        System.out.print("Ingresa el sueldo del "+(++i)+" mes--> ");
        --i; sueldo[i]= sc.nextInt(); 
       }
    }
  public int Calcular()
    {
    int sum = 0;    
    for (int i=0;i<6;i++) 
       sum += sueldo[i];
    return sum;        
    }
  public void Desplegado (int suma)
    {
    System.out.println("\nSr."+nombre+"\n"+puesto);
    System.out.println("El total de su sueldo es: "+suma);    
    }    
} 
