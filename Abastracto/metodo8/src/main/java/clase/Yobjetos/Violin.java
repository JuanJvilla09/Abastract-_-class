package clase.Yobjetos;

public class Violin extends Instrumento{
    private String marcaCuerdas;
    private int añoFabricacion;

    // Constructor
    public Violin(String nombre, String material, String marcaCuerdas, int añoFabricacion) {
        super(nombre, material, "Cuerda");
        this.marcaCuerdas = marcaCuerdas;
        this.añoFabricacion = añoFabricacion;
    }

    // Implementación de los métodos abstractos
    @Override
    public void play() {
        if (afinado) {
            System.out.println("El violín " + nombre + " del año " + añoFabricacion + " produce un sonido cálido y expresivo.");
            System.out.println("Las cuerdas " + marcaCuerdas + " vibran con una resonancia exquisita.");
        } else {
            System.out.println("El violín " + nombre + " suena desafinado y chirriante. Necesita afinación.");
        }
    }

    @Override
    public void tune() {
        System.out.println("Afinando el violín " + nombre + ":");
        System.out.println("- Ajustando las clavijas para afinar cada cuerda");
        System.out.println("- Afinando las cuerdas " + marcaCuerdas + " en Sol, Re, La, Mi");
        System.out.println("- Verificando la afinación con un diapasón");
        afinado = true;
        System.out.println("¡Violín afinado correctamente!");
    }

    // Método específico de Violin
    public void usarVibrato() {
        if (afinado) {
            System.out.println("Aplicando un hermoso vibrato en el violín " + nombre + " de " + añoFabricacion + ".");
            System.out.println("El sonido oscila sutilmente, añadiendo expresividad y emoción a la interpretación.");
        } else {
            System.out.println("No tiene sentido usar vibrato en un violín desafinado.");
        }
    }

    @Override
    public String toString() {
        return "Violín: " + nombre + " (Fabricado en " + añoFabricacion + ", Cuerdas: " + marcaCuerdas +
                ", Material: " + material + ", Estado: " + (afinado ? "Afinado" : "Desafinado") + ")";
    }
}



