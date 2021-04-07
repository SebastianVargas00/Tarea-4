package fachada;

public class Impresion {
	private String tipoempleado;
	private String empleado;
	private String estado;
	private String texto;
	
	public String getTipoempleado() {
		return tipoempleado;
	}
	public void setTipoempleado(String tipoempleado) {
		this.tipoempleado = tipoempleado;
	}
	public String getEmpleado() {
		return empleado;
	}
	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}
	public String isEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void imprimir() {
		System.out.println("Imprimiendo: "+texto+",Estado: "+estado+ ",Tipoempleado: "+tipoempleado+",Nombre: "+empleado);
	}

}
