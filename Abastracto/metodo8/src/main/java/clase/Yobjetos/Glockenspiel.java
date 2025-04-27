package clase.Yobjetos;

public class Glockenspiel extends Instrumento {
    private int numeroPlatillos;
    private double longitud;

    // Constructor
    public Glockenspiel(String nombre, String material, int numeroPlatillos, double longitud) {
        super(nombre, material, "Percusión");
        this.numeroPlatillos = numeroPlatillos;
        this.longitud = longitud;
    }

    //  métodos abstractos
    @Override
    public void play() {
        if (afinado) {
            System.out.println("¡Ting! ¡Ting! El Glockenspiel " + nombre + " produce notas brillantes y cristalinas.");
            System.out.println("Las " + numeroPlatillos + " placas metálicas resuenan con precisión.");
        } else {
            System.out.println("El Glockenspiel " + nombre + " suena desafinado. Debería afinarse primero.");
        }
    }

    @Override
    public void tune() {
        System.out.println("Afinando el Glockenspiel " + nombre + ":");
        System.out.println("- Ajustando la tensión de cada una de las " + numeroPlatillos + " placas metálicas");
        System.out.println("- Verificando que cada placa produzca la nota correcta con un afinador electrónico");
        System.out.println("- Limpiando las placas de " + material + " para mejorar la resonancia");
        afinado = true;
        System.out.println("¡Glockenspiel afinado correctamente!");
    }

    // Método específico de Glockenspiel
    public void tocarEscalaCromatica() {
        if (afinado) {
            System.out.println("Tocando una escala cromática en el Glockenspiel de " + longitud + " cm:");
            System.out.println("Do, Do#, Re, Re#, Mi, Fa, Fa#, Sol, Sol#, La, La#, Si, Do");
        } else {
            System.out.println("No se puede tocar una escala cromática con el instrumento desafinado.");
        }
    }

    @Override
    public String toString() {
        return "Glockenspiel: " + nombre + " (" + numeroPlatillos + " placas, " + longitud + " cm, " +
                "Material: " + material + ", Estado: " + (afinado ? "Afinado" : "Desafinado") + ")";
    }

}
