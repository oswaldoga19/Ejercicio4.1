import java.util.*;

public class PruebaCuenta {
    /**
     * Método main que crea una cuenta de ahorros con un saldo inicial
     * y una tasa de interés solicitados por teclado, a la cual se realiza una
     * consignación y un retiro, y luego se le genera el extracto mensual
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Prueba con Cuenta de Ahorros
        System.out.println("Cuenta de ahorros");
        System.out.print("Ingrese saldo inicial= $");
        float saldoInicialAhorros = input.nextFloat();
        System.out.print("Ingrese tasa de interés= ");
        float tasaAhorros = input.nextFloat();
        CuentaAhorros cuentaAhorros = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);
        System.out.print("Ingresar cantidad a consignar: $");
        float cantidadDepositarAhorros = input.nextFloat();
        cuentaAhorros.consignar(cantidadDepositarAhorros);
        System.out.print("Ingresar cantidad a retirar: $");
        float cantidadRetirarAhorros = input.nextFloat();
        cuentaAhorros.retirar(cantidadRetirarAhorros);
        cuentaAhorros.extractoMensual();
        cuentaAhorros.imprimir();

        // Prueba con Cuenta Corriente
        System.out.println("\nCuenta corriente");
        System.out.print("Ingrese saldo inicial= $");
        float saldoInicialCorriente = input.nextFloat();
        System.out.print("Ingrese tasa de interés= ");
        float tasaCorriente = input.nextFloat();
        CuentaCorriente cuentaCorriente = new CuentaCorriente(saldoInicialCorriente, tasaCorriente);
        System.out.print("Ingresar cantidad a consignar: $");
        float cantidadDepositarCorriente = input.nextFloat();
        cuentaCorriente.consignar(cantidadDepositarCorriente);
        System.out.print("Ingresar cantidad a retirar: $");
        float cantidadRetirarCorriente = input.nextFloat();
        cuentaCorriente.retirar(cantidadRetirarCorriente);
        cuentaCorriente.extractoMensual();
        cuentaCorriente.imprimir();

        input.close();
    }
}
