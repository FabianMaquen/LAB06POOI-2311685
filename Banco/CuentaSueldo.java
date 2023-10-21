package Banco;
public class CuentaSueldo extends CuentaAhorro{
    private String nombreEmpresa;


    public CuentaSueldo(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNomEmpresa() {
        return nombreEmpresa;
    }

    public void setNomEmpresa(String nombreempresa) {
        this.nombreEmpresa = nombreempresa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCUENTA SUELDO: \nnombreEmpresa: " + nombreEmpresa;
    }
}
