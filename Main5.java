package Clases;
public class Main5
{
	public static void main (String args[])
	{
		Class5 Inst = new Class5();
		Inst.Nombre();
		Inst.Compra();
		int suma = Inst.Suma();
		int mayor = Inst.mayo();
		int menor = Inst.meno();
		Inst.Desplegar(mayor, menor, suma);
	}
}