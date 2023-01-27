/*
Codigo 3: Un bloque de inicializacion de instancia, es un bloque de codigo el cual se ejecutara antes de que se ejecute nuestro constructor. Es sabido que cuando creamos un objeto, el constructor dentro de la clase de este objeto, sera el primero en ejecutarse.
*/
package Paquete;
public class BloqueDeInicializacion{
	public static void main(String args[]){
		Bloque obj1 = new Bloque();
		Bloque obj2 = new Bloque();
	}
}
class Bloque{
	{System.out.println("Se ejecuta este mensaje antes del constructor.");}
	public Bloque(){System.out.println("Ejecutamos el constructor");}
}
