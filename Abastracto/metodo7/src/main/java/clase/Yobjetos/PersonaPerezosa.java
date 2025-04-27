package clase.Yobjetos;

public class PersonaPerezosa extends Persona{

    // Atributos específicos
    private int horasDiariasTV;
    private String comidaFavorita;

    // Constructor
    public PersonaPerezosa(String nombre, int edad, double peso, double altura,
                           int horasDiariasTV, String comidaFavorita) {
        super(nombre, edad, peso, altura);
        this.horasDiariasTV = horasDiariasTV;
        this.comidaFavorita = comidaFavorita;
    }

    // Implementación de los métodos abstractos
    @Override
    public void comer() {
        System.out.println(nombre + " (Persona Perezosa) come:");
        System.out.println("- Principalmente comida rápida y " + comidaFavorita);
        System.out.println("- Come mientras ve TV o usa el celular");
        System.out.println("- Horarios irregulares, a veces saltándose comidas");
        System.out.println("- Muchos snacks durante el día, especialmente por la noche");
    }

    @Override
    public void ejercicio() {
        System.out.println(nombre + " (Persona Perezosa) se 'ejercita':");
        System.out.println("- Considera ejercicio caminar hasta el refrigerador");
        System.out.println("- Ocasionalmente pasea cuando es absolutamente necesario");
        System.out.println("- Prefiere pasar " + horasDiariasTV + " horas frente a la TV en lugar de hacer ejercicio");
        System.out.println("- Sus dedos tienen gran agilidad para usar el control remoto");
    }

    // Método específico de PersonaPerezosa
    public void tomarSiesta() {
        System.out.println(nombre + " está tomando una siesta en medio del día.");
        System.out.println("Ya ha visto " + horasDiariasTV + " horas de TV hoy y está cansado/a.");
    }

    @Override
    public String toString() {
        return "Persona Perezosa: " + nombre + ", " + edad + " años, " +
                String.format("%.1f", peso) + " kg, " +
                String.format("%.2f", altura) + " m, " +
                "Ve TV: " + horasDiariasTV + " horas/día, " +
                "Comida favorita: " + comidaFavorita;
    }



}
