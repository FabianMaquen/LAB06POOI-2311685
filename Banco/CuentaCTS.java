package Banco;
public class CuentaCTS extends CuentaBancaria {
	private double tasaInteresAnual = 0.07;
	private double puntos;


	public CuentaCTS(double puntos) {
		this.puntos = puntos;
	}
	public double getPuntos() {
		return puntos;
	}
	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}

	public void calcularInteresMensual() {
		double interesMensual = (saldoDisponible * tasaInteresAnual) / 12;
        saldoDisponible += interesMensual; 
	}

	@Override
	public String toString() {
		return super.toString() + "CuentaCTS [tasaInteresAnual=" + tasaInteresAnual + ", puntos=" + puntos + "]";
	}
	
}
