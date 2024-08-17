public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {
        saldo += cantidad;
        numeroConsignaciones++;
    }

    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            numeroRetiros++;
        } else {
            System.out.println("Saldo insuficiente para retirar.");
        }
    }

    public void calcularInteresMensual() {
        float interesMensual = (tasaAnual / 12) / 100;
        saldo += saldo * interesMensual;
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteresMensual();
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de consignaciones: " + numeroConsignaciones);
        System.out.println("Número de retiros: " + numeroRetiros);
        System.out.println("Número de transacciones: "+ (numeroConsignaciones+numeroRetiros));
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comisión mensual: " + comisionMensual);
    }
}
