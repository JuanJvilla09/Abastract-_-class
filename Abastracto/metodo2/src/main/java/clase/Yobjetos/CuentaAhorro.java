package clase.Yobjetos;

public class CuentaAhorro extends CuentaBanca {

    private static final double SALDO_MINIMO = 20000.0;

    public CuentaAhorro() {
    }

    public CuentaAhorro(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void depositar(double cantidad){
        if(cantidad > 0){
            saldo += cantidad;
            System.out.println("CuentaAhorro: depositados " + cantidad + " pesos. Saldo = " + saldo);
    } else {
            System.out.println("CuentAhorro: cantidad a depositar inválida. ");
        }

   }

   @Override
    public void retirar (double cantidad){
        if (cantidad <=0){
            System.out.println("CuentaAhorro: cantidad a retirar inválida. ");
            return;
        }
        if (saldo - cantidad >=SALDO_MINIMO){
            saldo -= cantidad;
            System.out.println("CuentaAhorro: retirados " + cantidad + " pesos. Saldo = " + saldo);
        }else {
            System.out.println("CuentaAhorro: operación denegada. Debe quedar al menos "+ SALDO_MINIMO + " pesos.");
        }

   }
}
