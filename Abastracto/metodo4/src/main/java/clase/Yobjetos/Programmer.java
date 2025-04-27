package clase.Yobjetos;

class Programmer extends Empleado {
    public Programmer(int idEmpleado, String nombre, String fechaInicio) {
        super(idEmpleado, nombre, fechaInicio);
    }

    @Override
    public int calculateSalary(int idEmpleado, int numHorasTrab, int valorHora) {

        this.idEmpleado = idEmpleado;
        this.numHorasTrabajadas = numHorasTrab;
        this.salario = numHorasTrab * valorHora;
        return this.salario;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Información Programmer ---");
        System.out.println("ID: " + idEmpleado);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Horas trabajadas: " + numHorasTrabajadas);
        System.out.println("Salario calculado: " + salario);
    }
}