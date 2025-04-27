package clase.Yobjetos;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = {
                new Lion(),
                new Tiger(),
                new Deer()
        };


        for (Animal a : zoo) {
            System.out.println("----- " + a.getClass().getSimpleName() + " -----");
            a.eat();
            a.sleep();
            System.out.println();
        }
    }
}


