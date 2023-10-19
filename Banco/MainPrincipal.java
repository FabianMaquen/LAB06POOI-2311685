package Banco;

public class MainPrincipal {
    public static void main(String[] args) {
        // Crear una instancia de CuentaBancaria
        CuentaBancaria cuenta1 = new CuentaAhorro();
        cuenta1.setNumeroCuenta("123456");
        cuenta1.setDescripcionCuenta("Cuenta de Prueba");
        cuenta1.setCuentaCCI("123-456");
        cuenta1.setSaldoDisponible(1000.0);
        cuenta1.calcularInteresMensual();

        // Mostrar información de la cuenta
        System.out.println("Información de la cuenta 1:");
        System.out.println(cuenta1);

        // Crear una instancia de CuentaAhorro
        CuentaAhorro cuenta2 = new CuentaAhorro(0.05, new String[] { "Beneficio 1", "Beneficio 2" });
        cuenta2.setNumeroCuenta("789012");
        cuenta2.setDescripcionCuenta("Otra Cuenta de Prueba");
        cuenta2.setCuentaCCI("789-012");
        cuenta2.setSaldoDisponible(2000.0);
        cuenta2.calcularInteresMensual();

        // Mostrar información de la cuenta de ahorro
        System.out.println("Información de la cuenta 2 (Cuenta de Ahorro):");
        System.out.println(cuenta2);
    }
}
