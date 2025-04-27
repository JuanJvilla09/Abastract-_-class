package clase.Yobjetos;

class Manager extends Empleado {
    public Manager(int idEmpleado, String nombre, String fechaInicio) {
        super(idEmpleado, nombre, fechaInicio);
    }

    @Override
    public int calculateSalary(int idEmpleado, int numHorasTrab, int valorHora) {
        this.idEmpleado = idEmpleado;
        this.numHorasTrabajadas = numHorasTrab;
        this.salario = numHorasTrab * valorHora + 500;
        return this.salario;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Información Manager ---");
        System.out.println("ID: " + idEmpleado);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Horas trabajadas: " + numHorasTrabajadas);
        System.out.println("Salario calculado: " + salario);
    }
}