package clase.Yobjetos;

public class Circle extends Shape2D{

    private double radio;

    // Constructor
    public Circle(String color, int posicionX, int posicionY, double radio) {
        super(color, posicionX, posicionY);
        this.radio = radio;
    }

    // Getters y setters
    public double getRadio() {
        return radio;
    }

    // Método para calcular el área
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro (circunferencia)
    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    // Implementación de los métodos abstractos
    @Override
    public void draw() {
        if (visible) {
            System.out.println("Dibujando un círculo " + color + " en la posición (" +
                    posicionX + ", " + posicionY + ")");
            System.out.println("Radio: " + radio);
            System.out.println("Área: " + String.format("%.2f", calcularArea()) +
                    ", Circunferencia: " + String.format("%.2f", calcularCircunferencia()));

            // Representación ASCII simple del círculo
            System.out.println("Representación:");
            int diametro = (int) Math.min(2 * radio, 20); // Limitamos el tamaño para la consola

            for (int i = 0; i < diametro; i++) {
                for (int j = 0; j < diametro; j++) {
                    double distancia = Math.sqrt(Math.pow(i - diametro/2.0, 2) +
                            Math.pow(j - diametro/2.0, 2));
                    if (Math.abs(distancia - diametro/2.0) < 0.5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("El círculo no es visible actualmente.");
        }
    }

    @Override
    public void resize(double factor) {
        double radioAnterior = radio;

        this.radio *= factor;

        System.out.println("Círculo redimensionado:");
        System.out.println("- Radio: " + radioAnterior + " -> " + radio);
        System.out.println("- Factor de escala: " + factor);
    }

    @Override
    public String toString() {
        return "Círculo [color=" + color + ", posición=(" + posicionX + ", " + posicionY +
                "), radio=" + radio +
                ", área=" + String.format("%.2f", calcularArea()) +
                ", circunferencia=" + String.format("%.2f", calcularCircunferencia()) + "]";
    }



}
