package clase.Yobjetos;

public class Lion extends Animal {

    public Lion() {
    }

    @Override
    public void eat() {
        System.out.println("El león devora su presa con fuerza.");
    }

    @Override
    public void sleep() {
        System.out.println("El león duerme plácidamente en la sabana.");
    }
}
