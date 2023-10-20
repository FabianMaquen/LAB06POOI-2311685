package Banco;

import java.util.List;

public class Cliente {
    private String idCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private int dni;
    private List<CuentaBancaria> cuentas;
    private List<EventoBancario> eventoBancarios;

    public Cliente (String idCliente, String nombre, String apellido, String direccion, int telefono, int dni){
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
    }

    public String getIdCliente(){
        return idCliente;
    }

    public void setIdCliente(String idCliente){
        this.idCliente = idCliente;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public int getTelefono(){
        return telefono;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getDni(){
        return dni;
    }

    public void setDni(int dni){
        this.dni = dni;
    }

    public List<CuentaBancaria> getCuentas(){
        return cuentas;
    }

    public void setCuentas(List<CuentaBancaria> cuentas){
        this.cuentas = cuentas;
    }

    public List<EventoBancario> getEventoBancarios() {
        return eventoBancarios;
    }

    public void setEventoBancarios(List<EventoBancario> eventoBancarios) {
        this.eventoBancarios = eventoBancarios;
    }
    
    
    @Override
    public String toString() {
        return "ID del cliente: " + idCliente+ "\nNombre: " + nombre + "\nApellido: " + apellido + "\nDirección: " + direccion + "\nTelefono: " + telefono + "\nDNI: " + dni + "\nCuenta Bancaria: " + cuentas + "\nEvento Bancario: " + eventoBancarios;
    }

}
