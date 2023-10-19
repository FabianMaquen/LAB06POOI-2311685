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
      return this.numOperacion;
   }

   public void setNumOperacion(String numOperacion) {
      this.numOperacion = numOperacion;
   }

   public String getDescripcion() {
      return this.descripcion;
   }

   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }

   public Date getFecha() {
      return this.fecha;
   }

   public void setFecha(Date fecha) {
      this.fecha = fecha;
   }

   public Double getImporte() {
      return this.importe;
   }

   public void setImporte(Double importe) {
      this.importe = importe;
   }

   public String getTipoOperacion() {
      return this.tipoOperacion;
   }

   public void setTipoOperacion(String tipoOperacion) {
      this.tipoOperacion = tipoOperacion;
   }

   public String toString() {
      return "NumOperacion: " + this.numOperacion + "\nDescripcion: " + this.descripcion + "\nFecha: " + this.fecha + "\nImporte:" + this.importe + "\nTipo Operacion:" + this.tipoOperacion;
   }
}
