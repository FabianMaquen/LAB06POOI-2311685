package Banco;

import java.util.Arrays;

public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteresAnual = 0.03;
    private String[] beneficios;

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }
    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }
    public String[] getBeneficios() {
        return beneficios;
    }
    public void setBeneficios(String[] beneficios) {
        this.beneficios = beneficios;
    }
    
    public void cuentaAhorro(double tasaInteresAnual, String[] beneficios){
        this.tasaInteresAnual=tasaInteresAnual;
        this.beneficios=beneficios;
    }
    public void calcularInteresMensual(){
        double interesMensual = (saldoDisponible * tasaInteresAnual) / 12;
        saldoDisponible += interesMensual;
    }
    @Override
    public String toString() {
        return "CuentaAhorro [tasaDeInteresAnual=" + tasaInteresAnual + ", beneficios=" + Arrays.toString(beneficios) + "]";
    }
    



}
