package Clases;
import java.util.Scanner;
public class Class10
{
  private final String [] NomProd = new String[10];
  private final int [] Clave = new int[10];
  private final int [] CostU = new int[10];
  private final int [] Cant = new int[10];   
  public int IngresoDatos ()
  {
   Scanner sc = new Scanner(System.in); 
  	char val='Y';
        int cont = 0;
  	while(val=='Y')
  	{
  	  for (int i=0;i<10;++i) 
  	  {
  	  	System.out.print("\nTeclea nombre del "+(++i)+" producto:");	
  	  	--i; NomProd[i] = sc.nextLine();
  	  	System.out.print("Teclea la clave del producto:");
  	  	Clave[i] = sc.nextInt();
  	  	System.out.print("Teclaa la cantidad de productos:");
  	  	Cant[i] = sc.nextInt();
  	  	System.out.print("Teclea el precio unitario por producto:");
  	  	CostU[i] = sc.nextInt();++cont;
  	  	System.out.print("¿Mas productos?(Y/N)");
  	  	val = sc.next().charAt(0);sc.nextLine();
                if (val=='N')
                    break;
  	  }
  	}
	return cont;	
  }
    public void Desplegar (String nom,String dom,String num)
  {
   System.out.println("\nSr."+nom+"\nDomicilio:"+dom+"\nTelefono:"+num);
   System.out.println("Sus productos son:\n");
  }
    public void Desplegar2 (int conta)
    {   
     for (int i=0;i<conta;++i) 
     {
   	System.out.println("\n"+NomProd[i]+"("+Clave[i]+")");
   	System.out.print("Numero de productos: "+Cant[i]);
   	System.out.print("\nPrecio por producto: "+CostU[i]); 
     }
    }
}