package clase.Yobjetos;

public class Main {
    public static void main(String[] args) {
        Sphere esfera = new Sphere(5.0f);
        System.out.println("== Información de la Esfera ==");
        System.out.println("Radio: " + esfera.getRadius());
        System.out.println("Volumen: " + esfera.calculateVolume());
        System.out.println("Área superficial: " + esfera.calculateSurfaceArea());

        // Instanciar un cubo con lado 4
        Cube cubo = new Cube(4.0f);
        System.out.println("\n== Información del Cubo ==");
        System.out.println("Lado: " + cubo.getSide());
        System.out.println("Volumen: " + cubo.calculateVolume());
        System.out.println("Área superficial: " + cubo.calculateSurfaceArea());

        // Demostrar polimorfismo
        System.out.println("\n== Demostración de polimorfismo ==");
        Shape3D[] shapes = new Shape3D[2];
        shapes[0] = esfera;
        shapes[1] = cubo;

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Figura " + (i+1) + ":");
            System.out.println("  Volumen: " + shapes[i].calculateVolume());
            System.out.println("  Área superficial: " + shapes[i].calculateSurfaceArea());
        }

        // Cambiar valores y volver a calcular
        System.out.println("\n== Recálculo con nuevos valores ==");
        esfera.setRadius(7.5f);
        cubo.setSide(6.0f);

        System.out.println(esfera);
        System.out.println(cubo);
    }
}