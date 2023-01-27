/*
Codigo 6: Es comun confundir la sobrescritura de metodos con la sobrecarga cuando hay herencia entre clases. En este ejemplo, en la clase hijo, no se sobrescribe el metodo test, sino que lo sobrecarga.
Si nosotros agregaramos la notacion Override, entonces el compilador nos mostraria un mensaje de error.
*/
package Paquete;
public class SEscrituraSCarga{
	public static void main(String args[]){
		ClaseHijo objCH = new ClaseHijo();
		objCH.test(10);
		objCH.test();
	}
}
class ClasePadre{
	public void test(){
		System.out.println("Mensaje del padre");
	}
}
class ClaseHijo extends ClasePadre{
	public void test(int num){
		System.out.println("El numero es: " + num);
	}
}
