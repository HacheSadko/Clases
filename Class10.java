package Clases;
public class Class10
{
  private final String [] NomProd = new String[10];
  private int Clave = 0;
  private final int [] CostU = new int[10];
  private final int [] Cant = new int[10];
  public void IngresoDatos1 (String NomProd, int i)
  {
     this.NomProd[i]=NomProd;
  }
  public void IngresoDatos2 (int Cant, int Clave, int i)
  {
    this.Cant[i]=Cant;
     this.Clave=Clave;
  }
  public void IngresoDatos3 (int CostU, int i)
  {
     this.CostU[i]=CostU;  
  }
  public void Desplegar (String nom,String dom,String num)
  {
   System.out.println("\nSr."+nom+"\nDomicilio:"+dom+"\nTelefono:"+num);
   System.out.print("Clave:"+Clave+"\nSus productos son:\n");
  }
  public void Desplegar2 (int conta)
  {
  int multi=0;String peso; 
      System.out.print("\nProduc.\tUnidad\tCantidad Costo\tTotal");
    for (int i=0;i<conta;++i) 
    {
      if(NomProd[i].equals("Clavo")||NomProd[i].equals("Torni"))
        peso="kg";
      else
        peso="Pza";
      System.out.print("\n"+NomProd[i]+"\t"+peso+"\t"+Cant[i]+
                     "\t$"+CostU[i]+"\t$"+(Cant[i]*CostU[i]));
      multi+=(Cant[i]*CostU[i]);
    }
    System.out.println("\nTotal\t\t\t\t$"+multi);
  }
}