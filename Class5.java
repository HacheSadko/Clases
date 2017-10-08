package Clases;
import java.util.Scanner;
public class Class5
{
	private String nom;
	private final String [] prod = new String[6];
	private final int [] cost = new int[6];
  public void Nombre()
  {
        Scanner sc = new Scanner(System.in);
  	System.out.print("\nIngrese su nombre: ");
  	nom = sc.nextLine();
  }
  public void Compra()
  {
      Scanner sc = new Scanner(System.in);
  	for (int i=0;i<6;++i) 
  	{
  	  System.out.print("\nIngresa el nombre del "+(++i)+" producto: ");
  	  --i; prod[i] = sc.nextLine();
  	  System.out.print("\nIngresa el precio del producto--> ");
	  cost[i] = sc.nextInt();sc.nextLine();	  
  	}
  }
  public int Suma()
  {
  	int sum=0;
  	for(int i=0;i<6;++i)
  	  sum += cost[i];
  	return sum;
  }
  public int mayo()
  {
        int mayo=0;
  	for (int i=0;i<6;++i) 
  	 if (cost[i]>mayo)
  	  	mayo = cost[i];	
  	return mayo;
  }
  public int meno()
  {
  	int meno=99999;
  	for (int i=0;i<6;++i) 
  	 if (cost[i]<meno)
  	  	meno = cost[i];
  	return meno;	
  } 
  public void Desplegar(int mayor,int menor,int suma)
  {
  	System.out.print("\nSr."+nom+" sus compras fueron: ");
  	System.out.print("\nProducto   Costo\n");
  	for (int i=0;i<6;++i)
  		System.out.println(prod[i]+"\t"+cost[i]);
  	System.out.print("\nEl producto mas caro costo "+mayor);
  	System.out.print("\nEl producto menos caro costo "+menor);
  	System.out.print("\nla suma de todos los productos es "+suma);
  }  
}