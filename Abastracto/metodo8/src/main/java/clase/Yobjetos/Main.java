package clase.Yobjetos;

public class Main {
    public static void main(String[] args) {
        Glockenspiel glockenspiel = new Glockenspiel("Yamaha G-3100", "Aluminio", 32, 85.5);
        Violin violin = new Violin("Stradivarius Replica", "Madera de Arce", "Pirastro", 2010);

        // Mostrar información inicial
        System.out.println("=== INSTRUMENTOS MUSICALES ===");
        System.out.println(glockenspiel);
        System.out.println(violin);
        System.out.println();

        // Intentar tocar sin afinar
        System.out.println("=== INTENTANDO TOCAR SIN AFINAR ===");
        glockenspiel.play();
        violin.play();
        System.out.println();

        // Afinar los instrumentos
        System.out.println("=== AFINANDO INSTRUMENTOS ===");
        glockenspiel.tune();
        System.out.println();
        violin.tune();
        System.out.println();

        // Tocar instrumentos afinados
        System.out.println("=== TOCANDO INSTRUMENTOS AFINADOS ===");
        glockenspiel.play();
        glockenspiel.tocarEscalaCromatica();
        System.out.println();
        violin.play();
        violin.usarVibrato();
        System.out.println();

        //  polimorfismo
        System.out.println("=== DEMOSTRACIÓN DE POLIMORFISMO ===");
        Instrumento[] orquesta = new Instrumento[2];
        orquesta[0] = glockenspiel;
        orquesta[1] = violin;

        System.out.println("¡La orquesta va a interpretar una pieza!");
        for (Instrumento instrumento : orquesta) {
            System.out.println("\nPreparando " + instrumento.getNombre() + ":");
            if (!instrumento.isAfinado()) {
                instrumento.tune();
            }
            instrumento.play();
        }








    }
}