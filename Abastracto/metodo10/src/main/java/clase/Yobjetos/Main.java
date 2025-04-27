package clase.Yobjetos;

public class Main {
    public static void main(String[] args) {
        Aguila aguila = new Aguila("Reina de los Cielos", 2.2, "Marrón y dorado",
                6.5, 3500, "Real");
        Halcon halcon = new Halcon("Flecha Veloz", 1.1, "Gris azulado",
                1.2, 320, "Montañas y acantilados");

        // Mostrar información inicial
        System.out.println("=== AVES RAPACES ===");
        System.out.println(aguila);
        System.out.println(halcon);
        System.out.println();

        // Probar métodos con el águila
        System.out.println("=== COMPORTAMIENTO DEL ÁGUILA ===");
        aguila.volar();
        System.out.println();
        aguila.hacerSonido();
        System.out.println();
        aguila.cazar();
        System.out.println();
        aguila.comer("un conejo");
        System.out.println();

        // Probar métodos con el halcón
        System.out.println("=== COMPORTAMIENTO DEL HALCÓN ===");
        halcon.volar();
        System.out.println();
        halcon.hacerSonido();
        System.out.println();
        halcon.picadaRapida();
        System.out.println();
        halcon.comer("un ratón de campo");
        System.out.println();

        // Demostrar polimorfismo
        System.out.println("=== DEMOSTRACIÓN DE POLIMORFISMO ===");
        Pajaro[] aves = new Pajaro[2];
        aves[0] = aguila;
        aves[1] = halcon;

        for (int i = 0; i < aves.length; i++) {
            System.out.println((i+1) + ". " + aves[i].getNombre());
            aves[i].volar();
            System.out.println();
            aves[i].hacerSonido();
            System.out.println();
        }
    }
}