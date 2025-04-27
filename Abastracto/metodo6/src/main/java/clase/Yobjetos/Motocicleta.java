package clase.Yobjetos;

public class Motocicleta extends Vehiculo{
    // Atributos específicos
    private int cilindrada;
    private String tipo;

    // Constructor
    public Motocicleta(String marca, String modelo, int año, int cilindrada, String tipo) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    // Implementación de los métodos abstractos
    @Override
    public void startEngine() {
        if (!motorEncendido) {
            System.out.println("Presionando el botón de arranque de la motocicleta...");
            System.out.println("Motocicleta " + marca + " " + modelo + " de " + cilindrada + "cc rugiendo!");
            System.out.println("Motor encendido!");
            motorEncendido = true;
        } else {
            System.out.println("El motor de la motocicleta ya está encendido.");
        }
    }

    @Override
    public void stopEngine() {
        if (motorEncendido) {
            System.out.println("Cortando el suministro de combustible de la motocicleta " + marca + " " + modelo + "...");
            System.out.println("Motor de " + cilindrada + "cc detenido.");
            motorEncendido = false;
        } else {
            System.out.println("El motor de la motocicleta ya está apagado.");
        }
    }

    // Método específico de Motocicleta
    public void hacerCaballito() {
        if (motorEncendido) {
            System.out.println("¡Haciendo un caballito con la " + tipo + " " + marca + "!");
        } else {
            System.out.println("No se puede hacer caballito con el motor apagado.");
        }
    }

    @Override
    public String toString() {
        return "Motocicleta: " + marca + " " + modelo + " (" + año + "), " +
                cilindrada + "cc, Tipo: " + tipo +
                ", Motor: " + (motorEncendido ? "Encendido" : "Apagado");
    }
}



