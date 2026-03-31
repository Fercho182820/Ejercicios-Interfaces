package UNAM.ICO.Empleado;

public class EmpleadoMedioTiempo extends EmpleadoBase implements Empleado {

    public EmpleadoMedioTiempo() {
    }

    public EmpleadoMedioTiempo(String nombre, int numEmpleado, String cargo, int horasTrabajadas, int horasExtras, int horasBase, double salarioHorasExtras, double salarioBase) {
        super(nombre, numEmpleado, cargo, horasTrabajadas, horasExtras, horasBase, salarioHorasExtras, salarioBase);
    }

    @Override
    public String toString() {
        return "EmpleadoMedioTiempo{" +
                "salarioBase=" + salarioBase +
                ", salarioHorasExtras=" + salarioHorasExtras +
                ", salarioFinal=" + salarioFinal +
                ", horasBase=" + horasBase +
                ", horasExtras=" + horasExtras +
                ", horasTrabajadas=" + horasTrabajadas +
                ", cargo='" + cargo + '\'' +
                ", numEmpleado=" + numEmpleado +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }
}
