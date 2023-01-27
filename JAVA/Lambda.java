/*Codigo 10: Una expresión lambda es una implementación de una interfaz funcional. Proporciona el código del único método abstracto de la interfaz, a la vez que genera un objeto que implementa la misma.*/
package Paquete;
public class Lambda{
	public static void main(String args[]){
		InterfazA objI1 = dato -> "Ruben Ascencio " + dato;
		InterfazA objI2 = (int numero) -> {numero++; return String.valueOf(numero);};
		System.out.println("La concatenacion es: " + objI1.probamos(14));
		System.out.println("El incremento es: " + objI2.probamos(15));		
		// ------------------ Referenciando a metodos
		InterfazB obj = (a, b)->Math.max(a, b);
		//objeto::metodo o clase::metodo
		InterfazB obj1 = Math::min;
		System.out.println("El numero mayor es: " + obj.numeroMayor(8, 25));
		System.out.println("El numero menor es: " + obj1.numeroMayor(25, 8));
	}
}
interface InterfazA{
	String probamos(int numero);
}
interface InterfazB{
	int numeroMayor(int a, int b);
}
/*
Una interfaz funcional es una interfaz Java que cuenta con un único método abstracto:
 - Una interfaz es funcional, pues incluye un unico metodo abstracto a pesar de contar con un metodo default
 - Una interfaz tambien es funcional, a pesar de tener un metodo estatico, esta cuenta con un metodo abstracto que seria el heredado por el padre
 - La anotacion @FunctionalInterface se emplea para indicar al compilador que estamos ante una interfaz funcional. No es obligatorio pero en caso de que la interfaz no sea funcional, el compilador nos avisara con un error de compilacion
*/
