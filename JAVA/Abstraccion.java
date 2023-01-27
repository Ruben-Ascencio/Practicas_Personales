/*
Codigo 7: La abstraccion, es una clase que cuenta, al menos, con un método abstracto. Un método abstracto es aquel que está declarado en la clase pero no implementado. Su objetivo es proporcionar un formato de método determinado, para que sean las subclases las que se encarguen de darle cuerpo a través de la sobrescritura.
En pocas palabras, los métodos abstractos es forzar a que todas las subclases tengan el mismo formato de método. Al definir un método como abstracto, obligamos a todas las subclases a que lo sobrescriban y, por tanto, respeten el mismo formato definido en la clase padre.
*/
package Paquete;
public class Abstraccion{
	public static void main(String args[]){
		//Clase1 objC = new Clase1(); Error de compilacion
		//Clase2 objC = new Clase2(); Error de compilacion
		Cuadrado objC = new Cuadrado("Azul", 6);
		Triangulo objT = new Triangulo("Verde", 3, 5);
		System.out.println("Cuadrado: " + objC.calculoArea());
		System.out.println("Triangulo: " + objT.calculoArea());
		
		//IMPLEMENTANDO POLIMORFISMO
		System.out.println("\n-> USANDO POLIMORFISMO <-");
		Figura poliMorfismo;
		poliMorfismo = new Cuadrado("Amarillo", 9);
		System.out.println("Cuadrado: " + poliMorfismo.calculoArea());
		poliMorfismo = new Triangulo("Rojo", 8, 4);
		System.out.println("Triangulo: " + poliMorfismo.calculoArea());
		
		//OTRA MANERA DE IMPLEMENTAR POLIMORFISMO
		System.out.println("\n-> USANDO POLIMORFISMO DE OTRA MANERA <-");
		mostramos(new Triangulo("Blanco", 5, 10));
		mostramos(new Cuadrado("Negro", 10));
	}
	public static void mostramos(Figura obj){
		System.out.println("Area: " + obj.calculoArea());
	}
}
//Ejemplos de clases abstractas
abstract class Ejemplo1{public void metodo1(){}}
abstract class Ejemplo2{public abstract int metodo1();}
//-----------------------------
abstract class Figura{
	private String color;
	public Figura(String color){this.color = color;}
	public abstract double calculoArea();
}
class Cuadrado extends Figura{
	private int lado;
	public Cuadrado(String color, int lado){
		super(color);
		this.lado = lado;
	}
	public double calculoArea(){return lado*lado;}
}
class Triangulo extends Figura{
	private int base, altura;
	public Triangulo(String color, int base, int altura){
		super(color);
		this.base = base;
		this.altura = altura;
	}
	public double calculoArea(){return (float)base*(float)altura/2;}
}
/*
 - No es posible crear objetos de una clase abstracta.
 - Una clase puede declararse como abstract aunque no tenga metodos abstractos. (Ejemplo1)
 - Una clase que herede una clase abstracta está obligada a sobrescribir los métodos abstractos heredados (o declararse también como abstract).
 - Además de métodos abstractos, las clases abstractas pueden incluir atributos, constructores y métodos estándares. Aunque no se puedan crear objetos de una clase abstracta, tiene sentido que puedan contar con constructores, los cuales se ejecutarán durante la herencia de la clase abstracta.
*/
