package clase.Yobjetos;

public abstract class Pajaro {
        protected String nombre;
        protected double envergaduraAlas; // En metros
        protected String colorPlumaje;
        protected double peso; // En kilogramos

        // Constructor
        public Pajaro(String nombre, double envergaduraAlas, String colorPlumaje, double peso) {
            this.nombre = nombre;
            this.envergaduraAlas = envergaduraAlas;
            this.colorPlumaje = colorPlumaje;
            this.peso = peso;
        }

        // Getters
        public String getNombre() {
            return nombre;
        }

        public double getEnvergaduraAlas() {
            return envergaduraAlas;
        }

        public String getColorPlumaje() {
            return colorPlumaje;
        }

        public double getPeso() {
            return peso;
        }

        // Método común para todos los pájaros
        public void comer(String alimento) {
            System.out.println(nombre + " está comiendo " + alimento);
        }

        // Métodos abstractos
        public abstract void volar();
        public abstract void hacerSonido();

        // Método toString
        @Override
        public String toString() {
            return "Pájaro: " + nombre + " - Envergadura: " + envergaduraAlas +
                    "m, Color: " + colorPlumaje + ", Peso: " + peso + " kg";
        }
}
