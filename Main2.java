package Clases;
public class Main2 
{
    public static void main(String[] args)
    {
       Class2 Inst = new Class2();
       Inst.IngresoDatos();
       int volum = Inst.Calcular();
       Inst.Desplegado(volum);
    }  
}