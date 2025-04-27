package clase.Yobjetos;

public class Main {
    public static void main(String[] args) {
        // instancias
        Atleta atleta = new Atleta("Carlos Pérez", 28, 75.5, 1.85, "Natación", 6);
        PersonaPerezosa perezoso = new PersonaPerezosa("Luis Gómez", 35, 95.2, 1.75, 8, "Pizza");

        // información inicial
        System.out.println("=== PERSONAS CREADAS ===");
        System.out.println(atleta);
        System.out.println(perezoso);
        System.out.println();

        //  métodos con el atleta
        System.out.println("=== HÁBITOS DEL ATLETA ===");
        atleta.comer();
        System.out.println();
        atleta.ejercicio();
        System.out.println();
        atleta.competir();
        System.out.println();

        //  métodos con la persona perezosa
        System.out.println("=== HÁBITOS DE LA PERSONA PEREZOSA ===");
        perezoso.comer();
        System.out.println();
        perezoso.ejercicio();
        System.out.println();
        perezoso.tomarSiesta();
        System.out.println();

        // polimorfismo
        System.out.println("=== DEMOSTRACIÓN DE POLIMORFISMO ===");
        Persona[] personas = new Persona[2];
        personas[0] = atleta;
        personas[1] = perezoso;

        for (int i = 0; i < personas.length; i++) {
            System.out.println((i+1) + ". " + personas[i]);
            System.out.println("- Hábitos alimenticios:");
            personas[i].comer();
            System.out.println("- Rutina de ejercicio:");
            personas[i].ejercicio();
            System.out.println();
        }
    }
}