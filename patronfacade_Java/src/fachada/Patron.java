package fachada;

public class Patron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fachada facade =new Fachada("texto 1");
		facade.imprimir();
		Fachada f2= new Fachada("texto 2");
		f2.imprimir();
		Fachada f3= new Fachada("texto 3");
		f3.imprimir();
		
		/*El patron facade(fachada) reduce la complejidad de un sistema creando una clase 
		fachada en este ejemplo la clase es Fachada la cual relaciona los subsistemas el cual
		es Impresion , de esta manera se estructura un entorno mas sencillo desde el punto de
		vista del cliente*/

	}

}
