package Banco;

import java.time.LocalDate;


public class MovimientoCuenta {
	
	private String numOperacion;
	private String descripcion;
	private LocalDate fecha;
	private Double importe;
	private String tipoOperacion;
	
	
	public MovimientoCuenta(String numOperacion, String descripcion, LocalDate fecha, double importe, String tipoOperacion) {
		this.numOperacion = numOperacion;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.importe = importe;
		this.tipoOperacion = tipoOperacion;
	}

	public String getNumOperacion() {
		return numOperacion;
	}


	public void setNumOperacion(String numOperacion) {
		this.numOperacion = numOperacion;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public Double getImporte() {
		return importe;
	}


	public void setImporte(Double importe) {
		this.importe = importe;
	}


	public String getTipoOperacion() {
		return tipoOperacion;
	}


	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}
	
	
	@Override
	public String toString() {
		return "\nNumero de Operación: " + numOperacion + "\nDescripción: " + descripcion + "\nFecha: " + fecha + "\nImporte: S/" + importe + "\nTipo Operación: " + tipoOperacion + "\n----------------------------";
	}
	
}