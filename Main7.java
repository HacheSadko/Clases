package Clases;
public class Main7
{
	public static void main (String args[])
	{
		Class7 Inst = new Class7();
		Inst.IngresoDatos();
		int sueldo = Inst.Calcular();
		Inst.Desplegado(sueldo);
		
	}
}