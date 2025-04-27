package clase.Yobjetos;

public abstract class Persona {
    protected String nombre;
    protected int edad;
    protected double peso;
    protected double altura;

    // Constructor
    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    // IMC (Índice de Masa Corporal)
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Métodos abstractos
    public abstract void comer();
    public abstract void ejercicio();


    @Override
    public String toString() {
        return "Persona: " + nombre + ", " + edad + " años, " +
                String.format("%.1f", peso) + " kg, " +
                String.format("%.2f", altura) + " m, IMC: " +
                String.format("%.2f", calcularIMC());
    }
}
