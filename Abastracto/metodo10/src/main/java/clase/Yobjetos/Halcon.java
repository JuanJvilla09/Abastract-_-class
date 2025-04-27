package clase.Yobjetos;

public class Halcon extends Pajaro{
    private int velocidadMaxima; // En km/h
    private String habitatPreferido;

    // Constructor
    public Halcon(String nombre, double envergaduraAlas, String colorPlumaje,
                  double peso, int velocidadMaxima, String habitatPreferido) {
        super(nombre, envergaduraAlas, colorPlumaje, peso);
        this.velocidadMaxima = velocidadMaxima;
        this.habitatPreferido = habitatPreferido;
    }

    // Getters específicos
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getHabitatPreferido() {
        return habitatPreferido;
    }

    // Implementación de los métodos abstractos
    @Override
    public void volar() {
        System.out.println(nombre + " (Halcón) vuela con gran velocidad y precisión:");
        System.out.println("- Alcanza velocidades de hasta " + velocidadMaxima + " km/h");
        System.out.println("- Sus alas puntiagudas de " + envergaduraAlas + " metros cortan el aire");
        System.out.println("- Realiza giros bruscos y maniobras ágiles");
        System.out.println("- Prefiere volar en zonas de " + habitatPreferido);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " (Halcón) emite su llamado característico:");
        System.out.println("- Un grito agudo y repetitivo");
        System.out.println("- ¡Kek-kek-kek-kek!");
    }

    // Método específico de Halcón
    public void picadaRapida() {
        System.out.println(nombre + " realiza una picada a máxima velocidad.");
        System.out.println("Puede alcanzar los " + velocidadMaxima + " km/h durante este ataque fulminante.");
    }

    @Override
    public String toString() {
        return "Halcón: " + nombre +
                " - Envergadura: " + envergaduraAlas + "m, Color: " + colorPlumaje +
                ", Peso: " + peso + " kg, Velocidad máxima: " + velocidadMaxima + " km/h" +
                ", Hábitat: " + habitatPreferido;
    }



}
