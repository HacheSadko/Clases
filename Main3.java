package Clases;
import java.util.Scanner;
public class Main3 
{
    public static void main(String[] args)
    {
   	 Scanner sc = new Scanner(System.in);
     System.out.print("\ningresa el largo--> ");
     int largo = sc.nextShort();
     System.out.print("\ningresa el ancho--> ");
     int ancho = sc.nextShort();
     System.out.print("\ningresa el alto--> ");
     int alto = sc.nextShort();       
       Class3 Inst = new Class3();
       Inst.IngresoDatos(largo, ancho, alto);
       int total = Inst.Calcular();
       Inst.Desplegado(total);
    }  
}