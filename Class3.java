package Clases;
public class Class3 
{
	private int largo;
	private int ancho;
	private int alto;
	private int volumen;
  public void IngresoDatos(int largo,int ancho,int alto)
    {
      this.largo= largo;
      this.ancho= ancho;
      this.alto= alto;
    }
  public int Calcular ()
  	{
  	 int volume;
  	 volume = largo * ancho * alto;
  	 return volume;
  	}
  public void Desplegado(int total)
  	{
  	 System.out.println("\nEl Largo es--> "+largo);
  	 System.out.println("El ancho es--> "+ancho);
  	 System.out.println("El alto es--> "+alto);
  	 System.out.println("El volumen es--> "+total);
  	}
}
