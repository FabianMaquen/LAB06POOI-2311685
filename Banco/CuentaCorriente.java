package Banco;
public class CuentaCorriente extends CuentaBancaria{
	private double tasaInteresAnual = 0.02;
	private final double COMISION_FIJA = 2.0;
	private int maxRetiro;
	
	
	public CuentaCorriente(int maxRetiro) {
		this.maxRetiro = maxRetiro;
	}
	public int getMaxRetiro() {
		return maxRetiro;
	}
	public void setMaxRetiro(int maxRetiro) {
		this.maxRetiro = maxRetiro;
	}

	public void calcularInteresMensual() {
		double interesMensual = (saldoDisponible * tasaInteresAnual) / 12;
        saldoDisponible += interesMensual; 
	}

	@Override
	public String toString() {
		return "\n\nCUENTA CORRIENTE: \nTasaInteresAnual: " + tasaInteresAnual + "\nCOMISION_FIJA: " + COMISION_FIJA + "\nmaxRetiro:" + maxRetiro;
	}
	
}
