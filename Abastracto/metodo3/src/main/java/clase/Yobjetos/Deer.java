package clase.Yobjetos;

public class Deer extends Animal {
    public Deer() {
    }

    @Override
    public void eat() {
        System.out.println("El ciervo pacientemente come hojas y pasto.");
    }

    @Override
    public void sleep() {
        System.out.println("El ciervo duerme ligero, siempre alerta a posibles depredadores.");
    }
}