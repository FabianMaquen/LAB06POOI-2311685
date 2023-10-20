package Banco;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainPrincipal {
    public static void main(String[] args) {

        Cliente cliente1 =  new Cliente("845A2D3", "Alondra", "Gonzales", "Pachacamac Mz X Lt20", 937094565, 71401235);
        //Cuenta bancaria del cliente
        CuentaBancaria cuentaCliente1 = new CuentaBancaria("4545 1512 7893 4681", "Tarjeta VISA", "838-234-242434343567-53", cliente1);

        List<CuentaBancaria> cuentasCliente1 = new ArrayList<>();
        cuentasCliente1.add(cuentaCliente1);

        // Tipos de cuenta del cliente
        CuentaAhorro cuentaAhorroSueldo = new CuentaSueldo("Interbank");
        CuentaAhorro cuentaAhorroFree = new CuentaFree(false);
        CuentaBancaria cuentaCorriente1 = new CuentaCorriente(5);
        CuentaBancaria cuentaCorriente2 = new CuentaCorriente(5);
        CuentaBancaria cuentaCTS = new CuentaCTS(50000);

        cuentasCliente1.add(cuentaAhorroSueldo);
        cuentasCliente1.add(cuentaAhorroFree);
        cuentasCliente1.add(cuentaCorriente1);
        cuentasCliente1.add(cuentaCorriente2);
        cuentasCliente1.add(cuentaCTS);

        //Saldos de las cuentas de Sueldo y Free
        cuentaAhorroSueldo.setSaldoDisponible(1500.00);
        cuentaAhorroFree.setSaldoDisponible(20000.00);

        // Calcula el nuevo saldo de las cuentas de ahorros por todo el año
        cuentaAhorroSueldo.calcularInteresMensual();
        cuentaAhorroFree.calcularInteresMensual();

        // La cuenta Sueldo tiene 5 beneficios
        cuentaAhorroSueldo.setBeneficios(new String[] {"ropa", "restaurante", "conciertos", "vuelos", "hotel"});

        // El cliente puede asistir a 5 eventosBancarios anualmente
        cliente1.setEventoBancarios(new <EventosBancarios> = {});




        // La cuenta Free tiene 3 beneficios
        cuentaAhorroFree.setBeneficios(new String[] {"teatro", "restaurante", "cursos"});

        // Cada cuenta bancaria calcula su propio saldo de acuerdo a la tasa de interes anual
        // Ya se calcularon los saldos de las cuenta de ahorro de sueldo y free 
        // cuentaAhorroFree.calcularInteresMensual();
        // cuentaAhorroSueldo.calcularInteresMensual();
        cuentaCorriente1.calcularInteresMensual();
        cuentaCorriente2.calcularInteresMensual();
        cuentaCTS.calcularInteresMensual();


    	// Una cuenta bancaria tiene 10 movimientos, los cuales son ordenados por fecha ascendente
        LocalDate fecha1 = LocalDate.of(2022, 12, 18);
        LocalDate fecha2 = LocalDate.of(2022, 12, 20);
        LocalDate fecha3 = LocalDate.of(2023, 2, 10);
        LocalDate fecha4 = LocalDate.of(2023, 2, 10);
        LocalDate fecha5 = LocalDate.of(2023, 2, 28);
        LocalDate fecha6 = LocalDate.of(2022, 11, 18);
        LocalDate fecha7 = LocalDate.of(2023, 1, 18);
        LocalDate fecha8 = LocalDate.of(2023, 10, 18);
        LocalDate fecha9 = LocalDate.of(2023, 3, 10);
        LocalDate fecha10 = LocalDate.of(2023, 2, 18);


        List<MovimientoCuenta> movimientos = new ArrayList<>();

        movimientos.add(new MovimientoCuenta("LP40", "SUELDO MENSUAL", fecha1, 3500.31, "Deposito"));
        movimientos.add(new MovimientoCuenta("SA71", "COMPRAS", fecha2, 450.00, "Retiro"));
        movimientos.add(new MovimientoCuenta("DS08", "REALIZAR PAGO DE LUZ", fecha3, 100.32, "Transferencia"));
        movimientos.add(new MovimientoCuenta("PP78", "REALIZAR PAGO DE AGUA", fecha4, 110.35, "Transferencia"));
        movimientos.add(new MovimientoCuenta("GF31", "COMIDA", fecha5, 200.00, "Retiro"));
        movimientos.add(new MovimientoCuenta("RT98", "SUELDO MENSUAL", fecha6, 3500.31, "Deposito"));
        movimientos.add(new MovimientoCuenta("HJ15", "MENSUALIDAD RENTA", fecha7, 800.64, "Transferencia"));
        movimientos.add(new MovimientoCuenta("GK89", "SUELDO MENSUAL", fecha8, 3500.31, "Deposito"));
        movimientos.add(new MovimientoCuenta("AS32", "REALIZAR PAGO DE LUZ", fecha9, 120.36, "Transferencia"));
        movimientos.add(new MovimientoCuenta("IY10", "SinSaldo", fecha10, 3500.31, "Deposito"));

        cuentaCorriente1.setMovimientos(movimientos);

        // Comparador
        Comparator<MovimientoCuenta> comparadorPorFecha = new Comparator<MovimientoCuenta>() {
            @Override
            public int compare(MovimientoCuenta movimiento1, MovimientoCuenta movimiento2) {
                LocalDate fecha1 = movimiento1.getFecha();
                LocalDate fecha2 = movimiento2.getFecha();
                return fecha1.compareTo(fecha2);
            }
        };

        // Ordenar fecha ascendente
        Collections.sort(movimientos, comparadorPorFecha);

        for (MovimientoCuenta movimiento : movimientos) {
                System.out.println(movimiento.toString());
        }

        // Imprimir el estado de todas las cuentas de
        System.out.println();


    }
}

