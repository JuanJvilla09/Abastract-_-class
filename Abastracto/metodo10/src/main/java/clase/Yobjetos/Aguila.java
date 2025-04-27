package clase.Yobjetos;

public class Aguila extends Pajaro{
    private double alturaMaximaVuelo; // En metros
    private String tipoAguila;

    // Constructor
    public Aguila(String nombre, double envergaduraAlas, String colorPlumaje,
                  double peso, double alturaMaximaVuelo, String tipoAguila) {
        super(nombre, envergaduraAlas, colorPlumaje, peso);
        this.alturaMaximaVuelo = alturaMaximaVuelo;
        this.tipoAguila = tipoAguila;
    }

    // Getters específicos
    public double getAlturaMaximaVuelo() {
        return alturaMaximaVuelo;
    }

    public String getTipoAguila() {
        return tipoAguila;
    }

    // Implementación de los métodos abstractos
    @Override
    public void volar() {
        System.out.println(nombre + " (Águila " + tipoAguila + ") vuela majestuosamente:");
        System.out.println("- Utiliza sus poderosas alas de " + envergaduraAlas + " metros de envergadura");
        System.out.println("- Planea en corrientes térmicas ascendentes");
        System.out.println("- Alcanza alturas de hasta " + alturaMaximaVuelo + " metros");
        System.out.println("- Sus movimientos son elegantes y precisos");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " (Águila " + tipoAguila + ") emite un sonido:");
        System.out.println("- Produce un agudo chillido que resuena en el valle");
        System.out.println("- ¡Kiii-kiii-kiii!");
    }

    // Método específico de Águila
    public void cazar() {
        System.out.println(nombre + " despliega sus garras y se lanza en picada para cazar una presa.");
        System.out.println("Con su vista aguda puede detectar presas a " + (alturaMaximaVuelo / 2) + " metros de distancia.");
    }

    @Override
    public String toString() {
        return "Águila " + tipoAguila + ": " + nombre +
                " - Envergadura: " + envergaduraAlas + "m, Color: " + colorPlumaje +
                ", Peso: " + peso + " kg, Altura máxima: " + alturaMaximaVuelo + "m";
    }

}
