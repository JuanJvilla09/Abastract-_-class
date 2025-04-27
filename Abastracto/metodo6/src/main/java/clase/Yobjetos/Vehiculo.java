package clase.Yobjetos;

public abstract class Vehiculo {
    // Atributos comunes
    protected String marca;
    protected String modelo;
    protected int año;
    protected boolean motorEncendido;

    // Constructor
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.motorEncendido = false;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    // Métodos abstractos
    public abstract void startEngine();
    public abstract void stopEngine();

    // Método toString
    @Override
    public String toString() {
        return "Vehículo: " + marca + " " + modelo + " (" + año + ")";
    }
}
