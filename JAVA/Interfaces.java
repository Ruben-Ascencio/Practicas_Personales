/*
Codigo 8: Una interfaz es un conjunto de metodos abstractos. Su mision es definir el formato que tienen que tener ciertos metodos, de modo que las clases que los van a implementar se ajusten todas al mismo formato. Ademas de metodos abstractos, una interfaz puede contener constantes.
*/
package Paquete;
public class Interfaces{
	public static void main(String args[]){
		Clase objC = new Clase();
		objC.m1(10);
		objC.m2("Soy Ruben Ascencio");
		objC.m3(45.256f);
		objC.suma(10, 20);
		objC.metodoJava();
		InterfazJava8.otroMetodoJava();
	}
}
class Clase implements Interfaz1, Interfaz2, InterfazJava8{
	public void m1(int x){System.out.println("El numero es: " + x);}
	public void m2(String s){System.out.println("La cadena es: " + s);}
	public void m3(float dec){System.out.println("El numero es: " + dec);}
	public void suma(int w, int z){System.out.println("La suma es: " + (w + z));} //Metodo propio
}
interface InterfazJava8{
	default void metodoJava(){System.out.println("En Java 8, nosotros podemos ejecutar codigo dentro de una interfaz");}
	static void otroMetodoJava(){System.out.println("Ahora imprimimos un metodo estatico");}
}
interface Interfaz2{
	void m3(float dec);
}
interface Interfaz1{
	public static int constante1 = 1;
	int constante2 = 2;
	public abstract void m1(int x);
	void m2(String s);
}
/*
Una interfaz puede ser heredada por otra interfaz, además, una interfaz puede heredar multiples interfaces. Cuando una clase implemente una interfaz que hereda otras interfaces, estará obligada a implementar los metodos de todas las interfaces de la jerarquia.
*/
