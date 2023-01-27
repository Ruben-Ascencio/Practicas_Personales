/*
Codigo 5: En Java, implementamos la herencia gracias a la palabra extends, seguido del nombre a la clase para la cual se extiende.
En nuestro ejemplo, tenemos dos clases del cual una de ellas extiende o hereda de otra clase.
En nuestra clase Hijo se puede observar que tenemos la palabra final, con esta palabra indicamos que ninguna clase puede heredar de esta clase.
*/
package Paquete;
public class Herencia{
	public static void main(String args[]){
		Hijo obj1 = new Hijo();
		Hijo obj2 = new Hijo(10);
		Hijo obj3 = new Hijo(10.5348f);
		obj1.test();
	}
}
class Padre{
	public Padre(){System.out.println("Soy el padre");}
	public Padre(int num){System.out.println("El padre tiene: " + num);}
	public Padre(float num){System.out.println("El padre tiene: " + num);}
	public void test(){System.out.println("Padre");}
}
final class Hijo extends Padre{
	public Hijo(){System.out.println("Soy el hijo");}
	public Hijo(int num){super(num); System.out.println("El hijo tiene: " + num);}
	public Hijo(float num){super(num); System.out.println("El hijo tiene: " + num);}
	@Override
	public void test(){System.out.println("Hijo");}
}
/*
 - Hacemos uso de la sobrecarga de constructores, cada constructor recibira un tipo de dato diferente.
 - Posteriormente observamos con la palabra super, nosotros podemos pasarle datos a nuestro constructor padre y al momento de ejecutar, el codigo dentro del constructor padre siempre sera el primer en ejecutarse seguidamente del hijo.
 - La anotacion Override nos permite verificar si la sobrescritura de un metodo es correcto.
*/
