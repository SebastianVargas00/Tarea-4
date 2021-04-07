package Proto;

public class ICuenta implements CuentaAHImpl {
	
	private String tipo;
	private double monto;

	public ICuenta() {
		tipo = "AHORRO";
	}

	@Override
	public CuentaAHImpl clonar() {
		CuentaAHImpl cuenta = null;

		try {
			cuenta = (CuentaAHImpl) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return cuenta;
	}

	@Override
	public String toString() {
		return "Cuenta Bancaria [tipo=" + tipo + ", monto=" + monto + "]";
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getMonto() {
		return monto;
	}
}
