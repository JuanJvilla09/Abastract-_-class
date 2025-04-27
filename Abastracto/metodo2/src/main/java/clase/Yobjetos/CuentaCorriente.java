package clase.Yobjetos;

// CuentaCorriente.java
public class CuentaCorriente extends CuentaBanca {

    public CuentaCorriente() {
    }

    public CuentaCorriente(double saldoInicial) {
        super(saldoInicial);
    }


    @Override
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("CuentaCorriente: depositados " + cantidad + " pesos. Saldo = " + saldo);
        } else {
            System.out.println("CuentaCorriente: cantidad a depositar inválida.");
        }
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("CuentaCorriente: cantidad a retirar inválida.");
            return;
        }
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("CuentaCorriente: retirados " + cantidad + " pesos. Saldo = " + saldo);
        } else {
            System.out.println("CuentaCorriente: fondos insuficientes. Saldo actual = " + saldo);
        }
    }
}
