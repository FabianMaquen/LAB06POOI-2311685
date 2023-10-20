package Banco;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class MainPrincipal {
    public static void main(String[] args) {













        
    	
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


        MovimientoCuenta[] movimientos = new MovimientoCuenta[10];

        movimientos[0] = new MovimientoCuenta("LP40", "SUELDO MENSUAL", fecha1, 3500.31, "Deposito");
        movimientos[1] = new MovimientoCuenta("SA71", "COMPRAS", fecha2, 450.00, "Retiro");
        movimientos[2] = new MovimientoCuenta("DS08", "REALIZAR PAGO DE LUZ", fecha3, 100.32, "Transferencia");
        movimientos[3] = new MovimientoCuenta("PP78", "REALIZAR PAGO DE AGUA", fecha4, 110.35, "Transferencia");
        movimientos[4] = new MovimientoCuenta("GF31", "COMIDA", fecha5, 200.00, "Retiro");
        movimientos[5] = new MovimientoCuenta("RT98", "SUELDO MENSUAL", fecha6, 3500.31, "Deposito");
        movimientos[6] = new MovimientoCuenta("HJ15", "MENSUALIDAD RENTA", fecha7, 800.64, "Transferencia");
        movimientos[7] = new MovimientoCuenta("GK89", "SUELDO MENSUAL", fecha8, 3500.31, "Deposito");
        movimientos[8] = new MovimientoCuenta("AS32", "REALIZAR PAGO DE LUZ", fecha9, 120.36, "Transferencia");
        movimientos[9] = new MovimientoCuenta("IY10", "SinSaldo", fecha10, 3500.31, "Deposito");

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
        Arrays.sort(movimientos, comparadorPorFecha);

        for (MovimientoCuenta movimiento : movimientos) {
                System.out.println(movimiento.toString());
        }
    }
}

