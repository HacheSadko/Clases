package Clases;
public class Main6
{
	public static void main (String args[])
	{
		Class6 Inst = new Class6();
		Inst.nombreplaca();
		Inst.marca();
		Inst.pagos();
		int suma = Inst.total();
		double rembol = Inst.rembolso(suma);
		Inst.desplegado(suma, rembol);
	}
}