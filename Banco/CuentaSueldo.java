package Banco;
public class CuentaSueldo extends CuentaAhorro{
    private String nomEmpresa;

    public CuentaSueldo(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
        

    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }
    @Override
    public String toString() {
        return "CuentaSueldo: nomEmpresa = " + nomEmpresa + "";
    } 
    
        
}
