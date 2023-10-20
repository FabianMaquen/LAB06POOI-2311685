package Banco;

import java.util.List;

public class CuentaBancaria {
    private String numeroCuenta;
    private String descripcionCuenta;
    private String cuentaCCI;
    protected double saldoDisponible = 0;
    private List<MovimientoCuenta> movimientos;
    private String estado;  // Variables constantes: Restringido, Bloqueado y Activo

    public CuentaBancaria(){

    }
    
    public CuentaBancaria(String numCuenta, String descripcion, String cuentaCCI, Cliente cliente) {
        this.numeroCuenta = numCuenta;
        this.descripcionCuenta = descripcion;
        this.cuentaCCI = cuentaCCI;
        // Asignar el parametro cliente a clase Cliente
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void setNumeroCuenta(String numCuenta) {
        this.numeroCuenta = numCuenta;
    }
    
    public String getDescripcionCuenta() {
        return descripcionCuenta;
    }
    
    public void setDescripcionCuenta(String descripcion) {
        this.descripcionCuenta = descripcion;
    }
    
    public String getCuentaCCI() {
        return cuentaCCI;
    }
    
    public void setCuentaCCI(String cci) {
        this.cuentaCCI = cci;
    }
    
    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldo) {
        this.saldoDisponible = saldo;
    }
    
    public void setMovimientos(List<MovimientoCuenta> movimientos) {
        this.movimientos = movimientos;
    }

    public List<MovimientoCuenta> getMovimientos() {
        return movimientos;
    }
    
    public void calcularInteresMensual(){
        double interesMensual = 0;
        saldoDisponible += interesMensual;  
    };

    @Override
    public String toString() {
        return "\n\nCUENTA BANCARIA:\nnumeroCuenta: " + numeroCuenta + "\nDescripcionCuenta: " + descripcionCuenta + "\nCuentaCCI: " + cuentaCCI + "\nSaldoDisponible: " + saldoDisponible;
    }
    
    
}
