package Banco;
public class CuentaCTS {
	private double tasaInteresAnual = 0.07;
	private double puntos;
	public CuentaCTS(double puntos) {
		super();
		this.puntos = puntos;
	}
	public double getPuntos() {
		return puntos;
	}
	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "CuentaCTS [tasaInteresAnual=" + tasaInteresAnual + ", puntos=" + puntos + "]";
	}
	
	
	
}
