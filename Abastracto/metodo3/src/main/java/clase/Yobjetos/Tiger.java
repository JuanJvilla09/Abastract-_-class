package clase.Yobjetos;

public class Tiger extends Animal {

    public Tiger() {
    }


    @Override
    public void eat() {
        System.out.println("El tigre caza sigilosamente y se alimenta.");
    }

    @Override
    public void sleep() {
        System.out.println("El tigre duerme en un lugar oculto entre la maleza.");
    }
}
