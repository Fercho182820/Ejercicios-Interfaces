package UNAM.ICO.Empleado;

public class EmpleadoBase implements Empleado{
    protected String nombre;
    protected int numEmpleado;
    protected String cargo;
    protected int horasTrabajadas;
    protected int horasExtras;
    protected int horasBase;
    protected double salarioFinal;
    protected double salarioHorasExtras;
    protected double salarioBase;

    public EmpleadoBase() {
    }

    public EmpleadoBase(String nombre, int numEmpleado, String cargo, int horasTrabajadas, int horasExtras, int horasBase, double salarioHorasExtras, double salarioBase) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.cargo = cargo;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
        this.horasBase = horasBase;
        this.salarioHorasExtras = salarioHorasExtras;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getHorasBase() {
        return horasBase;
    }

    public void setHorasBase(int horasBase) {
        this.horasBase = horasBase;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public double getSalarioHorasExtras() {
        return salarioHorasExtras;
    }

    public void setSalarioHorasExtras(double salarioHorasExtras) {
        this.salarioHorasExtras = salarioHorasExtras;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "EmpleadoBase{" +
                "nombre='" + nombre + '\'' +
                ", numEmpleado=" + numEmpleado +
                ", cargo='" + cargo + '\'' +
                ", horasTrabajadas=" + horasTrabajadas +
                ", horasExtras=" + horasExtras +
                ", horasBase=" + horasBase +
                ", salarioFinal=" + salarioFinal +
                ", salarioHorasExtras=" + salarioHorasExtras +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public double calcularSalario() {
        if(horasTrabajadas > horasBase){
            salarioFinal = salarioBase + (horasExtras * salarioHorasExtras);
            System.out.println("Tu salario es " + salarioFinal);
        }
        return 0;
    }
}
