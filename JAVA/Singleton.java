/*
Codigo 4: Un singleton es una clase que solo permite crear una unica instancia de la misma. Es utilizado cuando deseamos evitar que puedan crearse objetos de la clase a traves del operador new.
*/
package Paquete;
public class Singleton{
	public static void main(String args[]){
		SingletonAux objSA1 = SingletonAux.getSingletonAux();
	}
}
class SingletonAux{
	private static SingletonAux objSA;
	private SingletonAux(){}
	public static SingletonAux getSingletonAux(){
		if(objSA == null){objSA = new SingletonAux();}
		return objSA;
	}
}
