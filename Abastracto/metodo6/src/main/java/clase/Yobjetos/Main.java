package clase.Yobjetos;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 2023, 4, "Gasolina");
        Motocicleta moto = new Motocicleta("Honda", "CBR", 2022, 600, "Deportiva");

        //  información inicial
        System.out.println("=== VEHÍCULOS CREADOS ===");
        System.out.println(coche);
        System.out.println(moto);
        System.out.println();

        //  métodos con el coche
        System.out.println("=== PROBANDO COCHE ===");
        coche.startEngine();
        System.out.println("Estado del coche: " + (coche.isMotorEncendido() ? "Encendido" : "Apagado"));
        coche.abrirMaletero();
        coche.stopEngine();
        System.out.println();

        //  métodos con la motocicleta
        System.out.println("=== PROBANDO MOTOCICLETA ===");
        moto.startEngine();
        System.out.println("Estado de la moto: " + (moto.isMotorEncendido() ? "Encendida" : "Apagada"));
        moto.hacerCaballito();
        moto.stopEngine();
        System.out.println();

        // polimorfismo
        System.out.println("=== DEMOSTRACIÓN DE POLIMORFISMO ===");
        Vehiculo[] vehiculos = new Vehiculo[2];
        vehiculos[0] = coche;
        vehiculos[1] = moto;

        for (Vehiculo v : vehiculos) {
            System.out.println(v);
            v.startEngine();
            System.out.println(v);
            v.stopEngine();
            System.out.println();
        }
    }
}
