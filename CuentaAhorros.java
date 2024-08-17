public class CuentaAhorros extends Cuenta {
    private boolean activa;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        activa = saldo >= 10000;
    }

    @Override
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        }
        if (saldo >= 10000) {
            activa = true;
        }
    }

    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        }
        if (saldo < 10000) {
            activa = false;
        }
    }

    @Override
    public void extractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        activa = saldo >= 10000;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cuenta activa: " + activa);
    }
}
