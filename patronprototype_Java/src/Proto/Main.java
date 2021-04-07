package Proto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICuenta cuentaAhorro = new ICuenta();
		cuentaAhorro.setMonto(600);
		
		ICuenta cuentaAhorro2 = new ICuenta();
		
		ICuenta cuentaClonada = (ICuenta) cuentaAhorro.clonar();

		System.out.println(cuentaAhorro);
		System.out.println(cuentaClonada);
		System.out.println(cuentaAhorro2);
		
		/*El patron de diseño prototype se usa principalmente para la clonacion de instancia 
		 aqui vemos en este ejemplo como tenemos tres cuentas bancarias , donde las tres son de 
		 tipo ahorro , y le aplicamos un monto a la primera de 600 pesos , la segunda es la 
		 cuenta duplicada donde tiene el mismo monto de la primera aplicamos una interface con 
		 la clase implementada de Cloneable(viene por default en java), tambien implementamos 
		 Clone para que esta se duplique es decir la primera se duplique ,y se reconozca como 
		 la segunda y la tercera tiene el monto por default de 0 pesos 
		 */
		
		
	}

	}
