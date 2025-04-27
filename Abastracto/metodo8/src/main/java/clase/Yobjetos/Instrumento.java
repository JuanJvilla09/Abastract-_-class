package clase.Yobjetos;

public abstract class Instrumento {
    protected String nombre;
    protected String material;
    protected String familia;
    protected boolean afinado;

    // Constructor
    public Instrumento(String nombre, String material, String familia) {
        this.nombre = nombre;
        this.material = material;
        this.familia = familia;
        this.afinado = false; // Por defecto, un instrumento nuevo no está afinado
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getMaterial() {
        return material;
    }

    public String getFamilia() {
        return familia;
    }

    public boolean isAfinado() {
        return afinado;
    }

    // Métodos abstractos
    public abstract void play();
    public abstract void tune();

    // Método toString
    @Override
    public String toString() {
        return "Instrumento: " + nombre + " (Familia: " + familia + ", Material: " + material +
                ", Estado: " + (afinado ? "Afinado" : "Desafinado") + ")";
    }
}
