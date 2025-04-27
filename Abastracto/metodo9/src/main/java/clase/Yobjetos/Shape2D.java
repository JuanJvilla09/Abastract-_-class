package clase.Yobjetos;

public abstract class Shape2D {
    protected String color;
    protected int posicionX;
    protected int posicionY;
    protected boolean visible;

    // Constructor
    public Shape2D(String color, int posicionX, int posicionY) {
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.visible = true;
    }

    // Getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    // Método para mover la forma
    public void mover(int nuevaX, int nuevaY) {
        this.posicionX = nuevaX;
        this.posicionY = nuevaY;
        System.out.println("Forma movida a la posición (" + posicionX + ", " + posicionY + ")");
    }

    // Métodos abstractos
    public abstract void draw();
    public abstract void resize(double factor);

    // Método toString
    @Override
    public String toString() {
        return "Forma 2D [color=" + color + ", posición=(" + posicionX + ", " + posicionY +
                "), visible=" + visible + "]";
    }
}
