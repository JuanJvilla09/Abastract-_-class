package clase.Yobjetos;

public class Main {
    public static void main(String[] args) {
        // Instancia Manager
        Manager mgr = new Manager(1, "Ana Pérez", "2022-01-15");
        int salarioMgr = mgr.calculateSalary(1, 160, 50); // 160 horas a 50 por hora
        mgr.displayInfo();

        // Instancia Programmer
        Programmer dev = new Programmer(2, "Juan Gómez", "2023-03-01");
        int salarioDev = dev.calculateSalary(2, 170, 40); // 170 horas a 40 por hora
        dev.displayInfo();


    }
}