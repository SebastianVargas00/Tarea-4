package fachada;

public class Fachada {
	
	private Impresion impresora;
	
	public Fachada(String texto) {
		super();
		impresora= new Impresion();
		impresora.setEstado("Activo");
		impresora.setEmpleado("Sebastian");
		impresora.setTipoempleado("Activo");
		impresora.setTexto(texto);	
	}
	
	public void imprimir() {
		impresora.imprimir();
	}

}
