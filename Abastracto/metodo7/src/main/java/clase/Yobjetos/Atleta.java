package clase.Yobjetos;

public class Atleta extends Persona{
    // Atributos específicos
    private String disciplina;
    private int horasEntrenamiento;

    // Constructor
    public Atleta(String nombre, int edad, double peso, double altura,
                  String disciplina, int horasEntrenamiento) {
        super(nombre, edad, peso, altura);
        this.disciplina = disciplina;
        this.horasEntrenamiento = horasEntrenamiento;
    }

    // Implementación de los métodos abstractos
    @Override
    public void comer() {
        System.out.println(nombre + " (Atleta de " + disciplina + ") come:");
        System.out.println("- Dieta alta en proteínas y carbohidratos complejos");
        System.out.println("- 5-6 comidas balanceadas al día");
        System.out.println("- Suplementos alimenticios específicos para rendimiento");
        System.out.println("- Control estricto de calorías según plan de entrenamiento");
    }

    @Override
    public void ejercicio() {
        System.out.println(nombre + " (Atleta de " + disciplina + ") se ejercita:");
        System.out.println("- Entrena " + horasEntrenamiento + " horas diarias");
        System.out.println("- Rutina específica para " + disciplina);
        System.out.println("- Incluye entrenamiento cardiovascular y de fuerza");
        System.out.println("- Sesiones de recuperación y estiramiento");
    }

    // Método específico de Atleta
    public void competir() {
        System.out.println(nombre + " está compitiendo en " + disciplina + "!");
        System.out.println("Años de entrenamiento intenso de " + horasEntrenamiento +
                " horas diarias lo han preparado para este momento.");
    }

    @Override
    public String toString() {
        return "Atleta: " + nombre + ", " + edad + " años, " +
                String.format("%.1f", peso) + " kg, " +
                String.format("%.2f", altura) + " m, " +
                "Disciplina: " + disciplina + ", " +
                "Entrena: " + horasEntrenamiento + " horas/día";


    }
}
