package clase.Yobjetos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Instanciamos una cuenta de ahorro con 50,000 pesos
        CuentaBanca cuentaAhorro = new CuentaAhorro(500000.0);

        // Instanciamos una cuenta corriente con 10,000 pesos
        CuentaBanca cuentaCorriente = new CuentaCorriente(100000.0);

        System.out.println("=== Operaciones en Cuenta de Ahorro ===");
        cuentaAhorro.depositar(15000);
        cuentaAhorro.retirar(30000);
        cuentaAhorro.retirar(20000);
        System.out.println("Saldo final Ahorro: " + cuentaAhorro.getSaldo());

        System.out.println("\n=== Operaciones en Cuenta Corriente ===");
        cuentaCorriente.depositar(5000);
        cuentaCorriente.retirar(12000);
        cuentaCorriente.retirar(5000);
        System.out.println("Saldo final Corriente: " + cuentaCorriente.getSaldo());


    }
}