package clase.Yobjetos;

class Cube extends Shape3D {
    private float side;

    // Constructor
    public Cube(float side) {
        this.side = side;
    }

    // Getter y setter
    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    // Implementación de los métodos abstractos
    @Override
    public float calculateVolume() {
        // Fórmula del volumen de un cubo: lado³
        return side * side * side;
    }

    @Override
    public float calculateSurfaceArea() {
        // Fórmula del área superficial de un cubo: 6 * lado²
        return 6.0f * side * side;
    }

    @Override
    public String toString() {
        return "Cubo [lado=" + side +
                ", volumen=" + calculateVolume() +
                ", área superficial=" + calculateSurfaceArea() + "]";
    }
}