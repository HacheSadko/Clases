package Clases;
import java.util.Scanner;
public class Class6
{
  private String Placa;
  private String Marca;
  private String Origen;
  private String Nombre;
  private final int [] Pagos = new int[6];
  Scanner sc = new Scanner(System.in);
  public void nombreplaca ()
  {
  	System.out.print("\nIngrese su nombre: ");
  	Nombre = sc.nextLine();
  	  System.out.print("\nIngrese la placa de su auto ");
  	Placa = sc.nextLine();
  }
  public void marca ()
  {
   int vali;
  	do
        {
         String Pais="USA";
  	 System.out.print("\nIngrese el origen de su auto:");
  	 Origen = sc.nextLine();
  	 if (Origen.equals("Italia")||Origen.equals("Alemania")
            ||Origen.equals("Japon")||Origen.equals("USA"))
  		vali=0;
  	 else 
            {Origen = " "; vali=1;
            System.out.print("\nSolo: (Alemania, Japon, Italia, USA)");}
        }
        while (vali==1);
  }
  public void pagos ()
  {
  	System.out.print("\nPagos: \n");
  	for (int i=0;i<6;++i) 
        {
  	  System.out.print("Ingrese el pago del "+(++i)+" mes-->");
  	  --i; Pagos[i] = sc.nextInt();
  	}
  }
  public int total ()
  {
  	int sum=0;
  	for (int i=0;i<6;++i)
  		sum += Pagos[i];
  	return sum;
  }
  public double rembolso (int suma)
  {
  	double rem=0;
  	if (Origen.equals("Alemania"))
		rem=suma*.20;
  	if (Origen.equals("Japon"))
		rem=suma*.30;
  	if (Origen.equals("Italia"))
		rem=suma*.15;
  	if (Origen.equals("USA"))
		rem=suma*.8;
	return rem;
  }
  public void desplegado (int suma,double rembol)
  {
  	System.out.print("\nSr."+Nombre+" su carro con placas:"+Placa);
  	System.out.print("\nhecho en "+Origen+" ha pagado en un total");
  	System.out.print("\nde: "+suma+" su rembolso sera de: "+rembol);
  }
}