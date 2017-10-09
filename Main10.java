package Clases;
import java.util.Scanner;
public class Main10
{
	public static void main (String args[])
	{
		Class10 Inst = new Class10();//Metodos
		Class101 Inst2 = new Class101();
		String nom = Inst2.DCliNom();
		String dom = Inst2.DCliDom();
		String num = Inst2.DCliNum();//
		Scanner sc = new Scanner(System.in); //variables
  		char val='s';int opc = 0,conta=0;
  		String [] NomProd = new String[10];
		int Clave=0;
		int [] CostU = new int[10];
		int [] Cant = new int[10];//
		System.out.print("Teclea la clave:");
		Clave = sc.nextInt();
  		while(val=='s')//Menu ingreso datos
  		{
  	 	 for (int i=0;i<10;++i) 
  	 	 {
  	 	 	System.out.println("\n1)\tClavo\t\tkg\t100");		 	 	
  	 	 	System.out.println("2)\tTornillo\tkg\t110");  
  		  	System.out.println("3)\tBisagra\t\tPza\t120");  
  	 	 	System.out.println("4)\tPinzas\t\tPza\t130");
  			System.out.println("5)\tDesarmador\tPza\t140");
  			System.out.println("Teclea la opcion deseada");
  			opc = sc.nextInt();
  			if (opc==1)
  				{NomProd[i]="Clavo";CostU[i]=100;
  		Inst.IngresoDatos1(NomProd[i],i);Inst.IngresoDatos3(CostU[i],i);}
  			if (opc==2)
  				{NomProd[i]="Torni";CostU[i]=110;
  		Inst.IngresoDatos1(NomProd[i],i);Inst.IngresoDatos3(CostU[i],i);}
  	 	 	if (opc==3)
  	 	 		{NomProd[i]="Bisagra";CostU[i]=120;
  	 	Inst.IngresoDatos1(NomProd[i],i);Inst.IngresoDatos3(CostU[i],i);}
  	 	 	if (opc==4)
  	 	 		{NomProd[i]="Pinzas";CostU[i]=130;
  	 	Inst.IngresoDatos1(NomProd[i],i);Inst.IngresoDatos3(CostU[i],i);}
  	 	 	if (opc==5)	
  	 	 		{NomProd[i]="Desarma";CostU[i]=140;
  	 	Inst.IngresoDatos1(NomProd[i],i);Inst.IngresoDatos3(CostU[i],i);}
  	 	 	System.out.println("Teclea la cantidad");conta++;
  	 	 	Cant[i]=sc.nextInt();Inst.IngresoDatos2(Cant[i], Clave,i);
  	 	 	System.out.print("¿Mas productos?(s/n)");
  		  	val = sc.next().charAt(0);sc.nextLine();
     	   if (val=='n')
     	     break;
     	 }
   		}//
		Inst.Desplegar(nom, dom, num);//metodos
        Inst.Desplegar2(conta);
	}
}