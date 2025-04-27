package clase.Yobjetos;

public class Coche extends Vehiculo {
    private int numeroPuertas;
    private String tipoCombustible;

    // Constructor
    public Coche(String marca, String modelo, int año, int numeroPuertas, String tipoCombustible) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    // Implementación de los métodos abstractos
    @Override
    public void startEngine() {
        if (!motorEncendido) {
            System.out.println("Girando la llave de ignición del coche...");
            System.out.println("Verificando niveles de " + tipoCombustible + "...");
            System.out.println("Motor del coche " + marca + " " + modelo + " encendido!");
            motorEncendido = true;
        } else {
            System.out.println("El motor del coche ya está encendido.");
        }
    }

    @Override
    public void stopEngine() {
        if (motorEncendido) {
            System.out.println("Apagando el motor del coche " + marca + " " + modelo + "...");
            System.out.println("Motor detenido. Asegurando las " + numeroPuertas + " puertas.");
            motorEncendido = false;
        } else {
            System.out.println("El motor del coche ya está apagado.");
        }
    }

    // Método específico de Coche
    public void abrirMaletero() {
        System.out.println("Abriendo el maletero del coche " + marca + " " + modelo);
    }

    @Override
    public String toString() {
        return "Coche: " + marca + " " + modelo + " (" + año + "), " +
                numeroPuertas + " puertas, Combustible: " + tipoCombustible +
                ", Motor: " + (motorEncendido ? "Encendido" : "Apagado");
    }
}