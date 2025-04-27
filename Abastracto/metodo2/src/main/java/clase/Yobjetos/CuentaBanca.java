package clase.Yobjetos;


public abstract class CuentaBanca {
    protected double saldo;

    public CuentaBanca() {
    }

    public CuentaBanca(double saldoInicial) {
        this.saldo = saldoInicial;
    }


    // Método común para consultar el saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos abstractos que cada tipo de cuenta debe implementar
    public abstract void depositar(double cantidad);

    public abstract void retirar(double cantidad);
}
