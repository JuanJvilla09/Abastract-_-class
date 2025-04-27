package clase.Yobjetos;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangulo = new Rectangle("Rojo", 10, 20, 8, 5);
        Circle circulo = new Circle("Azul", 30, 40, 6);

        // Mostrar información inicial
        System.out.println("=== FORMAS CREADAS ===");
        System.out.println(rectangulo);
        System.out.println(circulo);
        System.out.println();

        // Dibujar las formas
        System.out.println("=== DIBUJANDO FORMAS ===");
        rectangulo.draw();
        System.out.println();
        circulo.draw();
        System.out.println();

        // Redimensionar las formas
        System.out.println("=== REDIMENSIONANDO FORMAS ===");
        rectangulo.resize(1.5);
        rectangulo.draw();
        System.out.println();
        circulo.resize(0.75);
        circulo.draw();
        System.out.println();

        // Mover las formas
        System.out.println("=== MOVIENDO FORMAS ===");
        rectangulo.mover(15, 25);
        circulo.mover(45, 50);
        System.out.println();

        // polimorfismo
        System.out.println("=== DEMOSTRACIÓN DE POLIMORFISMO ===");
        Shape2D[] formas = new Shape2D[2];
        formas[0] = rectangulo;
        formas[1] = circulo;

        for (int i = 0; i < formas.length; i++) {
            System.out.println("Forma " + (i+1) + ": " + formas[i]);
            formas[i].draw();
            System.out.println();
        }



    }
}