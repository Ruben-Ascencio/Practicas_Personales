/*Codigo 9: Manejo de excepciones.*/
package Paquete;
import java.util.Scanner;
public class Excepciones{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		int a, b;
		try{
			System.out.println("Introduzca un numero: ");
			a = obj.nextInt();
			System.out.println("Introduzca otro numero: ");
			b = obj.nextInt();
			System.out.println("La suma es: " + (a + b));
			System.out.println("La resta es: " + (a - b));
			System.out.println("La multiplicacion es: " + (a * b));
			System.out.println("La division es: " + (a / b));
		}catch(ArithmeticException ex){System.out.println("No se puede realizar esa operacion");}
		catch(Exception e){System.out.println("Introduzca solamente numeros");}		
	}
}
