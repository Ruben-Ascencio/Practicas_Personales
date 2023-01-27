/*
Código 2: Un bloque estatico es como bien lo dice, un bloque de codigo que se ejecutara una sola vez durante la vida de nuestra clase. Por lo que en nuestro ejemplo, creamos un numero de objetos y veremos como se ejecuto una sola vez este bloque.
*/
package Paquete;
public class BloqueEstatico{
	public static void main(String args[]){
		Estatico obj1 = new Estatico();
		Estatico obj2 = new Estatico();
		Estatico obj3 = new Estatico();
		System.out.println(obj1.getNumero());
		System.out.println(obj2.getNumero());
		System.out.println(obj3.getNumero());
	}
}
class Estatico{
	static int numero = 0;
	static{numero += 10;}
	public int getNumero(){return numero;}
}
