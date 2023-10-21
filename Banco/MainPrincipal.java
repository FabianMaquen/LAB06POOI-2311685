package Banco;
import java.time.LocalDate;
import java.util.ArrayList;
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
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(5);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente(5);
        CuentaCTS cuentaCTS = new CuentaCTS(50000);

        cuentasCliente1.add(cuentaAhorroSueldo);
        cuentasCliente1.add(cuentaAhorroFree);
        cuentasCliente1.add(cuentaCorriente1);
        cuentasCliente1.add(cuentaCorriente2);
        cuentasCliente1.add(cuentaCTS);

        //Saldos de las cuentas de Sueldo y Free
        cuentaAhorroSueldo.setSaldoDisponible(1500.00);
        cuentaAhorroFree.setSaldoDisponible(20000.00);
        double cuentaSueldoInicial = cuentaAhorroSueldo.getSaldoDisponible();
        double cuentaFreeInicial = cuentaAhorroFree.getSaldoDisponible();

        // Calcula el nuevo saldo de las cuentas de ahorros por todo el año
        for (int i = 0; i < 12; i++) {   
            cuentaAhorroSueldo.calcularInteresMensual();
            cuentaAhorroFree.calcularInteresMensual();
        }

        // La cuenta Sueldo tiene 5 beneficios
        cuentaAhorroSueldo.setBeneficios(new String[] {"ropa", "restaurante", "conciertos", "vuelos", "hotel"});

        // El cliente puede asistir a 5 eventosBancarios anualmente

        LocalDate date1 = LocalDate.of(2024, 2, 4);
        LocalDate date2 = LocalDate.of(2024, 12, 16);
        LocalDate date3 = LocalDate.of(2024, 8, 14);
        LocalDate date4 = LocalDate.of(2024, 12, 30);
        LocalDate date5 = LocalDate.of(2024, 1, 25);
        
        List <EventoBancario> evento = new ArrayList<>();

        evento.add(new EventoBancario(date1, "EduFin Summit", "cumbre global sobre educación financiera"));
        evento.add(new EventoBancario(date2,"European Money Week", "semana de educacion financiera"));
        evento.add(new EventoBancario(date3,"FestiUsil", "La Molina - Coliseo"));
        evento.add(new EventoBancario(date4,"Money Fest", "Festival de educacion"));
        evento.add(new EventoBancario(date5,"Global Money Week", "conocimiento financiero para estudiantes"));

        cliente1.setEventoBancarios(evento);


        // La cuenta Free tiene 3 beneficios
        cuentaAhorroFree.setBeneficios(new String[] {"teatro", "restaurante", "cursos"});

        // Cada cuenta bancaria calcula su propio saldo de acuerdo a la tasa de interes anual

        for (int i = 0; i < 12; i++) {
            // Ya se calcularon los saldos de las cuenta de ahorro de sueldo y free 
            cuentaCorriente1.calcularInteresMensual();
            cuentaCorriente2.calcularInteresMensual();
            cuentaCTS.calcularInteresMensual();
        }


    	// Una cuenta bancaria tiene 10 movimientos, los cuales son ordenados por fecha ascendente

        // Se crean las fechas
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

        // se hacen los 10 movimientos
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

        


        // IMPRIME LO QUE PIDEN LOS 10 POSITS

        //1
        System.out.println(cuentasCliente1.toString() + "\n\n");

        //2
        System.out.println("La cuenta CTS contiene: " + cuentaCTS.getPuntos() + " puntos");

        //3
        System.out.println("\nSaldo de la cuenta Ahorro Inicial: S/" +  cuentaSueldoInicial);
        System.out.println("\nSaldo de la cuenta Free Inicial: S/" + cuentaFreeInicial);

        //4
        System.out.println("\nCantidad de retiros en cajero de la cuenta Corriente: " + cuentaCorriente1.getMaxRetiro());

        //5 el nuevo saldo de las cuentas de ahorros por todo el año.
        System.out.println("\nLos nuevos saldos de las cuentas de ahorro por todo el año es: ");
        System.out.println("\nCuenta Sueldo: S/" + cuentaAhorroSueldo.getSaldoDisponible());
        System.out.println("\nCuenta Free: S/" + cuentaAhorroFree.getSaldoDisponible());

        //6
        System.out.println("\nLa cuenta sueldo tiene 5 beneficios: ");
        String[] beneficiosSueldo = cuentaAhorroSueldo.getBeneficios();
        for (String beneficio : beneficiosSueldo) {
            System.out.print(beneficio + " / ");
        }
        System.out.println("\n");

        // 7
        System.out.println("Cliente " + cliente1.getNombre() + " puede asistir a " + evento.size()  + " eventos bancarios anualmente.");

        // 8
        System.out.println("\nLa cuenta free tiene 3 beneficios: ");
        String[] beneficiosFree = cuentaAhorroFree.getBeneficios();
        for (String beneficio : beneficiosFree) {
            System.out.print(beneficio + " / ");
        }
        System.out.println("\n");

    
        //9
        System.out.println("Los nuevos saldos de las cuentas bancarias por todo el año es: ");
        System.out.println("\nCuenta Sueldo: S/" + cuentaAhorroSueldo.getSaldoDisponible());
        System.out.println("\nCuenta Free: S/" + cuentaAhorroFree.getSaldoDisponible());
        System.out.println("\nCuenta Corriente-1: S/" + cuentaCorriente1.getSaldoDisponible());
        System.out.println("\nCuenta Corriente-2: S/" + cuentaCorriente2.getSaldoDisponible());
        System.out.println("\nCuenta CTS: S/" + cuentaCTS.getSaldoDisponible());


        // 10
        System.out.println("\nUna cuenta bancaria tiene 10 movimientos (CuentaCorriente-1): ");
        for (MovimientoCuenta movimiento : movimientos) {
            System.out.println(movimiento.toString());
        }
    }
}
