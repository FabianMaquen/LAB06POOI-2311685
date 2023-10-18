package Banco;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CuentaAhorro {
    private double  tasaDeInteresAnual=0.03;
    private String[] beneficios;
    public double getTasaDeInteresAnual() {
        return tasaDeInteresAnual;
    }
    public void setTasaDeInteresAnual(double tasaDeInteresAnual) {
        this.tasaDeInteresAnual = tasaDeInteresAnual;
    }
    public String[] getBeneficios() {
        return beneficios;
    }
    public void setBeneficios(String[] beneficios) {
        this.beneficios = beneficios;
    }
    
    public void cuentaAhorro(double tasaInteresAnual, String[] beneficios){
        this.tasaDeInteresAnual=tasaInteresAnual;
        this.beneficios=beneficios;
    }
    
    @Override
    public String toString() {
        return "CuentaAhorro [tasaDeInteresAnual=" + tasaDeInteresAnual + ", beneficios=" + Arrays.toString(beneficios)
                + "]";
    }
    



}
