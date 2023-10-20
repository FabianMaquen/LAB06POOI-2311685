package Banco;

import java.util.Arrays;

public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteresAnual = 0.03;
    private String[] beneficios;


    public CuentaAhorro(){

    }

    public CuentaAhorro(double tasaInteresAnual, String[] beneficios){
        this.tasaInteresAnual = tasaInteresAnual;
        this.beneficios = beneficios;
    }


    public void setCuentaAhorro(double cuentaahorro){

    }

    public String[] getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String[] beneficios) {
        this.beneficios = beneficios;
    }

    public void calcularInteresMensual() {
        double interesMensual = (saldoDisponible * tasaInteresAnual) / 12;
        saldoDisponible += interesMensual;  
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaAhorro\nTasa de Interes Anual: " + tasaInteresAnual + "\nBeneficios: " + Arrays.toString(beneficios);
    }
}
