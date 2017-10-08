package Clases;
public class Main10
{
	public static void main (String args[])
	{
		Class10 Inst = new Class10();
		Class101 Inst2 = new Class101();
		String nom = Inst2.DCliNom();
		String dom = Inst2.DCliDom();
		String num = Inst2.DCliNum();
		int conta = Inst.IngresoDatos();
		Inst.Desplegar(nom, dom, num);
                Inst.Desplegar2(conta);
	}
}