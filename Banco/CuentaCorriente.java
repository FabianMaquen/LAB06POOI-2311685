package Banco;
public class CuentaCorriente extends CuentaBancaria{
	private double tasaInteresAnual;
	private final double COMISION_FIJA = 2.0;
	private int maxRetiro;
	
	
	public CuentaCorriente(String numCuenta, String descripcion, String cuentaCCI, Cliente cliente, int maxRetiro) {
		super(numCuenta, descripcion, cuentaCCI, cliente);
		this.maxRetiro = maxRetiro;
	}
	public int getMaxRetiro() {
		return maxRetiro;
	}
	public void setMaxRetiro(int maxRetiro) {
		this.maxRetiro = maxRetiro;
	}
	@Override
	public String toString() {
		return "CuentaCorriente [tasaInteresAnual=" + tasaInteresAnual + ", COMISION_FIJA=" + COMISION_FIJA
				+ ", maxRetiro=" + maxRetiro + "]";
	}
	
	
	
	
	
	
	
}
