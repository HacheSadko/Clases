package Clases;
public class Class9
{
  private String Titulo;
  private String Area;
  private String Edit;
  private String Autor;
  private float Cost;
  public void Datos (String Titulo,String Area,String Edit,String Autor,int Cost)
  {
  	this.Titulo=Titulo;
  	this.Area=Area;
  	this.Edit=Edit;
  	this.Autor=Autor;
  	this.Cost=Cost;
  }
  public double Calcular ()
  {
  	double Desc;
  	if (Edit.equals("limusa"))
  	  Desc=Cost-(Cost*.5);
  	else
  	  if (Edit.equals("mcgraw-hill"))
  	  	Desc=Cost-(Cost*.10);
  	  else
  	  	Desc=Cost-(Cost*.20);
  	return Desc;
  }
  public void Desplegado (double apagar)
  {
  	System.out.print("\nEl libro '"+Titulo+"' del area de ");
  	System.out.print("\n"+Area+" escrito por "+Autor+" y publicado");
  	System.out.print("\npor "+Edit+" por un costo de: "+apagar);
  }
}