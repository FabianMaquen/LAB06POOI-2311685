package Banco;
public class CuentaFree extends CuentaAhorro{
    private boolean numLimitadoDeRetiro;


    public CuentaFree(boolean numLimitadoDeRetiro) {
        this.numLimitadoDeRetiro = numLimitadoDeRetiro;
    }

    public boolean isNumLimitadoDeRetiro() {
        return numLimitadoDeRetiro;
    }
    public void setNumLimitadoDeRetiro(boolean numLimitadoDeRetiro) {
        this.numLimitadoDeRetiro = numLimitadoDeRetiro;
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaFree: El numero limitado de retiro es " + numLimitadoDeRetiro;
    }
}
