package Banco;
import java.util.Date;

public class MovimientoCuenta {
	
	private String numOperacion;
	private String descripcion;
	private Date fecha;
	private Double importe;
	private String tipoOperacion;
	
	
	public MovimientoCuenta(String numOperacion, String descripcion, Date fecha, double importe, String tipoOperacion) {
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


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
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
		return "NumOperacion: " + numOperacion + "\nDescripcion: " + descripcion + "\nFecha: " + fecha + "\nImporte:" + importe + "\nTipo Operacion:" + tipoOperacion;
	}
	
}
