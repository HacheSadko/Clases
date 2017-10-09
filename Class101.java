package Clases;
import java.util.Scanner;
public class Class101
{
  Scanner sc = new Scanner(System.in);
  public String DCliNom ()
  {
  	String NomCli;
  	System.out.print("Teclea el nombre del cliente:");
  	NomCli = sc.nextLine();
  	return NomCli;
  }
  public String DCliDom ()
  {
  	String Domici;
  	System.out.print("Teclea el Domicilio del cliente:");
  	Domici = sc.nextLine();
  	return Domici;
  }
  public String DCliNum()
  {
  	String Telef;
  	System.out.print("Teclea el numero de telefono:");
  	Telef = sc.nextLine();
  	return Telef;
  }
}