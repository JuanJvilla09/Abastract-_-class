package clase.Yobjetos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class Empleado {
    protected int idEmpleado;
    protected String nombre;
    protected LocalDate fechaInicio;
    protected int numHorasTrabajadas;
    protected int salario;

    public Empleado(int idEmpleado, String nombre, String fechaInicio) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.fechaInicio = LocalDate.parse(fechaInicio, fmt);
    }

    // Métodos abstractos
    public abstract int calculateSalary(int idEmpleado, int numHorasTrab, int valorHora);
    public abstract void displayInfo();
}




