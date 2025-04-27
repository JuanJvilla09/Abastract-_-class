package clase.Yobjetos;

public class Main {
    public static void main(String[] args) {
        Forma circle = new Circle(5.0);
        System.out.printf("Círculo (radio = %.2f):\n", ((Circle) circle).getRadius());
        System.out.printf("  Área = %.4f\n", circle.calculateArea());
        System.out.printf("  Perímetro = %.4f\n\n", circle.calculatePerimeter());

        // Instanciamos un triángulo con lados 3, 4 y 5
        Forma triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.printf("Triángulo (lados = %.1f, %.1f, %.1f):\n",
                ((Triangle) triangle).getA(),
                ((Triangle) triangle).getB(),
                ((Triangle) triangle).getC());
        System.out.printf("  Área = %.4f\n", triangle.calculateArea());
        System.out.printf("  Perímetro = %.4f\n", triangle.calculatePerimeter());
    }
}
