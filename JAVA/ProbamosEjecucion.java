/*
Codigo 1:
	- Recordamos lo basico en Java, como compilar y ejecutar el codigo en consola.
	- Imprimir valores en diferentes bases.
	- Operacion ternaria
	- Array irregular
*/
package Paquete;
public class ProbamosEjecucion{
	public static void main(String args[]){
		System.out.println(args[0]);
		System.out.println(0431);	//Imprimimos un numero en base 8
		System.out.println(0xef34);	//Imprimimos un numero en base 16
		System.out.println(0b100110);	//Imprimimos un numero en base 2
		System.out.println(520_000);	//Imprime 520000, el guion es permitido
		String var = (50_000 < 200_000) ? "Verdadero" : "Falso";	//Operador ternario
		System.out.println(var);
		//int array[][]=new int[5][]; Array irregular, parecido a una matriz dinamica en c
		//for(int varia:array) Ciclo For each
	}
}
/*
Compilamos:
- Dentro de un paquete: javac -d . (Nombre del archivo).java
- Fuera de un paquete: javac (Nombre del archivo).java
Ejecutamos:
- Dentro de un paquete: java (Nombre del paquete).(Nombre del archivo) args1 "Cadena (args2)"...
- Fuera de un paquete: java (Nombre del archivo) args1 "Cadena (args2)" ...
*/
