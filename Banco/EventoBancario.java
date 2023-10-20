package Banco;
import java.time.LocalDate;

public class EventoBancario {
    private LocalDate fecha;
    private String tituloEvento;
    private String descripcionEvento;

    public EventoBancario(LocalDate fecha, String tituloEvento, String descripcionEvento){
        this.fecha = fecha;
        this.tituloEvento = tituloEvento;
        this.descripcionEvento = descripcionEvento;   
    }
    public LocalDate getFecha(){
        return fecha;
    }
    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }
    public String getTituloEvento(){
        return tituloEvento;
    }
    public void setTituloEvento(String tituloEvento){
        this.tituloEvento = tituloEvento;
    }
    public String getDescripcionEvento(){
        return descripcionEvento;
    }
    public void setDescripcionEvento(String descripcionEvento){
        this.descripcionEvento = descripcionEvento;
    }

    
    @Override
    public String toString() {
        return "Fecha: " + fecha + "\nTitulo del evento: " + tituloEvento + "\nDescripción del evento: " + descripcionEvento;
    }
}
