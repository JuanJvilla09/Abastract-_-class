package clase.Yobjetos;

class Sphere extends Shape3D {
    private float radius;

    // Constructor
    public Sphere(float radius) {
        this.radius = radius;
    }

    // Getter y setter
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    // Implementación de los métodos abstractos
    @Override
    public float calculateVolume() {
        // Fórmula del volumen de una esfera: (4/3) * π * r³
        return (4.0f / 3.0f) * (float)Math.PI * radius * radius * radius;
    }

    @Override
    public float calculateSurfaceArea() {
        // Fórmula del área superficial de una esfera: 4 * π * r²
        return 4.0f * (float)Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Esfera [radio=" + radius +
                ", volumen=" + calculateVolume() +
                ", área superficial=" + calculateSurfaceArea() + "]";
    }
}