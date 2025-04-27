package clase.Yobjetos;

public class Rectangle extends Shape2D{

    private double ancho;
    private double alto;

    // Constructor
    public Rectangle(String color, int posicionX, int posicionY, double ancho, double alto) {
        super(color, posicionX, posicionY);
        this.ancho = ancho;
        this.alto = alto;
    }

    // Getters y setters
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    // Método para calcular el área
    public double calcularArea() {
        return ancho * alto;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    //  métodos abstractos
    @Override
    public void draw() {
        if (visible) {
            System.out.println("Dibujando un rectángulo " + color + " en la posición (" +
                    posicionX + ", " + posicionY + ")");
            System.out.println("Dimensiones: " + ancho + " x " + alto);
            System.out.println("Área: " + calcularArea() + ", Perímetro: " + calcularPerimetro());

            // Representación ASCII simple del rectángulo
            System.out.println("Representación:");
            int anchoPrint = (int) Math.min(ancho, 20); // Limitamos el tamaño para la consola
            int altoPrint = (int) Math.min(alto, 10);

            for (int i = 0; i < altoPrint; i++) {
                for (int j = 0; j < anchoPrint; j++) {
                    if (i == 0 || i == altoPrint - 1 || j == 0 || j == anchoPrint - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("El rectángulo no es visible actualmente.");
        }
    }

    @Override
    public void resize(double factor) {
        double anchoAnterior = ancho;
        double altoAnterior = alto;

        this.ancho *= factor;
        this.alto *= factor;

        System.out.println("Rectángulo redimensionado:");
        System.out.println("- Ancho: " + anchoAnterior + " -> " + ancho);
        System.out.println("- Alto: " + altoAnterior + " -> " + alto);
        System.out.println("- Factor de escala: " + factor);
    }

    @Override
    public String toString() {
        return "Rectángulo [color=" + color + ", posición=(" + posicionX + ", " + posicionY +
                "), ancho=" + ancho + ", alto=" + alto +
                ", área=" + calcularArea() + ", perímetro=" + calcularPerimetro() + "]";
    }
}

